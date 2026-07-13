# SauceDemo Automation Testing

## Project Overview
This project automates the SauceDemo web application using Selenium WebDriver with Java, TestNG, and Maven. The project follows the Page Object Model (POM) design pattern.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- VS Code

## Project Structure
src/
├── main/java/com/saucedemo/pages
│   ├── BasePage.java
│   ├── LoginPage.java
│   └── ProductsPage.java
├── main/java/com/saucedemo/utils
│   └── DriverFactory.java
└── test/java/tests
    └── LoginTest.java

## Test Scenario
- Open SauceDemo website
- Login with valid credentials
- Add Backpack product to cart
- Open cart
- Verify product name
- Checkout
- Enter customer details
- Complete the order
- Verify successful order message

## How to Run
1. Clone the repository.
2. Open the project in VS Code.
3. Run:
   mvn test
## Author
Resaba 

## Author
Resaba
  
