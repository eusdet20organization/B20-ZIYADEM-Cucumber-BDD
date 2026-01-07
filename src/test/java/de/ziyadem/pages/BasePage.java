package de.ziyadem.pages;

import de.ziyadem.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[title='Anmelden']")
    public WebElement userIcon;

    @FindBy(xpath = "(//font[normalize-space(text())='Dashboard'])[1]")
    public WebElement dashboardLink;

    @FindBy(xpath = "(//i[@class='icon-user'])[2]")
    public WebElement myAccountLink;


}
