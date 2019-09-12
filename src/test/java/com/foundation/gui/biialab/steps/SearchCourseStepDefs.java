/*
 * Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.foundation.gui.biialab.steps;

import com.foundation.gui.biialab.ui.pages.PageTransporter;
import com.foundation.gui.biialab.ui.pages.SearchCoursePage;

import gherkin.lexer.Pa;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Search Course Steps implements all steps to search and view the course.
 *
 * @author Andres Burgos
 * @version 1.0
 */
public class SearchCourseStepDefs {
    private SearchCoursePage searchCourse;

    /**
     * Navigates to search page.
     */
    @When("the user goes to courses page")
    public void theUserGoesToSearchCoursePage() {
        PageTransporter.goToSearchCoursePage();
        searchCourse = PageTransporter.goToSearchCoursePage();
    }

    /**
     * Adds an available product to cart.
     */
    @When("the user search the course")
    public void addProductToCart() {
        searchCourse.addMacBookToCart();
    }

}
