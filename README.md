# my-maven-app

This repository is a Java-based Selenium automation project built with Maven. It contains a collection of UI automation examples and test cases for practicing browser interactions, form handling, dynamic elements, and test execution flows.

## Overview

The project is organized as a Maven Java application with:

- `src/main/java` for Java classes and page-object style examples
- `src/test/java` for test cases and framework setup
- `pom.xml` for dependencies and build configuration
- `testng.xml` for test suite configuration
- `test-output` for generated test reports

## Tech Stack

- Java
- Maven
- Selenium WebDriver
- WebDriverManager
- JUnit / TestNG-style test execution patterns

## Prerequisites

Before running the project, make sure you have:

- Java JDK 8 or newer
- Maven installed and available in PATH
- A supported browser installed (for example Chrome or Firefox)
- Internet access for WebDriverManager to download browser drivers automatically

## Project Structure

```text
my-maven-app/
├── pom.xml
├── testng.xml
├── src/
│   ├── main/java/
│   └── test/java/
├── target/
├── test-output/
├── .classpath
├── .project
└── README.md
```

## Running the Tests

From the project root, run:

```bash
mvn test
```

To run a specific test suite or configuration:

```bash
mvn test -Dtest=YourTestClass
```

If you want to use the XML suite configuration:

```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

## Building the Project

```bash
mvn clean package
```

## Notes

This repository appears to be a learning/demo automation project, with multiple Java classes focused on Selenium interactions such as:

- form input and field automation
- button and dropdown handling
- waiting and synchronization
- alerts and pop-ups
- browser and element interactions

## Useful Resources

- [Maven](https://maven.apache.org/)
- [Selenium Java](https://www.selenium.dev/documentation/webdriver/)
- [WebDriverManager](https://bonigarcia.dev/webdrivermanager/)

## License

This project does not currently include a license file. If you plan to share or distribute it publicly, add an appropriate open-source license.
