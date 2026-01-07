package de.ziyadem.step_definitions;

import de.ziyadem.pages.DashboardPage;
import de.ziyadem.pages.LoginPage;
import de.ziyadem.utils.BrowserUtils;
import io.cucumber.java.en.Given;

public class Login_Step_Defs {

    LoginPage loginPage = new LoginPage();


    @Given("user logs in with email {string} and password {string}")
    public void user_logs_in_with_email_and_password(String email, String pwd) {
        loginPage.login(email, pwd);
    }
}
