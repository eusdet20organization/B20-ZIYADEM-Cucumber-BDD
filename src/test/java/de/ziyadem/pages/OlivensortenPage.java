package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OlivensortenPage extends BasePage {


    @FindBy(xpath = "//font[text()='Cocktail-Oliven']")
    public WebElement cocktailOlivenLink;
}


