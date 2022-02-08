package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App_test3
{
    public static void main( String[] args ) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ozon.ru/");


        driver.findElement(By.xpath(".//a[@href='/category/elektronika-15500/' and @class=\"fx2 br7\"]")).click();
        driver.findElement(By.xpath(".//a[@href='/category/televizory-15528/' and @class=\"fx2 u3aa\"]")).click();
        driver.findElement(By.xpath(".//a[@href='/category/televizory-15528/?brand=23969305']")).click();


        driver.quit();
    }
}