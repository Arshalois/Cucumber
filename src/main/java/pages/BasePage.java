package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public void clickBtn(String text){
       // $(By.xpath("//a[text()='Sign in/Join']")).click();
        $(By.xpath("//*[@class=\"header-search-btn\"]")).click();
    }
}
