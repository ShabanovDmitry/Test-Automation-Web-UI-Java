package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App_test1
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


        driver.findElement(By.xpath(".//div[@id=\"stickyHeader\"]//input")).sendKeys("шопен");
        driver.findElement(By.xpath(".//div[@id=\"stickyHeader\"]//input")).submit();
        driver.findElement(By.xpath(".//span//span[text()=\"Татьяна Веретенникова: Шопен. Повелитель звуков\"]")).click();
        driver.findElement(By.xpath(".//div[@data-widget=\"webPdpGrid\"]//div[@data-widget=\"webPdpGrid\"]//span//span[text()=\"Добавить в корзину\"]")).click();


        driver.quit();
    }
}