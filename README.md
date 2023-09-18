# Unibet Blog Search Automation

This project is an automation framework developed to test the search functionality of the [Unibet blog website](https://www.unibet.co.uk/blog). The framework is designed to perform tests on both mobile web and normal web channels. It utilizes Java, Selenium WebDriver, TestNG, Maven as the build tool, and Appium for mobile automation. The project also incorporates the Logback logging framework for error and event logging.

## Project Structure

### Configuration
- `logback.xml` (src/main/resources/logback.xml): This configuration file sets up Logback for logging.

### Page Objects
- `UnibetBlogPage.java` (src/main/java/unibet/pages/UnibetBlogPage.java): This class contains the page objects and methods specific to the Unibet blog page. It defines locators for search input, search result text, and no results message. It also includes methods for performing searches and retrieving search-related information.

### Test Classes
#### Normal Web Channel
- `BaseTest.java` (src/test/java/unibet/test/BaseTest.java): This test class is the base class for normal web channel tests. It initializes the WebDriver, navigates to the Unibet blog page, maximizes the browser window, and sets an implicit wait.
- `SearchTest.java` (src/test/java/unibet/test/SearchTest.java): This test class contains normal web channel tests for the search functionality. It includes test cases similar to those in MobileSearchTest.

#### Mobile Web Channel
- `MobileBaseTest.java` (src/test/java/unibet/test/MobileBaseTest.java): This test class is the base class for mobile web channel tests. It sets up the Appium server, initializes the AndroidDriver, launches the mobile web application, and sets up an implicit wait.
- `MobileSearchTest.java` (src/test/java/unibet/test/MobileSearchTest.java): This test class contains mobile web channel tests for the search functionality. It includes test cases for the happy flow with matching string, unhappy flow with no results found, and searching with special characters.

## Setup and Execution

To execute the tests, follow these steps:

1. Clone the project repository to your local machine.

2. Ensure you have the following prerequisites installed:
   - IntelliJ or Eclipse IDE
   - Maven
   - TestNG or Cucumber-JVM
   - Appium with Android Virtual Device (AVD)

3. Open the project in your preferred IDE.

4. Configure the WebDriverManager or specify the path to your ChromeDriver in `BaseTest.java` if needed.

5. Update the device name and other desired capabilities in `MobileBaseTest.java` to match your AVD configuration.

6. Run the tests using TestNG or Cucumber-JVM using the `testng.xml` file or appropriate test runner.

## Test Cases Covered

### Normal Web Channel (SearchTest.java)

1. **Happy Flow with Matching String**: Perform a search for a query with expected results and validate the search results message.

2. **Unhappy Flow with No Results Found**: Perform a search with an unlikely query to simulate no results found and validate the error message.

3. **Search with Special Characters**: Perform a search with special characters as the query and validate the error message.

### Mobile Web Channel (MobileSearchTest.java)

1. **Happy Flow with Matching String**: Perform a search for a query with expected results and validate the search results message.

2. **Unhappy Flow with No Results Found**: Perform a search with an unlikely query to simulate no results found and validate the error message.

3. **Search with Special Characters**: Perform a search with special characters as the query and validate the error message.

## Future Enhancements

If more time were available for this project, the following enhancements could be considered:

1. **Cross-browser Testing**: Extend the automation to cover multiple browsers (e.g., Firefox, Edge) for better browser compatibility.

2. **Parameterization**: Implement data-driven testing to test different search queries, expected results, and edge cases.

3. **Parallel Execution**: Configure the framework to run tests in parallel for faster execution and improved test coverage.

4. **Reporting**: Integrate a reporting tool (e.g., ExtentReports, Allure) to generate detailed test reports with screenshots and logs for better test result visibility.

5. **Test Data Management**: Implement a test data management strategy, including data generation, provisioning, and cleanup for more complex test scenarios.

6. **Page Object Model (POM) Refinement**: Refactor and enhance the Page Object Model to make it more robust and maintainable as the application evolves.

7. **CI/CD Integration**: Integrate the automation tests into a continuous integration/continuous deployment (CI/CD) pipeline for automated regression testing.

8. **API Testing**: Add API automation tests to cover backend functionality and ensure end-to-end test coverage.

9. **Performance Testing**: Consider incorporating performance testing tools (e.g., JMeter) to evaluate the website's performance under different loads.

## Conclusion

This test automation project demonstrates the automation of key search functionality test cases for the Unibet blog website, covering both normal web and mobile web channels. The framework is designed for maintainability, scalability, and ease of execution. Future enhancements can further improve test coverage and reporting capabilities.

