package de.ziyadem.step_definitions;

import de.ziyadem.pages.AccauntDetailsPage;
import de.ziyadem.pages.BasePage;
import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class PasswortÄndern_Step_Defs {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    AccauntDetailsPage accountDetailsPage = new AccauntDetailsPage();


    @When("user clicks on the Profil icon")
    public void user_clicks_on_the_profil_icon() {
        dashboardPage.profilButton.click();

    }
    @When("user clicks on the account details")
    public void user_clicks_on_the_accountdetails() {
        dashboardPage.accountdetails.click();

    }
    @When("user writes in the field current password his current password {string}")
    public void user_writes_in_the_field_current_password_his_current_password(String string) {
        accountDetailsPage.currentPasswort.sendKeys(string);

    }
    @When("user writes in the field new password his new password {string}")
    public void user_writes_in_the_field_new_password_his_new_password(String string) {
        accountDetailsPage.newPasswort.sendKeys(string);

    }
    @When("user writes in the field confirm new password his new password {string}")
    public void user_writes_in_the_field_confirm_new_password_his_new_password(String string) {
        accountDetailsPage.confirmNewPasswort.sendKeys(string);
    }
    @When("user clicks on the Save Changes button")
    public void user_clicks_on_the_save_changes_button() {
        accountDetailsPage.saveChangesButton.click();
    }
    @Then("verify that the password change confirmation is displayed")
    public void verify_that_the_password_change_confirmation_is_displayed() {
        String exp = "Kontodetails erfolgreich geändert.";
        String act = accountDetailsPage.passwordChangeConfirmation.getText();

    }


}



