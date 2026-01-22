package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BioProduktPage extends BasePage {

    @FindBy(xpath = "//font[text()='Schreibe die erste Bewertung für „BIO Blütenhonig 400 g“']")
    public WebElement ersteBewertung;

    @FindBy(xpath = "//font[text()='ZYD87464954']")
    public WebElement artikelnummer;

    @FindBy(xpath = "//font[text()='Propolis-Tropfen 20 ml']")
    public WebElement propolisProdukt;



}
