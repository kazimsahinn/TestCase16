package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class signupPage {
    public signupPage() { PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(xpath = "//*[@name='name']")
    public WebElement name;
    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement email;
    @FindBy(xpath = "(//*[@class='btn btn-default'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement Mr;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//*[@class='title text-center'])[1]")
    public WebElement accountInformationText;
    @FindBy(xpath = "//*[@id=\"days\"]/option[8]")
    public WebElement day;
    @FindBy(xpath = "//*[@id=\"months\"]/option[8]")
    public WebElement month;

    @FindBy(xpath = "//*[@id=\"months\"]/option[7]")
    public WebElement year;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address;
    @FindBy(xpath = "//*[@id=\"country\"]/option[2]")
    public WebElement country;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement mobilNumber;
    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement createAccount;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement accountCreated;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement continueButton;




}
