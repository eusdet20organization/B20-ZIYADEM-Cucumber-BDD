package de.ziyadem.step_definitions;

import de.ziyadem.pages.*;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MengeInwarenkorbErhöhen_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    OlivensortenPage olivensortenPage = new OlivensortenPage();

    ProdactPage prodactPage = new ProdactPage();

    WarenkorbPage warenkorbPage = new WarenkorbPage();



    @When("click on the fourth Prodact")
    public void click_on_the_fourth_prodact() {
        BrowserUtils.clickWithJS(olivensortenPage.cocktailOlivenLink);

    }
    @When("uaer clicks on the In Warenkorb Button")
    public void uaer_clicks_on_the_in_warenkorb_button() {
        prodactPage.inDenWarenkorbButton.click();

    }

    @When("user increases the quantity on two")
    public void user_increases_the_quantity_to() {
        warenkorbPage.increaseQuantityButton.click();
    }
    @When("user clicks on the Aktualisieren Button")
    public void user_clicks_on_the_aktualisieren_button() {
        warenkorbPage.aktualisierenButton.click();
    }
    @Then("Verify that the product quantity is increased in the shopping cart.")
    public void verify_that_the_product_quantity_is_increased_in_the_shopping_cart() {
        String expectedQuantity = "2";
        String actualQuantity = warenkorbPage.cocktailOlivenWarenkorb.getText();
        System.out.println("actualQuantity = " + actualQuantity);
        BrowserUtils.sleep(2);
        warenkorbPage.removeItemButton.click();
        BrowserUtils.sleep(2);
    }

}
