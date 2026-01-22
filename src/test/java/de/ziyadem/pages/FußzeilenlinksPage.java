package de.ziyadem.pages;

import de.ziyadem.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class FußzeilenlinksPage extends BasePage {

        @FindBy(xpath = "(//font[text()='Unternehmensinformationen'])[1]")
        public WebElement unternehmensinformationenButton;

        @FindBy(xpath = "//font[text()='Impressum']")
        public WebElement impressumText;

        @FindBy(xpath = "//font[text()='Nutzungsbedingungen']")
        public WebElement nutzungsbedingungenButton;

        @FindBy(xpath = "//font[text()='Allgemeine Geschäftsbedingungen und Kundeninformationen']")
        public WebElement agbText;

        @FindBy(xpath = "(//font[text()='Datenschutzrichtlinie'])[1]")
        public WebElement datenschutzrichtlinieButton;

        @FindBy(xpath = "//font[text()='Datenschutzerklärung']")
        public WebElement datenschutzText;

        @FindBy(xpath = "(//font[text()='Versand- und Rückgabeinformationen'])[1]")
        public WebElement versandUndRuckgabeinformationenButton;

        @FindBy(xpath = "//font[text()='Zahlung und Versand']")
        public WebElement versandUndRuckgabeText;

        @FindBy(xpath = "(//font[text()='Stornierung und Rückerstattung'])[1]")
        public WebElement stornierungUndRuckerstattungButton;

        @FindBy(xpath = "//font[text()='Widerrufsbelehrung']")
        public WebElement stornierungUndRuckerstattungText;

        @FindBy(xpath = "//font[text()='Kommunikation']")
        public WebElement kommunikationButton;

        @FindBy(xpath = "//font[text()='Name ']")
        public WebElement kommunikationText;

    }

