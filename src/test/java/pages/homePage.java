package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage {
    public homePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='logo pull-left']")
    public WebElement logo;
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement signUpButton;

    @FindBy(xpath = "(//*[@class='productinfo text-center'])[2]")
    public WebElement product;
    @FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[4]")
    public WebElement addCartProduct;
    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;
    @FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[1]")
    public WebElement cart;




}
