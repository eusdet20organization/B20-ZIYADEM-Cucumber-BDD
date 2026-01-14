package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeineKontoPage extends BasePage {

    @FindBy(xpath = "//font[text()='Bestätigen und abmelden']")
    public WebElement AbmeldenButton;
}
