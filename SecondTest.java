package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class SecondTest extends AbstractTest{

    @Test
    void test4() {
        new SecondPage(getWebDriver()).navigateCart();
        new SecondPage(getWebDriver()).navigateAd();
        new SecondPage(getWebDriver()).navigateAddToCart();
        new SecondPage(getWebDriver()).navigateDelete();
        new SecondPage(getWebDriver()).navigateConfirm();

        Assertions.assertNotNull(getWebDriver().findElement(By.xpath("//h1")));
    }
}
