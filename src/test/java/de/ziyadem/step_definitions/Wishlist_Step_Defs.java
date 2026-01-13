package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.OilPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wishlist_Step_Defs {

    DashboardPage dashboardPage = new DashboardPage();
    OilPage oilPage = new OilPage();

    @When("user selects the category Oils")
    public void user_selects_the_category_oils() {
        dashboardPage.oilsCategory.click();
    }
    @When("user choose San Martino Olive Oil")
    public void user_choose_san_martino_olive_oil() {
        oilPage.sanMartinoOliveOil.click();

    }
    @When("user clicks on the Add to Wishlist icon")
    public void user_clicks_on_the_add_to_wishlist_icon() {
        oilPage.addToWishlistButton.click();

    }
    @When("user clicks on the Wishlist icon and goes to the Wishlist page")
    public void user_clicks_on_the_wishlist_icon_and_goes_to_the_wishlist_page() {
        oilPage.wishlistButton.click();

    }
    @Then("verify that the San Martino Olive was added at Wishlist page")
    public void verify_that_the_san_martino_olive_was_added_at_wishlist_page() {
        oilPage.wishlistButton.click();

    }


}
