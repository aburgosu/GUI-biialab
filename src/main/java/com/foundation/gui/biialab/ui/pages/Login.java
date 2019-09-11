package com.foundation.gui.biialab.ui.pages;


import com.foundation.gui.biialab.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends Base {

    @FindBy(css = ".btn-login")
    private WebElement loginButton;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement emailField;

    @FindBy(css = "input[placeholder='Contraseña']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitLoginButton;

    public void login(String user, String password) {
        WebDriver driver = super.getWebDriver();
        driver.get(ReadAppProperties.getInstance().getProperty("url_login"));
        loginButton.click();
        passwordField.sendKeys(ReadAppProperties.getInstance().getProperty(password));
        emailField.sendKeys(ReadAppProperties.getInstance().getProperty(user));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        submitLoginButton.click();
    }
}
