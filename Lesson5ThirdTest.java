package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Lesson5ThirdTest {

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
    void test6() throws InterruptedException {
        driver.get("https://www.ozon.ru/");

        Thread.sleep(6000);
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

        driver.findElement(By.xpath(".//span[text()=\"Версия для слабовидящих\"]")).click();
        Assertions.assertEquals("https://www.ozon.ru/?accessibilityMode=1", driver.getCurrentUrl(), "Не та страница");

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
