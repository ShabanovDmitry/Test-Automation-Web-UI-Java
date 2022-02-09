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
        driver.findElement(By.xpath(".//button[span[@style=\"border-radius: 50%;\"]]")).click();
        driver.findElement(By.xpath(".//div[@type=\"addToCartButtonWithQuantity\"]//button")).click();
        driver.findElement(By.xpath(".//div[@data-widget=\"controls\"]//span")).click();
        driver.findElement(By.xpath(".//span//span[text()=\"Удалить\"]")).click();


        driver.quit();
    }
}