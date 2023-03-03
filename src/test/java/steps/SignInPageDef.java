package steps;

import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    @Then("Enter login")
    public void enterLogin() {
        signInPage.enterLogin("sasa");
    }

    @Then("Enter password")
    public void enterPassword() {
        signInPage.enterPassword("sasa2");
    }
}
