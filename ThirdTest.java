package org.example.lesson6;

import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


@Story("Пользовательская история")
public class ThirdTest extends AbstractTest{


    @Link("https://www.ozon.ru/")
    @Test
    void test4() throws InterruptedException {
        Thread.sleep(5000);
        getWebDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        getWebDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        new ThirdPage(getWebDriver()).navigateCV();

        Assertions.assertEquals("https://www.ozon.ru/?accessibilityMode=1",getWebDriver().getCurrentUrl());
    }
}
