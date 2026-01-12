package de.ziyadem.step_definitions;

import de.ziyadem.pages.*;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddProductInWarenkorb_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    OlivensortenPage olivensortenPage = new OlivensortenPage();

    ProdactPage prodactPage = new ProdactPage();

    WarenkorbPage warenkorbPage = new WarenkorbPage();

    @When("hoveringr over auf Delikatessen und click on the Olivensorten")
    public void hoveringr_over_auf_delikatessen_und_click_on_the_olivensorten() {
        BrowserUtils.hover(dashboardPage.delicatessenLink);
        dashboardPage.olivensorten.click();

    }
    @When("user clicks on the Warenkorb Icon")
    public void user_clicks_on_the_warenkorb_icon() {
        prodactPage.warenkorbIcon.click();

    }
    @Then("verify that the product is displayed in the Warenkorb")
    public void verify_that_the_product_is_displayed_in_the_warenkorb() {
        Assert.assertEquals("Cocktail-Oliven".toLowerCase(),
                warenkorbPage.cocktailOlivenWarenkorb.getText().toLowerCase());

    }

}
