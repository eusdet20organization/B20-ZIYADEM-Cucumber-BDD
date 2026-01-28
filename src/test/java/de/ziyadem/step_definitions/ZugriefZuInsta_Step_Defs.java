package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ZugriefZuInsta_Step_Defs {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on the Instagram icon")
    public void user_clicks_on_the_instagram_icon() {
        dashboardPage.instagramIcon.click();
    }

    @Then("verify that Instagram page is opened")
    public void verify_that_instagram_page_is_opened() {
        String actualTabID = Driver.getDriver().getWindowHandle();

        for (String tabId : Driver.getDriver().getWindowHandles()) {
            if (!tabId.equals(actualTabID)) {
                Driver.getDriver().switchTo().window(tabId);
            }
        }
        String expectedUrl = "https://www.instagram.com/ziya.dem/#";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("user clicks on the Tik Tok icon")
    public void user_clicks_on_the_tik_tok_icon() {
        dashboardPage.tikTokIcon.click();

    }
    @Then("verify that Tik Tok page is opened")
    public void verify_that_tik_tok_page_is_opened() {

        String actualTabID = Driver.getDriver().getWindowHandle();

        for (String tabId : Driver.getDriver().getWindowHandles()) {
            if (!tabId.equals(actualTabID)) {
                Driver.getDriver().switchTo().window(tabId);
            }
        }
        String expected1Url = "https://www.tiktok.com/@ziyademnaturladen/";
        String actual1Url = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected1Url, actual1Url);

    }

}
