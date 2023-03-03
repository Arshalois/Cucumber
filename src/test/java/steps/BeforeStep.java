package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStep {
    Hooks hooks = new Hooks();
    @Given("Open the url {string}")
   public void openWebsite(String url) {
        open("https://www.bookdepository.com");

   // @When("Open the url {string}")
   // public void openTheUrl(String arg0) {
        //Selenide.open(arg0);
    }
}
