package StepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import org.TestDriverMenager.TestDriverManager;
import org.sixsentix_mobile_onboarding.PageObjectModel.Login;
import org.sixsentix_mobile_onboarding.PageObjectModel.Logout;
import org.sixsentix_mobile_onboarding.PageObjectModel.Products;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.net.MalformedURLException;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class Steps extends TestDriverManager {

    Login loginCucumber;

    Logout logoutCucumber;

    Products ProductsCucumber;

    String message = "has been dispatched";

    SoftAssert softAssert = new SoftAssert();

    //TouchAction touchActionLogout = new TouchAction(driver);



    @Given("The user is on login page")
    public void the_user_is_on_login_page() throws MalformedURLException, InterruptedException {
                getAppiumDriver("Android");
                loginCucumber = new Login(driver);
                logoutCucumber = new Logout(driver);
                ProductsCucumber = new Products(driver);
                //System.out.println("The user is on login page");
            }


    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() throws InterruptedException {
        loginCucumber.logIn("bob@example.com", "10203040");
        //System.out.println("Entered user name and password");

    }
    @When("The user select one product")
    public void the_user_select_one_product()  {
        ProductsCucumber.clickOnFirstProduct();

    }
    @When("User add that product to the cart")
    public void user_add_that_product_to_the_cart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Add To Cart\"));")).click();
        //ProductsCucumber.clickOnAddToCart();
        Thread.sleep(3000);
    }

    @When("User should finish shoping and pay product")
    public void user_should_finish_shoping_and_pay_product() throws InterruptedException {
        ProductsCucumber.clickOnSmallCart();
        ProductsCucumber.clickOnCheckoutButton();
        ProductsCucumber.populateOrderDetails("Djordje Popov","Zmaj Jovina", "Beograd", "11000", "Srbija");
        ProductsCucumber.populateCardDetails("Djordje Popov", "325812657568789", "06/25", "123");

    }
    @Then("The use successfully bought product")
    public void the_use_successfully_bought_product() throws InterruptedException {

        System.out.println("Value that i want to verify: "+ ProductsCucumber.OrderPlaced.getText());
        softAssert.assertTrue(message.contains(ProductsCucumber.OrderPlaced.getText()), "Verification passed");
        logoutCucumber.logOut();

    }
}
