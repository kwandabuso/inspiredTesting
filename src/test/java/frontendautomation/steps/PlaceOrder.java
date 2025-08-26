package frontendautomation.steps;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class PlaceOrder {
    LoginPage loginPage;
    HomePage homepage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("I am on the demo web shop")
    public void i_am_on_the_demo_web_shop() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.isHomePageDisplayed();

    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        homepage = loginPage.login();
    }

    @When("I Navigate to desktops")
    public void i_navigate_to_desktops() throws InterruptedException {
        homepage.navigateToDesktop();
    }

    @When("I add product to cart")
    public void i_select_computers() throws InterruptedException {
        cartPage = homepage.addProductToCart();
    }


    @Then("the item is added to your cart")
    public void the_item_is_added_to_your_cart() {
        checkoutPage = cartPage.verifyProductAddedtoCart();
    }

    @When("I click the checkout button")
    public void i_click_the_checkout_button() {
        checkoutPage.navigateToCheckoutPage();
    }

    @Then("checkout page is open")
    public void checkout_page_is_open() {
        checkoutPage.ispagedisplayed();
    }

    @When("I enter the billing address")
    public void i_enter_the_billing_address() throws InterruptedException {
        checkoutPage.enterBillingAddress();
    }


    @And("I enter Shipping address")
    public void iEnterShippingAddress() throws InterruptedException {
        checkoutPage.enterShippingAddress();

    }

    @And("I enter Shipping method")
    public void iEnterShippingMethod() throws InterruptedException {
        checkoutPage.enterShippingMethod();

    }

    @And("I enter Payment method")
    public void iEnterPaymentMethod() throws InterruptedException {
        checkoutPage.enterPaymentInfo();

    }

    @And("I enter Payment information")
    public void iEnterPaymentInformation() throws InterruptedException {
        checkoutPage.enterPaymentInfo();

    }

    @And("I place the order")
    public void iPlaceTheOrder() throws InterruptedException {
        checkoutPage.placeOrder();
    }

    @Then("the order is processed successfully")
    public void the_order_is_processed_successfully() {
        checkoutPage.validateOrderhasBeenPlacedSuccessfully();
    }

}
