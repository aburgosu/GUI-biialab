package com.foundation.gui.biialab.ui.pages;


import com.foundation.gui.biialab.common.ReadAppProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the login to Page.
 *
 * @author Andres Burgos
 * @version 1.0
 */
public class Login extends Base {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(css = "#SubmitLogin > span")
    private WebElement submitLoginButton;

    /**
     * This method is used to get the user and password from the properties file
     * set the fields and login in to account.
     *
     * @param user  The parameter user defines a user.
     * @param password The password email defines a password.
     */
    public void login(final String user, final String password) {
        emailField.sendKeys(ReadAppProperties.getInstance().getProperty(user));
        passwordField.sendKeys(ReadAppProperties.getInstance().getProperty(password));
        submitLoginButton.click();

    }
}
