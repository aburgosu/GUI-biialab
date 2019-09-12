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
package com.foundation.gui.core.selenium.webdrivers;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provide the required Browser.
 *
 * @author Andres Burgos
 * @version 1.0
 */
public abstract class BrowserFactory {
    private static Map<String, IBrowser> browserList = new HashMap<>();

    static {
        browserList.put("chrome", new Chrome());
        browserList.put("firefox", new Firefox());
    }

    /**
     * Returns the IBrowser required .
     *
     * @param browserName - Required browser.
     * @return - The required browser instance.
     */
    public static IBrowser getBrowser(String browserName) {
        return browserList.get(browserName);
    }
}