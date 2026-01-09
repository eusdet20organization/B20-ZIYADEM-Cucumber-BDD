package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdactPage extends BasePage {

    @FindBy (xpath = "//font[text()='In den Warenkorb']")
    public WebElement inDenWarenkorbButton;

    @FindBy (xpath = "(//a[@title='Warenkorb'])[1]")
    public WebElement warenkorbIcon;


}
