package de.ziyadem.step_definitions;

import de.ziyadem.pages.BasePage;
import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.FußzeilenlinksPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FußzeilenlinksStepDefs {

    FußzeilenlinksPage fußzeilenlinksPage = new FußzeilenlinksPage();


    @When("der Benutzer klickt auf den FußzeilenButton Unternehmensinformationen")
    public void der_benutzer_klickt_auf_den_fußzeilenbutton_unternehmensinformationen() {
        fußzeilenlinksPage.unternehmensinformationenButton.click();
    }

    @Then("der Benutzer wird zur Unternehmensinformationen-Seite weitergeleitet")
    public void der_benutzer_wird_zur_unternehmensinformationen_seite_weitergeleitet() {
        Assert.assertTrue(fußzeilenlinksPage.impressumText.isDisplayed());
    }

    @Then("der Benutzer klickt auf den Fußzeilenlink Nutzungsbedingungen")
    public void der_benutzer_klickt_auf_den_fußzeilenlink_nutzungsbedingungen() {
        fußzeilenlinksPage.nutzungsbedingungenButton.click();
    }

    @When("der Benutzer wird zur Nutzungsbedingungen-Seite weitergeleitet")
    public void der_benutzer_wird_zur_nutzungsbedingungen_seite_weitergeleitet() {
        Assert.assertTrue(fußzeilenlinksPage.agbText.isDisplayed());
    }

    @When("der Benutzer klickt auf den Fußzeilenlink Datenschutzrichtlinie")
    public void der_benutzer_klickt_auf_den_fußzeilenlink_datenschutzrichtlinie() {
        fußzeilenlinksPage.datenschutzrichtlinieButton.click();
    }

    @Then("der Benutzer wird zur Datenschutzrichtlinie-Seite weitergeleitet")
    public void der_benutzer_wird_zur_datenschutzrichtlinie_seite_weitergeleitet() {
        Assert.assertTrue(fußzeilenlinksPage.datenschutzText.isDisplayed());
    }

    @When("der Benutzer klickt auf den Fußzeilenlink Versand- und Rückgabeinformationen")
    public void der_benutzer_klickt_auf_den_fußzeilenlink_versand_und_rückgabeinformationen() {
        fußzeilenlinksPage.versandUndRuckgabeinformationenButton.click();
    }
    @Then("der Benutzer wird zur Versand- und Rückgabeinformationen-Seite weitergeleitet")
    public void der_benutzer_wird_zur_versand_und_rückgabeinformationen_seite_weitergeleitet() {
       Assert.assertTrue(fußzeilenlinksPage.versandUndRuckgabeText.isDisplayed());
    }

    @Then("der Benutzer klickt auf den Fußzeilenlink Stornierung und Rückerstattung")
    public void der_benutzer_klickt_auf_den_fußzeilenlink_stornierung_und_rückerstattung() {
        fußzeilenlinksPage.stornierungUndRuckerstattungButton.click();
    }

    @Then("der Benutzer wird zur Stornierung und Rückerstattung-Seite weitergeleitet")
    public void der_benutzer_wird_zur_stornierung_und_rückerstattung_seite_weitergeleitet() {
        Assert.assertTrue(fußzeilenlinksPage.stornierungUndRuckerstattungText.isDisplayed());
    }

    @When("der Benutzer klickt auf den Fußzeilenlink Kommunikationspräferenzen")
    public void der_benutzer_klickt_auf_den_fußzeilenlink_kommunikationspräferenzen() {
        fußzeilenlinksPage.kommunikationButton.click();
    }
    @Then("der Benutzer wird zur Kommunikationspräferenzen-Seite weitergeleitet")
    public void der_benutzer_wird_zur_kommunikationspräferenzen_seite_weitergeleitet() {
        Assert.assertTrue(fußzeilenlinksPage.kommunikationText.isDisplayed());
        }

}
