package com.foundation.gui.biialab.runner;

import com.foundation.gui.core.selenium.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"com/foundation/gui/biialab/steps"})
        //plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class Runner extends AbstractTestNGCucumberTests {

    /**
     * Closes WebDriver instance each end scenario.
     */
    @AfterTest
    public void closeDriver() {
        //WebDriverManager.getInstance().getDriver().close();
        //GeneratorReport.getInstance().generateReport();

    }
}