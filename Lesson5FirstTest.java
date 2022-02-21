package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;


public class Lesson5FirstTest {


static WebDriver driver;


    @BeforeAll
    static void all() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterAll
    static void after() {
        driver.quit();
    }


    @Test
    void test1() {
        driver.get("https://www.ozon.ru/");
        driver.findElement(By.xpath(".//div[@id=\"stickyHeader\"]//input")).sendKeys("шопен");
        driver.findElement(By.xpath(".//div[@id=\"stickyHeader\"]//input")).submit();
        driver.findElement(By.xpath(".//span//span[text()=\"Татьяна Веретенникова: Шопен. Повелитель звуков\"]")).click();
        driver.findElement(By.xpath(".//div[@data-widget=\"webPdpGrid\"]//div[@data-widget=\"webPdpGrid\"]//span//span[text()=\"Добавить в корзину\"]")).click();

        Assertions.assertEquals("Книга \"Татьяна Веретенникова: Шопен. Повелитель звуков\" – купить книгу ISBN 978-5-94663-109-9 с быстрой доставкой в интернет-магазине OZON", driver.getTitle(), "Не та страница");
    }


    @Test
    void test2() throws InterruptedException {
        driver.get("https://www.ozon.ru/");
        driver.findElement(By.xpath(".//div[@data-widget=\"topBar\"]//button")).click();
        driver.findElement(By.xpath(".//label//input")).sendKeys("Екатеринбург");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div//ul//a[@href='#']")).click();
        driver.findElement(By.xpath(".//a[@href='/info/map/']//span[text()=\"Пункты выдачи\"]")).click();
        Thread.sleep(2000);

        Assertions.assertEquals("https://www.ozon.ru/geo/ekaterinburg/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//div[@data-widget=\"topBar\"]//button")).click();
        driver.findElement(By.xpath(".//label//input")).sendKeys("Оренбург");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div//ul//a[@href='#']")).click();

        Assertions.assertNotEquals("https://www.ozon.ru/geo/orenburg/", driver.getCurrentUrl(), "Не та страница");
    }

    @Test
    void test3() throws InterruptedException {
        driver.get("https://www.ozon.ru/");
        driver.findElement(By.xpath(".//ul[@data-widget=\"horizontalMenu\"]//a[@href='/category/elektronika-15500/']")).click();
        driver.findElement(By.xpath(".//div[@data-widget=\"objectLine\"]//a[@href='/category/televizory-15528/']")).click();
        driver.findElement(By.xpath(".//label//span[text()=\"LG\"]")).click();

        Thread.sleep(2000);

        Assertions.assertEquals("https://www.ozon.ru/category/televizory-15528/lg-23969305/", driver.getCurrentUrl(), "Не та страница");
    }


    @Test
    void test5() throws InterruptedException {
        driver.get("https://www.ozon.ru/");

        driver.findElement(By.xpath(".//a[@href='/highlight/top-fashion/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/top-fashion/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/highlight/premium/' and @style]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/premium/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='https://www.ozon.ru/travel?perehod=ozon_menu_header']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/travel/?perehod=ozon_menu_header", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Ozon Счёт\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/keshbek-do-30-dlya-ozon-schet-i-premium-323369/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/live/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/live/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/info/actions/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/info/actions/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/brand/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/brand/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/seller/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/seller/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Сертификаты\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("Электронный подарочный сертификат Миллион подарков (3000) - купить по выгодной цене в интернет-магазине OZON", driver.getTitle(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Электроника\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/elektronika-15500/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[@href='/info/main-apparel/']")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/info/main-apparel/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Детские товары\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/detskie-tovary-7000/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Дом и сад\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/category/dom-i-sad-14500/", driver.getCurrentUrl(), "Не та страница");

        driver.findElement(By.xpath(".//a[text()=\"Зона лучших цен\"]")).click();
        Thread.sleep(2000);
        Assertions.assertEquals("https://www.ozon.ru/highlight/zona-luchshih-tsen-273550/", driver.getCurrentUrl(), "Не та страница");
    }


}