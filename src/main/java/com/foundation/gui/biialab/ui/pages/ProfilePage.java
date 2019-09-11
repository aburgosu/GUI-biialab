package com.foundation.gui.biialab.ui.pages;

import com.foundation.gui.biialab.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the email to Page.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public class ProfilePage extends Base {
    @FindBy(css = "input[name='email']")
    private WebElement email;

    /**
     * This method get the name of user on email page.
     *
     * @return a String with name the user.
     */
    public String getEmail() {
        return email.getText();
    }
}
