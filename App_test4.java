package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App_test4
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


        driver.findElement(By.xpath(".//a[@href='/cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div[@class=\"ui-j4\"]//div[@class=\"b2n\"]//button[@class=\"ui-b3\"]")).click();
        driver.findElement(By.xpath(".//div[@class=\"cp0\"]//button")).click();
        driver.findElement(By.xpath(".//div[@class=\"fy2\"]//span[@class=\"al2 a2l\"]")).click();
        driver.findElement(By.xpath(".//div[@class=\"ui-j4\"]//div[@class=\"a0n ui-b1\"]//button")).click();


        driver.quit();
    }
}