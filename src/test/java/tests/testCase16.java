package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cartPage;
import pages.homePage;
import pages.signupPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class testCase16 {

    @Test
    public void testCase16() {

        homePage homePage = new homePage();
        signupPage signupPage = new signupPage();
        cartPage cartPage = new cartPage();


        Driver.getDriver().get(ConfigReader.getProperty("automationURL"));
        ReusableMethods.waitForVisibility(homePage.logo,10);
        ReusableMethods.waitForClickablility(homePage.signUpButton,10);
        homePage.signUpButton.click();
        ReusableMethods.waitForVisibility(signupPage.name,10);
        signupPage.name.sendKeys(ConfigReader.getProperty("UserName"));
        signupPage.email.sendKeys(ConfigReader.getProperty("UserMail"));
        signupPage.signupButton.click();
        Assert.assertTrue(signupPage.accountInformationText.isDisplayed());
        signupPage.Mr.click();
        signupPage.password.sendKeys(ConfigReader.getProperty("Password"));
        signupPage.day.click();
        signupPage.month.click();
        signupPage.year.click();
        signupPage.firstName.sendKeys(ConfigReader.getProperty("UserName"));
        signupPage.lastName.sendKeys("Sahin");
        signupPage.address.sendKeys("Istanbul");
        signupPage.country.click();
        signupPage.state.sendKeys("Florida");
        signupPage.city.sendKeys("Miami");
        signupPage.zipcode.sendKeys("33101");
        signupPage.mobilNumber.sendKeys("+905654656");
        signupPage.createAccount.click();
        ReusableMethods.waitForVisibility(signupPage.accountCreated,10);
        Assert.assertTrue(signupPage.accountCreated.isDisplayed());
        signupPage.continueButton.click();




        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(homePage.product).moveToElement(homePage.product).click(homePage.addCartProduct).perform();

        homePage.continueShopping.click();
        homePage.cart.click();
        ReusableMethods.waitForVisibility(cartPage.proceedToCheckout,10);
        Assert.assertTrue(cartPage.proceedToCheckout.isDisplayed());
        cartPage.proceedToCheckout.click();
        String deliveryAddressText = cartPage.deliveryAddress.getText();
        String billingAddressText = cartPage.billingAddress.getText();
        Assert.assertEquals(deliveryAddressText,billingAddressText);
        cartPage.descriptionText.sendKeys("You can leave my order to security.");
        cartPage.placeOrder.click();
        ReusableMethods.waitForVisibility(cartPage.cardName,10);
        cartPage.cardName.sendKeys("45649321654");
        cartPage.cardNumber.sendKeys("321654");
        cartPage.cvc.sendKeys("321");
        cartPage.exprirationMM.sendKeys("10");
        cartPage.exprirationYY.sendKeys("2028");
        cartPage.payConfirmOrder.click();
        ReusableMethods.waitForVisibility(cartPage.orderPlaced,10);
        cartPage.orderPlaced.isDisplayed();
        cartPage.deleteAccount.click();
        ReusableMethods.waitForVisibility(cartPage.accountDeleted,10);
        cartPage.accountDeleted.isDisplayed();
        cartPage.continueButton.click();

        Driver.getDriver().quit();




    }
}
