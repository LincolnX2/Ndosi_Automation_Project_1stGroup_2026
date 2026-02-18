SELENIUM AUTOMATION PROJECT

USING @TESTNG FRAMEWORK 

The Selenium Browser Automation Project
Selenium is an umbrella project for a range of tools and libraries that enable and support the automation of web browsers.

It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification that lets you write interchangeable code for all major web browsers.

This project is made possible by volunteer contributors who have put in thousands of hours of their own time, and made the source code freely available for anyone to use, enjoy, and improve.

Selenium brings together browser vendors, engineers, and enthusiasts to further an open discussion around automation of the web platform. The project organises an annual conference to teach and nurture the community.

At the core of Selenium is WebDriver, an interface to write instruction sets that can be run interchangeably in many browsers. Once you’ve installed everything, only a few lines of code get you inside a browser. You can find a more comprehensive example in Writing your first Selenium script.

//PAGE OBJECT MODEL & PAGE FACTORY IN SELENIUM

POM is a design pattern in Selenium that separates page-specific UI elements and actions into dedicated classes. It helps create clean, readable, and modular automation frameworks.

Purpose: The purpose of POM in Selenium is to organize UI elements and actions into dedicated page classes, making tests easier to maintain and protecting them from frequent UI changes.

Implementation 

Create one class per webpage (LoginPage, HomePage, etc.).
Store web elements as variables and user actions as methods.
Instantiate page classes inside test scripts.
Keep locators and business logic separate from test logic.
Page Factory is an enhanced version of POM that uses annotations to initialize and manage UI elements more efficiently.

Purpose: The purpose of Page Factory is to simplify element initialization in POM using annotations like @FindBy, reducing boilerplate code and making page classes more readable and efficient.

Implementation 

Use @FindBy to define elements in the page class.
Initialize elements using PageFactory.initElements(driver, this).
Write action methods that interact with these elements.
Call page methods directly in test scripts.
Example: LoginPage.java


import org.openqa.selenium.*;

import org.openqa.selenium.support.*;



public class LoginPage {



    @FindBy(id = "username") WebElement user;

    @FindBy(id = "password") WebElement pass;

    @FindBy(id = "loginBtn") WebElement login;



    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }



    public void login(String u, String p) {

        user.sendKeys(u);

        pass.sendKeys(p);

        login.click();

    }

}


Key Concepts in POM
The Page Object Model follows a structured approach that revolves around key components such as Page Classes, Locators, and Methods. Understanding these concepts is essential for building efficient and maintainable test automation frameworks.

Page Classes

Each web page in the application is represented by a separate class file in the Page Object Model. This class acts as a container for the page’s web elements and related actions. By organizing pages into distinct classes, POM keeps the test code clean and easy to maintain.

Locators in POM

Locators define how to identify web elements on a page. POM uses locators such as ID, name, XPath, CSS selectors, or other strategies to map elements in the page classes. This centralized approach makes updating locators easier when the UI changes.

Methods in POM

Methods are functions within the page classes that perform actions on the page’s elements. These methods abstract user interactions such as clicking a button, entering text, or retrieving page data. Test scripts can call these methods to perform actions, improving code readability and reusability.

Platforms like BrowserStack further streamline POM-based automation by enabling testers to execute tests on real browsers and devices without the need for complex local setups.

This allows teams to focus on writing clean, maintainable code while ensuring cross-browser and cross-device compatibility at scale.


