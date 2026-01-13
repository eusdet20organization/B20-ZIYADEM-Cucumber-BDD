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

    @Then("verify that the product is displayed in the Warenkorb")
    public void verify_that_the_product_is_displayed_in_the_warenkorb() {
        Assert.assertEquals("Cocktail-Oliven".toLowerCase(),
                warenkorbPage.cocktailOlivenWarenkorb.getText().toLowerCase());

    }

}
