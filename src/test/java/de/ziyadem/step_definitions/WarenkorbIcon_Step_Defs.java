package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.pages.ProdactPage;
import de.ziyadem.pages.WarenkorbPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WarenkorbIcon_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    WarenkorbPage warenkorbPage = new WarenkorbPage();

    ProdactPage productPage = new ProdactPage();

    @When("user clicks on the Warenkorb icon")
    public void user_clicks_on_the_warenkorb_icon() {
        dashboardPage.cartButton.click();

    }
    @Then("verify the Warenkorb page is displayed")
    public void verify_the_warenkorb_page_is_displayed() {
        Assert.assertEquals("Dein Warenkorb ist derzeit leer.".toLowerCase(),
                warenkorbPage.emptyCartMessage.getText().toLowerCase());

    }

    @When("user hovers over the Warenkorb icon")
    public void user_hovers_over_the_warenkorb_icon() {
        BrowserUtils.hover(productPage.warenkorbIcon);

    }
    @Then("verifiziert, dass Warenkorb Inhalt sicbar ist")
    public void verifiziert_dass_warenkorb_inhalt_sicbar_ist() {
        String expectedMessage = "Produktinhalt: 600";
        BrowserUtils.sleep(2);
        String actualMessage = productPage.produktInhalt600.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);




    }
}
