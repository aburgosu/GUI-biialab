package com.foundation.gui.biialab.steps;


import com.foundation.gui.biialab.ui.pages.Login;
import com.foundation.gui.biialab.ui.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginStepdefs {
    private Login login;

    @Given("I go the login page")
    public void iGoTheLoginPage() {
        login = new Login();
    }

    @When("^I fill the login form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillTheFormWithAnd(final String email, final String passwd) {
        login.login(email, passwd);
    }

    @Then("Username should appear in the profile")
    public void usernameShouldAppearInTheProfile() {
        ProfilePage profilePage = new ProfilePage();
        Assert.assertEquals(profilePage.getEmail(), "aburgos.jala@gmail.com");
    }
}
