package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class LoginPage {

    private WebDriver driver;
    public WebDriver setup()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        return driver;
    }
    public void isHomePageDisplayed()
    {
        setup();
        assertTrue(driver.findElement(By.cssSelector("[class='header-logo']")).isDisplayed());
    }

    public HomePage login()
    {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("kwandabuso@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Qwerty12345");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        return new HomePage(driver);

    }
}
