package de.ziyadem.pages;

import de.ziyadem.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(className = "woocommerce-MyAccount-content")
    public WebElement accountContent;

    @FindBy(xpath = "(//font[text()='Delikatessen'])[1]")
    public WebElement delicatessenLink;

    @FindBy(xpath = "(//font[text()='Olivensorten'])[1]")
    public WebElement olivensorten;
    @FindBy(xpath = "(//font[normalize-space(text())='Dashboard'])[1]")
    public WebElement dashboardLink;

    @FindBy (xpath = "(//a[@title='Warenkorb'])[1]")
    public WebElement cartButton;


    @FindBy (xpath = "(//a[@class='account-link account-login icon primary button round is-small'])[1]")
    public WebElement profilButton;

    @FindBy (xpath = "(//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account'])[2]")
    public WebElement accountdetails;

    @FindBy (xpath = "(//i[@class='icon-instagram'])[1]")
    public WebElement instagramIcon;


    @FindBy (xpath = "(//a[@class='nav-top-link'])")
    public WebElement oilsCategory;

    @FindBy (xpath = "//font[text()='melde']")
    public WebElement meldeButton;

    @FindBy (xpath = "//font[text()='Abmelden']")
    public WebElement abmeldenText;

    public void goBackBrowserButton() {
        Driver.getDriver().navigate().back();
    }

}
