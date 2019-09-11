package com.foundation.gui.biialab.ui.pages;

import com.foundation.gui.core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is used as Page base.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public abstract class Base {
    protected WebDriver webDriver;

    /**
     * This method is used to initialize a page.
     */
    public Base() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
