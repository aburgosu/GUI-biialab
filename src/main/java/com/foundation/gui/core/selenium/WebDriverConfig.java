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

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class read configuration from the file and setup the webDriver.
 *
 * @author Andres Burgos
 * @version 1.0
 */
public class WebDriverConfig {
    private int implicitWaitTime;
    private int explicitWaitTime;
    private String browser;
    private static WebDriverConfig readConfiguration;
    private Properties properties;
    private InputStream inputProperties;
    private static WebDriverConfig instance;
    private int waitSleepTime;

    /**
     * Gets the implicit wait time set for the WebDriver.
     */
    protected WebDriverConfig() {
        initialize();
    }

    /**
     * Gets the instance for WebDriverConfig.
     * @return WebDriveConfig.
     */
    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    /**
     * Initializes the WebDriver with the configuration file data.
     */
    public void initialize() {
        try {
            inputProperties = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(inputProperties);
            implicitWaitTime = Integer.parseInt(properties.getProperty("implicitWaitTime"));
            explicitWaitTime = Integer.parseInt(properties.getProperty("explicitWaitTime"));
            browser = properties.getProperty("browser");
        } catch (Exception e) {
            try {
                inputProperties.close();
            } catch (Exception ex) {
                //TODO
            }
            //TODO
        }
    }

    /**
     * Gets the implicit wait time for the WebDriver.
     *
     * @return Implicit wait time.
     */
    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    /**
     * Gets the explicit wait time for the WebDriver.
     *
     * @return Implicit wait time.
     */
    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }

    /**
     * Gets the browser.
     *
     * @return Implicit wait time.
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Gets the sleep time wait set for the WebDriver.
     *
     * @return Sleep wait time.
     */
    public int getWaitSleepTime() {
        return waitSleepTime;
    }
}
