package com.foundation.gui.biialab.steps;


import com.foundation.gui.biialab.ui.pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginStepdefs {
    private Login login;

    @Given("I go the login page")
    public void iGoTheLoginPage() {
        login = new Login();
        login.login("email", "password");
    }

//    @When("^I fill the form with \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void iFillTheFormWithAnd(final String email, final String passwd) {
//        login.login(email, passwd);
//    }

//    @Then("My Account should appear in the title of the page")
//    public void usernameShouldAppearInTheLeftPanel() {
//        AccountPage accountPage = new AccountPage();
//        Assert.assertEquals(accountPage.getTextPageHeading(), "MI CUENTA", "It is not the same Title");
//    }
}
