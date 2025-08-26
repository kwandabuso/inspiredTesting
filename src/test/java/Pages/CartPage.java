package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class CartPage {
    public WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public CheckoutPage verifyProductAddedtoCart()
    {
        List<WebElement> cartProductList = driver.findElements(By.cssSelector("[class='product-name']"));
        boolean isProductOnCartPage = false;
        for (WebElement webElement : cartProductList) {
            String product =  webElement.getText();
            if(product.equalsIgnoreCase("Build your own cheap computer"))
            {
                isProductOnCartPage = true;
                break;

            }
        }
        assertTrue(isProductOnCartPage);
        return new CheckoutPage(driver);

    }
}
