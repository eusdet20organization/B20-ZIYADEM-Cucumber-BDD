package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccauntDetailsPage extends BasePage{

    @FindBy (xpath = "(//input[@id='password_current'])[1]")
    public WebElement currentPasswort;

    @FindBy (xpath = "(//input[@id='password_1'])[1]")
    public WebElement newPasswort;

    @FindBy(xpath = "(//input[@id='password_2'])[1]")
    public WebElement confirmNewPasswort;

    @FindBy (xpath = "(//button[@value='Änderungen speichern'])[1]")
    public WebElement saveChangesButton;

    @FindBy (xpath = "//div[@class='message-container container success-color medium-text-center']")
    public WebElement passwordChangeConfirmation;

    @FindBy(xpath = "//font[text()='Kontodetails']")
    public WebElement kontodetailsText;

    @FindBy(xpath = "//input[@name='account_first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='account_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//button[@class='woocommerce-Button button']")
    public WebElement saveChangesBtn;



}
