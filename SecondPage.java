package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SecondPage extends AbstractPage {

    public SecondPage(WebDriver driver) {
        super(driver);
    }

//test4
    @FindBy(xpath = ".//a[@href='/cart']")
    private WebElement cart;

    @FindBy(xpath = ".//button[span[@style=\"border-radius: 50%;\"]]")
    private WebElement ad;

    @FindBy(xpath = ".//div[@type=\"addToCartButtonWithQuantity\"]//button")
    private WebElement addToCart;

    @FindBy(xpath = ".//div[@data-widget=\"controls\"]//span")
    private WebElement delete;

    @FindBy(xpath = ".//span//span[text()=\"Удалить\"]")
    private WebElement confirm;


    public void navigateCart(){
        this.cart.click();
    }
    public void navigateAd() {
        this.ad.click();
    }
    public void navigateAddToCart() {
        this.addToCart.click();
    }
    public void navigateDelete(){
        this.delete.click();
    }
    public void navigateConfirm(){
        this.confirm.click();
    }









}
