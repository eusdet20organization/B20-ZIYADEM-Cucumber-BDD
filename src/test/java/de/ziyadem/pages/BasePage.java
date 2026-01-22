package de.ziyadem.pages;

import de.ziyadem.utils.Driver;
import org.openqa.selenium.WebDriver;
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

    @FindBy(xpath = "//a[@class='register']")
    public WebElement registerLink;
    @FindBy(xpath = "//font[text()='Wunschliste']")
    public WebElement wishListLink;

    @FindBy(css="#woocommerce-product-search-field-0")
    public WebElement suchFeld;

    @FindBy(xpath = "(//i[@class='icon-search'])[1]")
    public WebElement suchButton;

    @FindBy(xpath = "//a[contains(@href,'/datenschutz')]")
    public WebElement datenschutzrichtlinieButton;

    @FindBy(xpath = "//a[contains(@href,'/versand-und-ruckgabeinformationen')]")
    public WebElement versandUndRuckgabeinformationenButton;

    @FindBy(xpath = "//a[contains(@href,'/stornierung-und-ruckerstattung')]")
    public WebElement stornierungUndRuckerstattungButton;

    @FindBy(xpath = "//a[contains(@href,'/kommunikation')]")
    public WebElement kommunikationButton;

    @FindBy(xpath = "(//i[@class='icon-search'])[1]")
    public WebElement suchButton;

}