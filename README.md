# Playwright Automation Framework

## Overview
This repository provides a Java-based Playwright test suite (Gradle + TestNG/JUnit style) that covers catalog, checkout, login, and reporting flows. It supports Allure reporting, parallel execution, and automation history that spans 2021–2023.

## Repository Layout
- src/main/java/com/martindao/ – configuration, page objects, fixtures, reporting helpers.
- src/test/java/com/martindao/tests/ – Playwright regression suites per domain.
- gradle/, uild.gradle, settings.gradle – build configuration.
- gradlew, gradlew.bat – wrapper scripts for consistent builds.

## Environment Setup
1. Install JDK 17+.
2. Ensure Node.js is available (Playwright downloads browsers via npm).
3. Install dependencies:
   `powershell
   ./gradlew playwrightInstall
   `

## Running Workflows
- Full regression:
  `powershell
  ./gradlew clean test
  `
- Focused suite:
  `powershell
  ./gradlew test --tests *Checkout*
  `
- Generate Allure report:
  `powershell
  ./gradlew allureReport
  `

## Quality & Automation
- Apply formatting and static analysis with ./gradlew spotlessApply or ./gradlew check (configure as needed).
- Keep Allure configuration aligned with src/main/java/com/martindao/report/AllureManager.java when adding new suites.
- Respect the OpenSpec window (2021-07-14 ? 2023-11-20) for future backfill commits.
