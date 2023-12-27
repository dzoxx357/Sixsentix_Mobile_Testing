package org.Android;

import org.TestDriverMenager.TestDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sixsentix_mobile_onboarding.PageObjectModel.Login;
import org.sixsentix_mobile_onboarding.PageObjectModel.Logout;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PoC extends TestDriverManager {

    Login loginPoM;

    Logout logoutPoM;

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        getAppiumDriver("Android");
        loginPoM = new Login(driver);
        logoutPoM = new Logout(driver);
        System.out.println("Started app");
    }

    @Test
    public void startApp() throws InterruptedException {
        loginPoM.logIn("bob@example.com", "10203040");
        logoutPoM.logOut();
        Thread.sleep(2000);
        Assert.assertEquals("You are successfully logged out.", logoutPoM.successfullyLogoutMessage.getText(), "failed");

    }
    @AfterTest
    public void cleanUp() throws InterruptedException {
//        Thread.sleep(2000);
        driver.removeApp("com.saucelabs.mydemoapp.rn");
        driver.quit();
    }

}
