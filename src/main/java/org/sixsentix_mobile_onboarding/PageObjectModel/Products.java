package org.sixsentix_mobile_onboarding.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.sixsentix_mobile_onboarding.Base.Base;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class Products extends Base {

    public Products(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }



    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    public MobileElement FirstProduct;

    @AndroidFindBy(accessibility = "Add To Cart button")
    public MobileElement AddToCart;

    //@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]")
    //public MobileElement SmallCart;
    @AndroidFindAll({
            @AndroidBy(id = "cart badge"),
            @AndroidBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]")
    })
    private MobileElement SmallCart;

    //@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]/android.widget.TextView")
    @AndroidFindBy( uiAutomator = "new UiSelector().textContains(\"Proceed\")")
    public MobileElement CheckoutButton;

    @AndroidFindBy(accessibility = "Full Name* input field")
    public MobileElement FullName;

    @AndroidFindBy(accessibility = "Address Line 1* input field")
    public MobileElement Address;

    @AndroidFindBy(accessibility = "City* input field")
    public MobileElement City;

    @AndroidFindBy(accessibility = "Zip Code* input field")
    public MobileElement Zip;

    @AndroidFindBy(accessibility = "Country* input field")
    public MobileElement Country;

    @AndroidFindBy(accessibility = "To Payment button")
    public MobileElement ToPaymentButton;

    @AndroidFindBy(accessibility = "Full Name* input field")
    public MobileElement CardFullName;

    @AndroidFindBy(accessibility = "Card Number* input field")
    public MobileElement CardNumber;

    @AndroidFindBy(accessibility = "Expiration Date* input field")
    public MobileElement ExpirationDate;

    @AndroidFindBy(accessibility = "Security Code* input field")
    public MobileElement SecurityCode;

    //@AndroidFindBy(accessibility = "Review Order button")
    //public MobileElement ReviewOrder;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Review Order button\"]")
    public MobileElement ReviewOrder;

    @AndroidFindBy( uiAutomator = "new UiSelector().textContains(\"Place\")")
    public MobileElement PlaceOrder;

    @AndroidFindBy( uiAutomator = "new UiSelector().textContains(\"order has been dispatched\")")
    public MobileElement OrderPlaced;



    public void clickOnFirstProduct(){ click(FirstProduct); }
    public void clickOnAddToCart(){ click(AddToCart); }
    public void clickOnSmallCart(){ click(SmallCart); }
    public void clickOnCheckoutButton(){ click(CheckoutButton); }
    public void clickOnFullName(){ click(FullName); }
    public void clickOnAddress(){ click(Address); }
    public void clickOnCity(){ click(City); }
    public void clickOnZip(){ click(Zip); }
    public void clickOnCountry(){ click(Country); }
    public void clickOnToPaymentButton(){ click(ToPaymentButton); }
    public void clickOnCardFullName(){ click(CardFullName); }
    public void clickOnCardNumber(){ click(CardNumber); }
    public void clickOnExpirationDate(){ click(ExpirationDate); }
    public void clickOnSecurityCode(){ click(SecurityCode); }
    public void clickOnReviewOrder(){ click(ReviewOrder); }
    public void clickOnPlaceOrder(){ click(PlaceOrder); }

    public void enterFullName(String fullname){
        sendText(FullName, fullname);
    }
    public void enterAddress(String address){
        sendText(Address, address);
    }
    public void enterCity(String city){
        sendText(City, city);
    }
    public void enterZip(String zip){
        sendText(Zip, zip);
    }
    public void enterCountry(String country){
        sendText(Country, country);
    }
    public void enterCardFullName(String cardfullname){
        sendText(CardFullName, cardfullname);
    }
    public void enterCardNumber(String cardnumber){
        sendText(CardNumber, cardnumber);
    }
    public void enterExpirationDate(String expirationdate){
        sendText(ExpirationDate, expirationdate);
    }
    public void enterSecurityCode(String securitycode){
        sendText(SecurityCode, securitycode);
    }
    public void populateOrderDetails(String fullname, String address, String city, String zip, String country) throws InterruptedException {
        clickOnFullName();
        enterFullName(fullname);
        clickOnAddress();
        enterAddress(address);
        driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Zip Code*\"));")).click();
        clickOnCity();
        enterCity(city);
        clickOnZip();
        enterZip(zip);
        clickOnCountry();
        enterCountry(country);
        clickOnToPaymentButton();
    }

        public void populateCardDetails(String cardfullname, String cardnumber, String expirationdate, String securitycode) throws InterruptedException {
            clickOnCardFullName();
            enterCardFullName(cardfullname);
            clickOnCardNumber();
            enterCardNumber(cardnumber);
            clickOnExpirationDate();
            enterExpirationDate(expirationdate);
            clickOnSecurityCode();
            enterSecurityCode(securitycode);
            Thread.sleep(2000);
            clickOnReviewOrder();
            clickOnReviewOrder();
            clickOnPlaceOrder();

        }

    }









