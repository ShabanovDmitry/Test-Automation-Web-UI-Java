package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App_test2
{
    public static void main( String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ozon.ru/");


        driver.findElement(By.xpath(".//div[@class=\"ec5 ui-b1\"]//button[@class=\"ui-b3\"]//span[@class=\"ui-e7\"]")).click();
        driver.findElement(By.xpath(".//input[@class=\"ui-g1 ui-g4\"]")).sendKeys("Екатеринбург");
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//a[@class=\"fx4\"]")).click();
        driver.findElement(By.xpath(".//div[@class=\"ui-h6\"]//span[text()=\"Пункты выдачи\"]")).click();
        driver.findElement(By.xpath(".//div[@class=\"ec5 ui-b1\"]//button[@class=\"ui-b3\"]//span[@class=\"ui-e7\"]")).click();
        driver.findElement(By.xpath(".//input[@class=\"ui-g1 ui-g4\"]")).sendKeys("Оренбург");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//a[@class=\"fx4\"]")).click();


        driver.quit();
    }
}