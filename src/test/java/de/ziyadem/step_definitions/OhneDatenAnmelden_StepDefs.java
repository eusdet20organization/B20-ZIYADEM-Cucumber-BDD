package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OhneDatenAnmelden_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user tries to log in without entering any data")
    public void user_tries_to_log_in_without_entering_any_data() {
        loginPage.login("", "");
    }

    @Then("verify that appropriate error messages are displayed for missing email and password")
    public void verify_error_messages() {
        String expectedUserError = "Ein Benutzername ist erforderlich.";

        String actualUserError = loginPage.userNameError.getText();

        Assert.assertEquals(expectedUserError, actualUserError);

        }




    }




