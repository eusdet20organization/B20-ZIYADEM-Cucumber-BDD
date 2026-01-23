package de.ziyadem.step_definitions;

import de.ziyadem.pages.*;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Navigationleiste_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    DelikatessenPage delikatessenPage = new DelikatessenPage();

    HomePage homePage = new HomePage();

    TherapeutischeProduktePage therapeutischeProduktePage = new TherapeutischeProduktePage();

    NussePage nussePage = new NussePage();

    @When("user klick auf Delikatessen Seite")
    public void user_klick_auf_delikatessen_seite() {
        dashboardPage.delicatessenLink.click();

    }
    @Then("verify that the Navigationleiste is displayed")
    public void verify_that_the_navigationleiste_is_displayed() {
        Assert.assertEquals("Besondere Geschmacksrichtungen".toLowerCase(),
                delikatessenPage.besondereGeschmacksrichtungenHeader.getText().toLowerCase());

    }

    @When("klick auf Therapeutische Produkte der Bienengruppe von Kategorie Honigsorten")
    public void klick_auf_therapeutische_produkte_der_bienengruppe_von_kategorie_honigsorten() {
        BrowserUtils.hover(homePage.honigsortenLink);
        homePage.therapeutischeProdukteDerBienengruppe.click();

    }
    @Then("Verifiziert dass Therapeutische Produkte der Bienengruppe angezeigt sind")
    public void verifiziert_dass_therapeutische_produkte_der_bienengruppe_angezeigt_sind() {
        Assert.assertEquals("Bienenbrot 100 g".toLowerCase(),
                therapeutischeProduktePage.bienenbrot100gProdukt.getText().toLowerCase());

    }

    @When("user klickt auf Nüsse")
    public void user_klickt_auf_nüsse() {
        homePage.nusseLink.click();

    }
    @Then("Verifiziert dass Nüsse Produkte angezeigt sind")
    public void verifiziert_dass_nüsse_produkte_angezeigt_sind() {

        Assert.assertEquals("Haselnüsse in der Schale".toLowerCase(),
                nussePage.haselnusseInDerSchaleProdukt.getText().toLowerCase());

    }

}
