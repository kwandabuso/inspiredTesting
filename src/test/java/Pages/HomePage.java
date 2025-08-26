package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void navigateToDesktop() throws InterruptedException {
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.cssSelector("[alt='Picture for category Desktops']")).click();
    }
    public CartPage addProductToCart()
    {
        // 3. Add to cart
        List<WebElement> productList = driver.findElements(By.cssSelector("[class='product-title'] a"));
        for (WebElement webElement : productList) {
            String product =  webElement.getText();
            if(product.equalsIgnoreCase("Build your own cheap computer"))
            {
                webElement.click();
                break;

            }
        }
        driver.findElement(By.id("add-to-cart-button-72")).click();

        String addedToCartNotification = driver.findElement(By.cssSelector("#bar-notification p")).getText();
        System.out.println(addedToCartNotification);
        Assert.assertEquals(addedToCartNotification,"The product has been added to your shopping cart");
        // 4. Go to cart
        driver.findElement(By.linkText("Shopping cart")).click();
        return new CartPage(driver);
    }

}
