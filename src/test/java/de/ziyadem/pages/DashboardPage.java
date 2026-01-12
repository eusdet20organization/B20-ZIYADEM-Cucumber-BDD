package de.ziyadem.pages;

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

    @FindBy (xpath = "(//i[@class='icon-instagram'])[1]")
    public WebElement instagramIcon;

    @FindBy (xpath = "(//a[@title='Mein Konto'])[2]")
    public WebElement meinKontoIcon;

    @FindBy (xpath = "//font[text()='melde']")
    public WebElement meldeButton;
}
