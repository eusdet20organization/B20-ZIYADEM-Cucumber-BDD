package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.OilPage;
import de.ziyadem.pages.WishlistPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.sql.rowset.BaseRowSet;

public class DoppleAusgewaehlteArtikelInWishlist_Step_Defs {

    DashboardPage dashboardPage = new DashboardPage();
    OilPage oilPage = new OilPage();

    WishlistPage wishlistPage = new WishlistPage();



    @When("user goes back to the Oils category")
    public void user_goes_back_to_the_oils_category() {
        dashboardPage.oilsCategory.click();
    }

    @When("user choose San Martino Olive Oil one more time")
    public void user_choose_san_martino_olive_oil_one_more_time() {
        oilPage.sanMartinoOliveOil.click();
    }

    @When("user clicks on the Add to Wishlist icon one more time")
    public void user_clicks_on_the_add_to_wishlist_icon_one_more_time() {
        BrowserUtils.clickWithJS(oilPage.addToWishlistButton);
    }

    @Then("verify that the San Martino Olive is not added to the Wishlist one more time")
    public void verify_that_the_san_martino_olive_is_not_added_to_the_wishlist_one_more_time() {
        wishlistPage.wishListContent.isDisplayed();
    }

}
