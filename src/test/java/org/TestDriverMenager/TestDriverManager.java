package org.TestDriverMenager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDriverManager {

    public static AppiumDriver driver;

    public AppiumDriver getAppiumDriver(String driverType) throws MalformedURLException {
        switch (driverType){
            case "iOS":
                DesiredCapabilities desCap = new DesiredCapabilities();
                desCap.setCapability("platformName", "iOS");
                desCap.setCapability("platformVersion", "15.5");
                desCap.setCapability("udid", "0BB5A406-2A33-4F41-98CA-35A62B57E62E");//13
                desCap.setCapability("deviceName", "iPhone 13");
//        desCap.setCapability("xcodeOrgId", "appleid@sixsentix.com");
                desCap.setCapability("xcodeOrgId", "xx");
                desCap.setCapability("xcodeSigningId", "iPhone Developer");
                desCap.setCapability("automationName", "XCUITest");
                desCap.setCapability("bundleId", "xx");
//        desCap.setCapability("autoAcceptAlerts", "true");
//        desCap.setCapability("safariAllowPopups", "true");
                desCap.setCapability("noReset", "true");
                desCap.setCapability("fullContextList", "true");
//        desCap.setCapability("printPageSourceOnFindFailure", "true");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desCap);
                break;
            case "Android":
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", "Android SDK built for x86");
                cap.setCapability("udid","emulator-5554");
                cap.setCapability("platformName", "Android");
                cap.setCapability("platformVersion","13");
                //path below install apk on start
                //cap.setCapability("app","C:/Users/esaciri/Desktop/Onboarding_sixsentix_app/Android-MyDemoAppRN.1.3.0.build-244.apk");
                cap.setCapability("app","C:/Users/djpopov/Downloads/Android-MyDemoAppRN.1.3.0.build-244.apk");
                //when this noReset flag is set to false it always uninstall and install apk on each run
                cap.setCapability("noReset", "true");
                cap.setCapability("fullContextList", "true");
                cap.setCapability("appPackage","com.saucelabs.mydemoapp.rn");
                cap.setCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
                driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        }
        return driver;
    }
}
