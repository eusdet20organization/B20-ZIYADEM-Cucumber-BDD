package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.pages.WarenkorbPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WarenkorbIcon_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    WarenkorbPage warenkorbPage = new WarenkorbPage();

    @When("user clicks on the Warenkorb icon")
    public void user_clicks_on_the_warenkorb_icon() {
        dashboardPage.cartButton.click();

    }
    @Then("verify the Warenkorb page is displayed")
    public void verify_the_warenkorb_page_is_displayed() {
        Assert.assertEquals("Dein Warenkorb ist derzeit leer.".toLowerCase(),
                warenkorbPage.emptyCartMessage.getText().toLowerCase());

    }
}
