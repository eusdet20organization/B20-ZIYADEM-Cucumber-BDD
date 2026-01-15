package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//font[text()=' Blütenhonig 400 g']")
    public WebElement firstSuchVorschlag;

    @FindBy(xpath = "//font[text()='Keine Produkte gefunden.']")
    public WebElement keineProdukteGefundenText;
}
