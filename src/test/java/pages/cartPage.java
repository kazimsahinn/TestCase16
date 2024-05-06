package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class cartPage {

    public cartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement deliveryAddress;
    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[2]")
    public WebElement billingAddress;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement descriptionText;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrder;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement cardName;
    @FindBy(xpath = "//*[@class='form-control card-number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//*[@class='form-control card-cvc']")
    public WebElement cvc;
    @FindBy(xpath = "//*[@class='form-control card-expiry-month']")
    public WebElement exprirationMM;
    @FindBy(xpath = "//*[@class='form-control card-expiry-year']")
    public WebElement exprirationYY;
    @FindBy(xpath = "//*[@class='form-control btn btn-primary submit-button']")
    public WebElement payConfirmOrder;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement orderPlaced;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement deleteAccount;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement accountDeleted;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement continueButton;





}
