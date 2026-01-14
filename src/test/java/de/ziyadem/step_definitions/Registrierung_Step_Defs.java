package de.ziyadem.step_definitions;

import de.ziyadem.pages.RegistrierungPage;
import de.ziyadem.utils.ConfigReader;
import de.ziyadem.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Registrierung_Step_Defs {

    RegistrierungPage registrierungPage = new RegistrierungPage();
    @Given("der Benutzer befindet sich auf der Registrierungsseite")
    public void der_benutzer_befindet_sich_auf_der_registrierungsseite() {
        Driver.getDriver().get(ConfigReader.get("url"));
        registrierungPage.userIcon.click();
    }
    @When("der Benutzer registriert sich mit einer bereits existierenden Email")
    public void der_Benutzer_registriert_sich_mit_einer_bereits_existierenden_Email () {
        registrierungPage.regEmailInput.sendKeys("cankirili_18@hotmail.de");
        registrierungPage.registerBtn.click();
    }
    @Then("wird eine Fehlermeldung angezeigt, die besagt, dass die Email bereits existiert")
    public void wird_eine_fehlermeldung_angezeigt_die_besagt_dass_die_email_bereits_existiert() {
        String expectedMessage1 = "Fehler: Es ist bereits ein Konto für cankirili_18@hotmail.de registriert. Bitte melde dich an oder verwende eine andere E-Mail-Adresse.";
        String expectedMessage2 = "Fehler: Es ist bereits ein Konto für cankirili_18@hotmail.de registriert. Bitte melden Sie sich an oder verwenden Sie eine andere E-Mail-Adresse.";
        String actualMessage = registrierungPage.errorMessage.getText().trim();
        Assert.assertTrue(actualMessage.equals(expectedMessage1) || actualMessage.equals(expectedMessage2));
    }









}











