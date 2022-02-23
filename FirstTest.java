package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FirstTest extends AbstractTest {


    @Test
    void test1() {
        new FirstPage(getWebDriver()).navigateInput();
        new FirstPage(getWebDriver()).navigateElement();
        new FirstPage(getWebDriver()).navigateAddToCart();

        Assertions.assertTrue(getWebDriver().findElement(By.xpath(".//h1")).getText().equals("Татьяна Веретенникова: Шопен. Повелитель звуков"));
    }

    @Test
    void test2() throws InterruptedException {
        new FirstPage(getWebDriver()).navigateChangeTown();
        new FirstPage(getWebDriver()).navigateClick1Town();
        Thread.sleep(2000);
        new FirstPage(getWebDriver()).navigateChoseTown();
        new FirstPage(getWebDriver()).navigateMap();
        Thread.sleep(2000);

        Assertions.assertEquals("https://www.ozon.ru/geo/ekaterinburg/",getWebDriver().getCurrentUrl());

        new FirstPage(getWebDriver()).navigateChangeTown();
        new FirstPage(getWebDriver()).navigateClick2Town();
        Thread.sleep(2000);
        new FirstPage(getWebDriver()).navigateChoseTown();
        Thread.sleep(2000);

        Assertions.assertNotEquals("https://www.ozon.ru/geo/orenburg/",getWebDriver().getCurrentUrl());
    }

    @Test
    void test3() throws InterruptedException {
        new FirstPage(getWebDriver()).navigateElectronic();
        new FirstPage(getWebDriver()).navigateTV();
        new FirstPage(getWebDriver()).navigateLG();
        Thread.sleep(2000);

        Assertions.assertEquals("https://www.ozon.ru/category/televizory-15528/lg-23969305/",getWebDriver().getCurrentUrl());
    }

    @Test
    void test5() throws InterruptedException {
        new FirstPage(getWebDriver()).navigateTopFashion();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/top-fashion/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigatePremium();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/premium/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateTravel();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/travel/?perehod=ozon_menu_header",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateCheck();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/keshbek-do-30-dlya-ozon-schet-i-premium-323369/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateLive();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/live/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateActions();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/info/actions/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateBrand();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/brand/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateSeller();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/seller/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateCertificates();
        Thread.sleep(2000);
        Assertions.assertTrue(getWebDriver().findElement(By.xpath(".//h1")).getText().equals("ozon Электронный подарочный сертификат Миллион подарков (3000)"));
        new FirstPage(getWebDriver()).navigateElectronica();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/elektronika-15500/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateMainApparel();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/zhenskaya-odezhda-7501/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateChildren();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/detskie-tovary-7000/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateHouseAndGarden();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/dom-i-sad-14500/",getWebDriver().getCurrentUrl());
        new FirstPage(getWebDriver()).navigateBestValue();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/zona-luchshih-tsen-273550/",getWebDriver().getCurrentUrl());
    }
}