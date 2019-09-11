package com.foundation.gui.biialab.ui.pages;

import com.foundation.gui.biialab.common.ReadAppProperties;
import com.foundation.gui.core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to navigate the website.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public class PageTransporter {
    private static WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();;

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToUrl(String url) {
        webDriver.navigate().to(url);
        webDriver.get(url);
    }

    /**
     * This method is used for go to login page.
     *
     * @return a Login.
     */
    public static Login goToLogin() {
        goToUrl(ReadAppProperties.getInstance().getUrlLogin());
        return new Login();
    }

    /**
     * This method is used for go to profile.
     *
     * @return a Login.
     */
    public static ProfilePage goToProfile() {
        goToUrl("https://biialab.org/es/account/my-account");
        return new ProfilePage();
    }
}
