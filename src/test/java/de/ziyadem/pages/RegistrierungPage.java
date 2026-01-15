package de.ziyadem.pages;

import com.google.common.net.MediaType;
import org.junit.runner.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrierungPage extends BasePage {

    @FindBy(id = "reg_email")
    public WebElement regEmailInput;

    @FindBy(id = "reg_password")
    public WebElement regPasswordInput;

    @FindBy(css = "[name='register']")
    public WebElement registerBtn;

    @FindBy(css = "[class=\"message-container container alert-color medium-text-center\"]")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement privacyPolicyCheckbox;

}



