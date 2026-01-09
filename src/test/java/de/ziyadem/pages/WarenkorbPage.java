package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarenkorbPage extends BasePage {

    @FindBy(xpath = "//font[text()='Cocktail-Oliven']")
    public WebElement cocktailOlivenWarenkorb;
    @FindBy(xpath = "//font[normalize-space(text())='Dein Warenkorb ist derzeit leer.']")
    public WebElement emptyCartMessage;

    @FindBy(xpath = "//font[text()='Cocktail-Oliven']")
    public WebElement cocktailOlivenWarenkorb;

    @FindBy(xpath = "//input[@value='+']")
    public WebElement increaseQuantityButton;

    @FindBy(xpath = "//font[text()='Warenkorb aktualisieren']")
    public WebElement aktualisierenButton;

    @FindBy(xpath = "//input[@value='-']")
    public WebElement decreaseQuantityButton;

    @FindBy(xpath = "//font[text()='×']")
    public WebElement removeItemButton;
}
