package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends AbstractPage {

    public FirstPage(WebDriver driver) {
        super(driver);
    }

//test1
    @FindBy(xpath = ".//div[@id=\"stickyHeader\"]//input")
    private WebElement input;

    @FindBy(xpath = ".//span//span[text()=\"Татьяна Веретенникова: Шопен. Повелитель звуков\"]")
    private WebElement element;

    @FindBy(xpath = ".//div[@data-widget=\"webPdpGrid\"]//div[@data-widget=\"webPdpGrid\"]//span//span[text()=\"Добавить в корзину\"]")
    private WebElement addToCart;

    public void navigateInput(){
        this.input.sendKeys("шопен");
        this.input.submit();
    }
    public void navigateElement(){
        this.element.click();
    }
    public void navigateAddToCart(){
        this.addToCart.click();
    }

//test2
    @FindBy(xpath = ".//div[@data-widget=\"topBar\"]//button")
    private WebElement changeTown;

    @FindBy(xpath = ".//label//input")
    private WebElement clickTown;

    @FindBy(xpath = ".//div//ul//a[@href='#']")
    private WebElement choseTown;

    @FindBy(xpath = ".//a[@href='/info/map/']//span[text()=\"Пункты выдачи\"]")
    private WebElement map;

    public void navigateChangeTown(){
        this.changeTown.click();
    }
    public void navigateClick1Town() {
        this.clickTown.sendKeys("Екатеринбург");
    }
    public void navigateClick2Town() {
        this.clickTown.sendKeys("Оренбург");
    }
    public void navigateChoseTown(){
        this.choseTown.click();
    }
    public void navigateMap(){
        this.map.click();
    }

//test3
    @FindBy(xpath = ".//ul[@data-widget=\"horizontalMenu\"]//a[@href='/category/elektronika-15500/']")
    private WebElement electronic;

    @FindBy(xpath = ".//div[@data-widget=\"objectLine\"]//a[@href='/category/televizory-15528/']")
    private WebElement tv;

    @FindBy(xpath = ".//label//span[text()=\"LG\"]")
    private WebElement lg;

    public void navigateElectronic(){
        this.electronic.click();
    }
    public void navigateTV(){
        this.tv.click();
    }
    public void navigateLG(){
        this.lg.click();
    }

//test5
    @FindBy(xpath = ".//a[@href='/highlight/top-fashion/']")
    private WebElement topFashion;

    @FindBy(xpath = ".//a[@href='/highlight/premium/' and @style]")
    private WebElement premium;

    @FindBy(xpath = ".//a[@href='https://www.ozon.ru/travel?perehod=ozon_menu_header']")
    private WebElement travel;

    @FindBy(xpath = ".//a[text()=\"Ozon Счёт\"]")
    private WebElement check;

    @FindBy(xpath = ".//a[@href='/live/']")
    private WebElement live;

    @FindBy(xpath = ".//a[@href='/info/actions/']")
    private WebElement actions;

    @FindBy(xpath = ".//a[@href='/brand/']")
    private WebElement brand;

    @FindBy(xpath = ".//a[@href='/seller/']")
    private WebElement seller;

    @FindBy(xpath = ".//a[text()=\"Сертификаты\"]")
    private WebElement certificates;

    @FindBy(xpath = ".//a[text()=\"Электроника\"]")
    private WebElement electronica;

    @FindBy(xpath = ".//a[@href='/category/zhenskaya-odezhda-7501/']")
    private WebElement mainApparel;

    @FindBy(xpath = ".//a[text()=\"Детские товары\"]")
    private WebElement children;

    @FindBy(xpath = ".//a[text()=\"Дом и сад\"]")
    private WebElement houseAndGarden;

    @FindBy(xpath = ".//a[text()=\"Зона лучших цен\"]")
    private WebElement bestValue;

    public void navigateTopFashion(){
        this.topFashion.click();
    }
    public void navigatePremium(){
        this.premium.click();
    }
    public void navigateTravel(){
        this.travel.click();
    }
    public void navigateCheck(){
        this.check.click();
    }
    public void navigateLive(){
        this.live.click();
    }
    public void navigateActions(){
        this.actions.click();
    }
    public void navigateBrand(){
        this.brand.click();
    }
    public void navigateSeller(){
        this.seller.click();
    }
    public void navigateCertificates(){
        this.certificates.click();
    }
    public void navigateElectronica(){
        this.electronica.click();
    }
    public void navigateMainApparel(){
        this.mainApparel.click();
    }
    public void navigateChildren(){
        this.children.click();
    }
    public void navigateHouseAndGarden(){
        this.houseAndGarden.click();
    }
    public void navigateBestValue(){
        this.bestValue.click();
    }

}
