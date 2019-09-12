/*
 * @(#) BrowserFactory.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.foundation.gui.core.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class Manage the WebDriver.
 *
 * @author Andres Burgos
 * @version 1.0
 */

public final class WebDriverManager {

    private static WebDriverManager instance = null;
    private WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;


    /**
     * WebDriverManager Constructor.
     */
    private WebDriverManager() {
        initialize();
    }

    /**
     * Gets Instance of a Web Driver Manager.
     */
    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    /**
     * Initializes the Web Driver.
     */
    private void initialize() {
        webDriver = getWebDriver(webDriverConfig.getBrowser());
        webDriver.manage()
                .timeouts()
                .implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriverWait = new WebDriverWait(webDriver, WebDriverConfig.getInstance().getExplicitWaitTime(),
                WebDriverConfig.getInstance().getWaitSleepTime());
    }

    /**
     * Allows to get the Web Driver.
     *
     * @return WebDriver.
     */
    private WebDriver getWebDriver(final String browser) {
        webDriver = WebDriverFactory.getWebDriver(WebDriverConfig.getInstance().getBrowser());
        return webDriver;
    }

    /**
     * Allows to get the Web Driver.
     *
     * @return WebDriver.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
