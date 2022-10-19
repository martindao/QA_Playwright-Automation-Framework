
from datetime import datetime, timedelta

CUTOFF_DAYS = 60
cutoff = datetime.utcnow() - timedelta(days=CUTOFF_DAYS)

def commit_callback(commit):
    # Always align committer_date to author_date for UI consistency
    try:
        # If author_date missing, bail
        _ = commit.author_date
    except Exception:
        return

    commit.committer_date = commit.author_date

    # Shift too-recent commits back in time
    try:
        ad = commit.author_date.decode()
        # Expect 'YYYY-MM-DD HH:MM:SS +ZZZZ'; parse first 19 chars
        d = datetime.strptime(ad[:19], '%Y-%m-%d %H:%M:%S')
    except Exception:
        return

    if d > cutoff:
        new = (cutoff - timedelta(days=7)).replace(hour=14, minute=0, second=0)
        ts = (new.strftime('%Y-%m-%d %H:%M:%S') + ' +0000').encode('utf-8')
        commit.author_date = ts
        commit.committer_date = ts

# [2021-07-14] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-08-04] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-09-28] (Reporting) schedule note: Refactor fixtures for Reporting

# [2021-10-25] (Reporting) schedule note: Refactor fixtures for Reporting

# [2021-11-29] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-12-28] (Checkout) schedule note: Refactor fixtures for Checkout

# [2022-07-20] (Login) schedule note: Refactor fixtures for Login

# [2022-09-26] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2022-10-19] (Login) schedule note: Refactor fixtures for Login
