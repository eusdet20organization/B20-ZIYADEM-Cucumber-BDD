package de.ziyadem.step_definitions;

import de.ziyadem.pages.BioProduktPage;
import de.ziyadem.pages.HomePage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.utils.BrowserUtils;
import de.ziyadem.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Suchleiste_Step_Defs {

    LoginPage loginPage = new LoginPage();

    BioProduktPage bioProduktPage = new BioProduktPage();

    HomePage homePage = new HomePage();


    @When("user klick auf Such Feld")
    public void user_klick_auf_such_feld() {
        loginPage.suchFeld.click();

    }
    @When("user schreibt {string} in Such Feld")
    public void user_schreibt_in_such_feld(String string) {
        loginPage.suchFeld.sendKeys(string);

    }
    @When("user klick auf erste Option")
    public void user_klick_auf_erste_option() {
       homePage.firstSuchVorschlag.click();


    }
    @Then("Verifiziert dass der Benutzer zur Produkt Detailseite gelandet ist")
    public void verifiziert_dass_der_benutzer_zur_produkt_detailseite_gelandet_ist() {
        Assert.assertEquals("Schreibe die erste Bewertung für „BIO Blütenhonig 400 g“".toLowerCase(),
                bioProduktPage.ersteBewertung.getText().toLowerCase());

    }
    @Then("Verifiziert dass die Meldung Produkt nicht gefunden angezeigt wird")
    public void verifiziert_dass_die_meldung_produkt_nicht_gefunden_angezeigt_wird() {
        Assert.assertEquals("Keine Produkte gefunden.".toLowerCase(),
                homePage.keineProdukteGefundenText.getText().toLowerCase());
    }

    @Then("Verifiziert dass die Suchergebnisse in der Dropdown-Liste angezeigt sind")
    public void verifiziert_dass_die_suchergebnisse_in_der_dropdown_liste_angezeigt_sind() {
        Assert.assertEquals("Bingöl Bio-Honigwabe".toLowerCase(),
                homePage.honigProdukt.getText().toLowerCase());
    }
}
