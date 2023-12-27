package org.sixsentix_mobile_onboarding.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.sixsentix_mobile_onboarding.Base.Base;

public class SideBar extends Base {

    public SideBar(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "open menu")
    public MobileElement burgerMenu;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item catalog")
    public MobileElement Catalog;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item webview")
    public MobileElement WebView;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item qr code scanner")
    public MobileElement QRcode;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item geo location")
    public MobileElement GeoLocation;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item drawing")
    public MobileElement Drawing;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item about")
    public MobileElement About;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item reset app")
    public MobileElement ResetApp;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item biometrics")
    public MobileElement MenuItem;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item log in")
    public MobileElement LogInField;

    //@iOSXCUITFindBy(iOSNsPredicate = "label == 'Log in'")
    @AndroidFindBy(accessibility = "menu item log out")
    public MobileElement logOut;

    public void clickOnCatalog(){
        click(Catalog);
    }
    public void clickOnWebView(){
        click(WebView);
    }
    public void clickOnQrCode(){
        click(QRcode);
    }
    public void clickOnGeoLocation(){
        click(GeoLocation);
    }
    public void clickOnDrawing(){
        click(Drawing);
    }
    public void clickOnAbout(){
        click(About);
    }
    public void clickOnResetApp(){
        click(ResetApp);
    }
    public void clickOnMenuItem(){
        click(MenuItem);
    }
    public void clickOnLogIn(){
        click(LogInField);
    }
    public void clickOnLogOut(){
        click(logOut);
    }
    public void clickOnBurgerMenu(){
        click(burgerMenu);
    }
    public void switchBetweenSideBarElements(){
        clickOnBurgerMenu();
        clickOnCatalog();
        clickOnBurgerMenu();
        clickOnWebView();
        clickOnBurgerMenu();
        clickOnAbout();
    }


}
