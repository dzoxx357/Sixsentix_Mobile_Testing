package org.sixsentix_mobile_onboarding.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sixsentix_mobile_onboarding.Base.Base;

public class Login extends Base {

        public Login(AppiumDriver appiumDriver) {
                super(appiumDriver);
        }

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "open menu")
        public MobileElement burgerMenu;

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "menu item log in")
        public MobileElement clickOnLogInField;

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "Username input field")
        public MobileElement userNameField;

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "Password input field")
        public MobileElement passNameField;

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "Login button")
        public MobileElement logInBtn;

        //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
        @AndroidFindBy(accessibility = "LogOut button")
        public MobileElement Logout;




        public void clickOnBurger(){
                click(burgerMenu);
        }

        public void clickOnLogInFieldAndProcced(){
                click(clickOnLogInField);
        }

        public void enterUsername(String username){
                sendText(userNameField, username);
        }

        public void enterPassword(String password){
                sendText(passNameField, password);
        }
        public void clickContinue(){
                click(logInBtn);
        }

        public void logIn(String username, String password) throws InterruptedException {
                Thread.sleep(1000);
                clickOnBurger();
                clickOnLogInFieldAndProcced();
                enterUsername(username);
                Thread.sleep(2000);
                enterPassword(password);
                clickContinue();

        }

}
