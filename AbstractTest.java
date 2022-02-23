package org.example.lesson6;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    static WebDriver webDriver;
    static EventFiringWebDriver eventDriver;


    @BeforeAll
    static void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        //options.setPageLoadTimeout(Duration.ofSeconds(10));
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.ozon.ru/");
        eventDriver = new EventFiringWebDriver(new ChromeDriver(options));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeEach
    void initMainPage(){
        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://www.ozon.ru/"),
                "Страница не доступна");
        Assertions.assertTrue(true);

    }

    @AfterAll
    public static void exit(){

        if(webDriver !=null) webDriver.quit();
    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }
}