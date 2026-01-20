package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DelikatessenPage extends BasePage {

    @FindBy(xpath = "(//font[text()='Besondere Geschmacksrichtungen'])[1]")
    public WebElement besondereGeschmacksrichtungenHeader;
}
