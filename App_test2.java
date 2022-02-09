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


        driver.findElement(By.xpath(".//div[@data-widget=\"topBar\"]//button")).click();
        driver.findElement(By.xpath(".//label//input")).sendKeys("Екатеринбург");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div//ul//a[@href='#']")).click();
        driver.findElement(By.xpath(".//a[@href='/info/map/']//span[text()=\"Пункты выдачи\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div[@data-widget=\"topBar\"]//button")).click();
        driver.findElement(By.xpath(".//label//input")).sendKeys("Оренбург");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//div//ul//a[@href='#']")).click();


        driver.quit();
    }
}