package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LogoutNachKlickZurückflächeBrowser_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @When("user klick auf Zurück Schaltfläche des Browser")
    public void user_klick_auf_zurück_schaltfläche_des_browser() {
        dashboardPage.goBackBrowserButton();
        BrowserUtils.sleep(2);


    }
    @Then("verify that the user is still logged in")
    public void verify_that_the_user_is_still_logged_in() {
        Assert.assertEquals("Abmelden".toLowerCase(),
               dashboardPage.abmeldenText.getText().toLowerCase());

    }

}
