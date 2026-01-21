package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SprachenAenderung_Step_Defs {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on the Language icon")
    public void user_clicks_on_the_language_icon() {
        dashboardPage.languageIcon.click();

    }
    @When("user selects {string} from the language dropdown")
    public void user_selects_from_the_language_dropdown(String string) {
        dashboardPage.languageNederlandsIcon.click();

    }
    @Then("verify that the website language is changed to Nederlands")
    public void verify_that_the_website_language_is_changed_to_nederlands() {
        String exp = "Soorten honing";
        String act = dashboardPage.soortenHoningIcon.getText();
    }



}
