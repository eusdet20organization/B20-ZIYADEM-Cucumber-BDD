package de.ziyadem.pages;

import de.ziyadem.utils.BrowserUtils;
import de.ziyadem.utils.ConfigReader;
import de.ziyadem.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "[name='login']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//font[text()='Anmelden'])[2]")
    public WebElement loginButton;



    public void login(String email, String pwd) {
        Driver.getDriver().get(ConfigReader.get("url"));
        userIcon.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(pwd);
        loginBtn.click();
        //BrowserUtils.hover(myAccountLink);
        //Assert.assertTrue(dashboardLink.isDisplayed());
    }


}
