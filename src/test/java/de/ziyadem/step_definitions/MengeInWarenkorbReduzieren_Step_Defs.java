package de.ziyadem.step_definitions;

import de.ziyadem.pages.*;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MengeInWarenkorbReduzieren_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    DelikatessenPage delikatessenPage = new DelikatessenPage();

    OlivensortenPage olivensortenPage = new OlivensortenPage();

    WarenkorbPage warenkorbPage = new WarenkorbPage();

    ProdactPage prodactPage = new ProdactPage();

    @When("hoveringr over auf Delikatessen und click on the Olivensorten")
    public void hoveringr_over_auf_delikatessen_und_click_on_the_olivensorten() {
        BrowserUtils.hover(dashboardPage.delicatessenLink);
        dashboardPage.olivensorten.click();


    }
    @When("user clicks on the Warenkorb Icon")
    public void user_clicks_on_the_warenkorb_icon() {
        prodactPage.warenkorbIcon.click();

    }
    @When("user reduces the quantity to one")
    public void user_reduces_the_quantity_to_one() {
        warenkorbPage.decreaseQuantityButton.click();

    }
    @Then("Verify that the product quantity is reduces in the shopping cart.")
    public void verify_that_the_product_quantity_is_reduces_in_the_shopping_cart() {

        String expectedQuantity = "1";
        String actualQuantity = warenkorbPage.cocktailOlivenWarenkorb.getText();
        System.out.println("actualQuantity = " + actualQuantity);
        BrowserUtils.sleep(2);
        warenkorbPage.removeItemButton.click();
        BrowserUtils.sleep(2);

    }

}
