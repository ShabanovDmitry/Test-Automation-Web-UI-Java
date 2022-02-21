package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Lesson5SecondTest {

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
    void test4() throws InterruptedException {
        driver.get("https://www.ozon.ru/");
        driver.findElement(By.xpath(".//a[@href='/cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//button[span[@style=\"border-radius: 50%;\"]]")).click();
        driver.findElement(By.xpath(".//div[@type=\"addToCartButtonWithQuantity\"]//button")).click();
        driver.findElement(By.xpath(".//div[@data-widget=\"controls\"]//span")).click();
        driver.findElement(By.xpath(".//span//span[text()=\"Удалить\"]")).click();
        Thread.sleep(2000);

        Assertions.assertNotNull(driver.findElement(By.xpath("//h1")));
    }
}
