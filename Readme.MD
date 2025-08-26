# InspiredTesting

automation testing framework built using **Selenium WebDriver**, **Cucumber BDD**, **TestNG**, and **RestAssured**. The framework allows you to write readable, maintainable, and scalable automation tests with feature files and step definitions. It also generates HTML reports for test execution results.

---

## Features

- Behavior Driven Development (BDD) using Cucumber.
- Test execution using TestNG.
- Selenium WebDriver with WebDriverManager for browser management.
- API testing support using RestAssured.
- Cucumber HTML and JSON reporting.


---

## Project Structure

InspiredTesting/
├── src/
│ ├── main/
│ │ └── java/ ← Production code (optional)
│ └── test/
│ ├── java/
│ │ ├── cucumber/
│ │ │ └── TestRunner.java
│ │ └── frontendautomation/
│ │ └── steps/
│ │ └── Checkout.java
│ └── resources/
│ └── features/
│ └── checkout.feature
├── testng.xml
└── pom.xml

## Prerequisites

- Java 17 or higher
- Maven 3.6+


---

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- Chrome or Firefox installed

---

## Installation

1. Clone the repository:

```bash
git clone https://github.com/yourusername/InspiredTesting.git
cd InspiredTesting

Install dependencies:
mvn clean install

From IntelliJ: Right-click testng.xml → Run

Basic Cucumber HTML report: target/cucumber-reports/cucumber.html

Dependencies:

Selenium Java 4.35.0
TestNG 7.11.0
Cucumber Java 7.27.2
Cucumber TestNG 7.27.2
WebDriverManager 6.2.0
RestAssured 5.5.6
Maven Cucumber Reporting 5.5.0