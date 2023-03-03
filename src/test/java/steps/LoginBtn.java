package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class LoginBtn {
    @Then("Click {string} btn")
    public void clickBtn(String arg0) {
        BasePage basePage = new BasePage();
        basePage.clickBtn(arg0);
    }
}
