package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.DelikatessenPage;
import de.ziyadem.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Navigationleiste_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    DelikatessenPage delikatessenPage = new DelikatessenPage();

    @When("user klick auf Delikatessen Seite")
    public void user_klick_auf_delikatessen_seite() {
        dashboardPage.delicatessenLink.click();

    }
    @Then("verify that the Navigationleiste is displayed")
    public void verify_that_the_navigationleiste_is_displayed() {
        Assert.assertEquals("Besondere Geschmacksrichtungen".toLowerCase(),
                delikatessenPage.besondereGeschmacksrichtungenHeader.getText().toLowerCase());

    }
}
