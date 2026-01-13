package de.ziyadem.step_definitions;

import de.ziyadem.pages.BasePage;
import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.pages.MeineKontoPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    MeineKontoPage meineKontoPage = new MeineKontoPage();



    @When("Hoveringr over  auf Mein Konto Icon und klick melde")
    public void hoveringr_over_auf_mein_konto_icon_und_klick_melde() {
        BrowserUtils.hover(dashboardPage.meinKontoIcon);
        dashboardPage.meldeButton.click();

    }
    @When("klick auf Text Bestätigen und Abmelden")
    public void klick_auf_text_bestätigen_und_abmelden() {
        meineKontoPage.AbmeldenButton.click();

    }
    @Then("verify that the user is logged out successfully")
    public void verify_that_the_user_is_logged_out_successfully() {
        Assert.assertEquals("Anmelden".toLowerCase(),
                loginPage.loginButton.getText().toLowerCase());

    }

    @When("user klick auf Zurück Schaltfläche des Browser")
    public void user_klick_auf_zurück_schaltfläche_des_browser() {
        dashboardPage.goBackBrowserButton();
        BrowserUtils.sleep(2);


    }
    @Then("verify that the user is still logged in")
    public void verify_that_the_user_is_still_logged_in() {
        BrowserUtils.hover(dashboardPage.meinKontoIcon);
        Assert.assertEquals("Wunschliste".toLowerCase(),
                dashboardPage.wishListLink.getText().toLowerCase());

    }

}
