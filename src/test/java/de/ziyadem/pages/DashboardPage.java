package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(className = "woocommerce-MyAccount-content")
    public WebElement accountContent;
}
