package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdactPage extends BasePage {

    @FindBy (xpath = "//font[text()='In den Warenkorb']")
    public WebElement inDenWarenkorbButton;

    @FindBy (xpath = "(//a[@title='Warenkorb'])[1]")
    public WebElement warenkorbIcon;

    @FindBy (xpath = "(//font[text()='Produktinhalt: 600 '])[1]")
    public WebElement produktInhalt600;

    @FindBy (xpath = "(//font[text()='×'])[2]")
    public WebElement closePopupButton;


}
