package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NussePage extends BasePage {

    @FindBy(xpath = "//font[text()='Haselnüsse in der Schale']")
    public WebElement haselnusseInDerSchaleProdukt;
}
