package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarenkorbPage extends BasePage {

    @FindBy(xpath = "//font[normalize-space(text())='Dein Warenkorb ist derzeit leer.']")
    public WebElement emptyCartMessage;
}
