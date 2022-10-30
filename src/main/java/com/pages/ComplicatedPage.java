package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplicatedPage {

    @FindBy(xpath="(//a[text()='Dresses'])[1]")
    public WebElement Dress;

    @FindBy(xpath="//div[@id='categories_block_left']//a")
    public WebElement CasualDress;

    @FindBy(xpath="//div[@class='left-block']")
    public WebElement PrintedDress;

    @FindBy(xpath="//span[text()='Add to cart']")
    public WebElement AddToCart;

    @FindBy(xpath="(//a[@rel='nofollow'])[5]//span")
    public WebElement ProccedToCheckout;

    @FindBy(xpath="(//a[@rel='nofollow'])[8]")
    public WebElement Delete;


}
