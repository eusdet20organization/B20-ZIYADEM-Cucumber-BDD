package de.ziyadem.pages;

import de.ziyadem.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//font[text()=' Blütenhonig 400 g']")
    public WebElement firstSuchVorschlag;

    @FindBy(xpath = "//font[text()='Keine Produkte gefunden.']")
    public WebElement keineProdukteGefundenText;

    @FindBy(xpath = "//font[text()='Bingöl Bio-Honigwabe']")
    public WebElement honigProdukt;

    public void Enterdrücken() {
        firstSuchVorschlag.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "(//font[text()='Honigsorten'])[1]")
    public WebElement honigsortenLink;

    @FindBy(xpath = "(//font[text()='Therapeutische Produkte der Bienengruppe'])[1]")
    public WebElement therapeutischeProdukteDerBienengruppe;

}


