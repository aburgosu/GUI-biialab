/*
 * @(#) IBrowser.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.foundation.gui.core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * Interface that shows the method sign of all browsers.
 *
 * @author Melissa Román
 * @version 1.0
 */
public interface IBrowser {

    /**
     * Allows to initialize a web driver.
     *
     * @return - Web driver.
     */
    WebDriver initDriver();
}