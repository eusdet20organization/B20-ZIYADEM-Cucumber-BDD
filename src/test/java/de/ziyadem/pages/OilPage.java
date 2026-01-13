package de.ziyadem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OilPage extends BasePage{

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[4]")
    public WebElement sanMartinoOliveOil;

    @FindBy(xpath = "(//button[@class='wishlist-button button is-outline circle icon wishlist-added'])[1]")
    public WebElement addToWishlistButton;

    @FindBy (xpath = "(//a[@class='wishlist-link icon primary button round is-small'])[1]")
    public WebElement wishlistButton;
}
