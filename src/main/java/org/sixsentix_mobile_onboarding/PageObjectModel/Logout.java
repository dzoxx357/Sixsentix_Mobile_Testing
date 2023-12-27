package org.sixsentix_mobile_onboarding.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.sixsentix_mobile_onboarding.Base.Base;
import org.testng.asserts.SoftAssert;


public class Logout extends Base {

    SoftAssert softAssert = new SoftAssert();

    String logoutmessage = "logged out";



    public Logout(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "open menu")
    public MobileElement burgerMenu;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item log out")
    public MobileElement logOutBtn;


    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
//    @AndroidFindBy( uiAutomator = "new UiSelector().textContains(\"LOG OU\")")
    @AndroidFindBy( id = "android:id/button1")
    public MobileElement logoutDialog;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(id = "android:id/alertTitle")
    public MobileElement successfullyLogoutMessage;

    public void clickOnBurger(){
        click(burgerMenu);
    }

    public void logOutBtnMain(){
        click(logOutBtn);
    }
    public void logOutBtnDialog(){
        click(logoutDialog);
    }

    public void logOut() throws InterruptedException {



        clickOnBurger();
        logOutBtnMain();
        logOutBtnDialog();
        Thread.sleep(2000);
        softAssert.assertTrue(logoutmessage.contains(successfullyLogoutMessage.getText()), "Verification passed");
        logOutBtnDialog();

    }


}
