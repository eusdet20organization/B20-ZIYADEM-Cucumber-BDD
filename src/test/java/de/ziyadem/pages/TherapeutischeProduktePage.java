package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TherapeutischeProduktePage extends BasePage {

    @FindBy(xpath = "//font[text()='Bienenbrot 100 g']")
    public WebElement bienenbrot100gProdukt;
}
