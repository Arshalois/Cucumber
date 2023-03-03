package pages;

import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement loginField = $(By.cssSelector("//*[@placeholder=\"Email\"]"));
    private SelenideElement passwordField = $(By.cssSelector("//*[@placeholder=\"Book Depository password\"]"));

    public void enterLogin(String login) {
        this.loginField.val(login);
    }
        public void enterPassword(String password){
            this.passwordField.val(password);
    }
}
