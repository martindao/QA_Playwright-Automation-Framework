# Playwright Automation Framework

A comprehensive Playwright automation framework for end-to-end testing of web applications.

## Features
- **Cross-Browser Testing**: Support for Chromium, Firefox, and Safari
- **Mobile Testing**: Mobile device simulation and testing
- **API Testing**: RESTful API testing capabilities
- **Visual Testing**: Screenshot comparison and visual regression testing
- **Performance Testing**: Web performance metrics and monitoring
- **Accessibility Testing**: Automated a11y compliance checking
- **Checkout Flow Testing**: Specialized e-commerce checkout validation

## Framework Structure

```
tests/
├── e2e/              # End-to-end test suites
├── api/              # API testing modules
├── visual/           # Visual regression tests
├── performance/      # Performance testing
├── accessibility/    # A11y compliance tests
├── checkout/         # E-commerce checkout flows
└── utils/            # Test utilities and helpers
```

## Test Suites

- **Checkout Flow**: Comprehensive e-commerce checkout testing
- **Cross-Browser Validation**: Multi-browser compatibility testing
- **Mobile Responsiveness**: Mobile device testing
- **Performance Metrics**: Load time and performance monitoring
- **Accessibility Compliance**: WCAG compliance validation

## Usage

Run all tests:
```bash
npm test
```

Run specific test suites:
```bash
npm run test:checkout
npm run test:api
npm run test:visual
npm run test:performance
npm run test:a11y
```

Debug mode:
```bash
npm run test:debug
```

## Configuration

Playwright configuration in `playwright.config.ts`:
```typescript
import { defineConfig } from '@playwright/test';

export default defineConfig({
  testDir: './tests',
  fullyParallel: true,
  forbidOnly: !!process.env.CI,
  retries: process.env.CI ? 2 : 0,
  workers: process.env.CI ? 1 : undefined,
  reporter: 'html',
  use: {
    baseURL: 'http://localhost:3000',
    trace: 'on-first-retry',
  },
});
```

## Dependencies

- @playwright/test
- @playwright/api
- @axe-core/playwright
- lighthouse
- puppeteer-core

## Best Practices

1. **Page Object Model**: Use POM for maintainable test code
2. **Data-Driven Testing**: Parameterize tests with different datasets
3. **Parallel Execution**: Leverage Playwright's parallel testing capabilities
4. **Visual Testing**: Include screenshot comparisons for UI changes
5. **Performance Monitoring**: Track performance metrics over time

## Contributing

1. Fork the repository
2. Create a feature branch
3. Write tests for new functionality
4. Ensure all tests pass
5. Submit a pull request

## CI/CD Integration

The framework integrates with popular CI/CD platforms:
- GitHub Actions
- GitLab CI
- Jenkins
- Azure DevOps

Example GitHub Actions workflow:
```yaml
name: Playwright Tests
on: [push, pull_request]
jobs:
  test:
    timeout-minutes: 60
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v4
    - uses: actions/setup-node@v4
      with:
        node-version: 18
    - name: Install dependencies
      run: npm ci
    - name: Install Playwright
      run: npx playwright install --with-deps
    - name: Run Playwright tests
      run: npx playwright test
    - uses: actions/upload-artifact@v4
      if: always()
      with:
        name: playwright-report
        path: playwright-report/
        retention-days: 30
```

- [2021-07-16] (Catalog) schedule note: Add Playwright regression scenario for Catalog

- [2021-09-02] (Login) schedule note: Tighten Allure reporting around Login

- [2021-09-29] (Catalog) schedule note: Refactor fixtures for Catalog

- [2021-10-26] (Login) schedule note: Document Playwright coverage for Login

- [2021-11-30] (Catalog) schedule note: Add Playwright regression scenario for Catalog

- [2021-12-28] (Login) schedule note: Add Playwright regression scenario for Login

- [2022-09-01] (Login) schedule note: Add Playwright regression scenario for Login

- [2022-09-27] (Checkout) schedule note: Tighten Allure reporting around Checkout

- [2022-10-20] (Catalog) schedule note: Tighten Allure reporting around Catalog

- [2022-11-22] (Login) schedule note: Add Playwright regression scenario for Login

- [2022-12-19] (Reporting) schedule note: Tighten Allure reporting around Reporting
