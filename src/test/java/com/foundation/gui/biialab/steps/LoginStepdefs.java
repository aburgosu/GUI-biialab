package com.foundation.gui.biialab.steps;


import com.foundation.gui.biialab.ui.pages.Login;
import com.foundation.gui.biialab.ui.pages.PageTransporter;
import com.foundation.gui.biialab.ui.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginStepdefs {
    private Login login;
    private ProfilePage profile;

    @Given("I go the login page")
    public void iGoTheLoginPage() {
        login=PageTransporter.goToLogin();
    }

    @When("^I fill the login form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillTheFormWithAnd(final String email, final String passwd) {
        login.login(email, passwd);
    }

    @Then("Username should appear in the profile")
    public void usernameShouldAppearInTheProfile() {
        profile = PageTransporter.goToProfile();
        Assert.assertEquals(profile.getEmail(), "aburgos.jala@gmail.com");
    }
}
