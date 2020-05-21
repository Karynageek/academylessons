package org.academy.web.pages;

import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver, false, "");
    }

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passField;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='container-lg px-2']")
    private WebElement errorMessage;

    public LoginPage fillLoginField(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public LoginPage fillPassField(String pass) {
        passField.sendKeys(pass);
        return this;
    }

    public HomePage clickOnSubmit() {
        submitButton.click();
        return new HomePage(webDriver, false,"");
    }

    public BasePage clickOnSignIn() {
        return new BasePage(webDriver);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}