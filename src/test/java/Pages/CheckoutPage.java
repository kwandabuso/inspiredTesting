package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void navigateToCheckoutPage() {
        WebElement terms = driver.findElement(By.id("termsofservice"));
        if (!terms.isSelected()) terms.click();
        driver.findElement(By.id("checkout")).click();

    }
    public void ispagedisplayed()
    {
        assertTrue(driver.findElement(By.id("opc-billing")).isDisplayed());
    }

    public void enterBillingAddress() throws InterruptedException {

        // 6. Billing address - use existing
        try {
            Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
            country.selectByVisibleText("South Africa");
            driver.findElement(By.id("BillingNewAddress_City")).sendKeys("New York");
            driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("123 Main St");
            driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("10001");
            driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
        } catch (Exception ex) {

        }
        driver.findElement(By.cssSelector("input.button-1.new-address-next-step-button")).click();
    }
    public void enterShippingAddress() throws InterruptedException {


        // 7. Shipping address - continue
        driver.findElement(By.id("PickUpInStore")).click();
        driver.findElement(By.cssSelector("#shipping-buttons-container [title='Continue']")).click();
    }
    public void enterShippingMethod() throws InterruptedException {
        // 8. Shipping method - continue
        driver.findElement(By.cssSelector("#payment-method-buttons-container input")).click();

    }
    public void enterPaymentInfo() throws InterruptedException {

        // 9. Payment info - continue
        driver.findElement(By.cssSelector("#payment-info-buttons-container input")).click();
    }
    public void placeOrder() throws InterruptedException {
        // 10. Confirm order
        driver.findElement(By.cssSelector("input.button-1.confirm-order-next-step-button")).click();

    }

    public void validateOrderhasBeenPlacedSuccessfully()
    {
        // 11. Validate success
        String confirmation = driver.findElement(By.cssSelector("div.title")).getText();
        assert confirmation.contains("Your order has been successfully processed!");
    }
}

