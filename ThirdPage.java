package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends AbstractPage {

    public ThirdPage(WebDriver driver) {
        super(driver);
    }

//test6
    @FindBy(xpath = ".//span[text()=\"Версия для слабовидящих\"]")
    private WebElement changeVersion;

    public void navigateCV(){
        this.changeVersion.click();
    }

}
