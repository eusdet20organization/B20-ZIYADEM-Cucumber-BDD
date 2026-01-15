package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BioProduktPage extends BasePage {

    @FindBy(xpath = "//font[text()='Schreibe die erste Bewertung für „BIO Blütenhonig 400 g“']")
    public WebElement ersteBewertung;


}
