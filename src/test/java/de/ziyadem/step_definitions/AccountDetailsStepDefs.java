package de.ziyadem.step_definitions;

import de.ziyadem.pages.AccauntDetailsPage;
import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.MeineKontoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountDetailsStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    AccauntDetailsPage accauntDetailsPage = new AccauntDetailsPage();

    MeineKontoPage meineKontoPage = new MeineKontoPage();



    @Then ("der Benutzer klickt auf meine Konto details")
    public void der_benutzer_klickt_auf_meine_konto_details_button() {
        dashboardPage.meinKontoIcon.click();
        dashboardPage.kontoDetailsButton.click();
    }

    @When("der Benutzer wird zur meine Konto Seite weitergeleitet")
    public void der_benutzer_wird_zur_mein_konto_seite_weitergeleitet() {
        meineKontoPage.meineKontoPageTitle.isDisplayed();
    }

    @Then("der Benutzer aktualisiert die Kontodetails mit Vorname und Nachname {string} und {string}")
    public void der_benutzer_aktualisiert_die_kontodetails_mit_vorname_und_nachname_und(String firstName, String lastName) {
        accauntDetailsPage.firstNameBox.clear();
        accauntDetailsPage.firstNameBox.sendKeys(firstName);
        accauntDetailsPage.lastNameBox.clear();
        accauntDetailsPage.lastNameBox.sendKeys(lastName);
        accauntDetailsPage.saveChangesBtn.click();
    }

    @Then("der Benutzer speichert die aktualisierten Kontodetails")
    public void der_benutzer_speichert_die_aktualisierten_kontodetails() {
        accauntDetailsPage.saveChangesBtn.click();
    }

    @Then("eine Bestätigungsmeldung wird angezeigt, die besagt, dass die Kontodetails erfolgreich aktualisiert wurden")
    public void eine_bestatigungsmeldung_wird_angezeigt_die_besagt_dass_die_kontodetails_erfolgreich_aktualisiert_wurden() {
        accauntDetailsPage.passwordChangeConfirmation.isDisplayed();
    }


}
