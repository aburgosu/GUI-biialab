/*
 * @(#) HomePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.foundation.gui.biialab.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * SearchCoursePage class.
 *
 * @author Andres Burgos
 * @version 1.0
 */

public class SearchCoursePage extends Base {
    @FindBy(css = ".product-layout:nth-child(1) .hidden-xs")
    private WebElement searchField;

    @FindBy(css = ".alert")
    private WebElement resultMessage;

    /**
     * Constructs the page transporter with driver from parent class.
     */
    public SearchCoursePage() {
        super();
    }

    /**
     * Adds MacBook to cart.
     */
    public void addMacBookToCart() {
        macBookAddToCartButton.click();
    }

    /**
     * Gets alert message text.
     *
     * @return - Alert message text.
     */
    public String getAlertMessageText() {
        alertMessage =
        String alertCompleteMessage = alertMessage.getText();
        int indexOfMessageFinish = alertCompleteMessage.indexOf("\n");
        String alertMessage = alertCompleteMessage.substring(0, indexOfMessageFinish);
        return alertMessage;
    }

}