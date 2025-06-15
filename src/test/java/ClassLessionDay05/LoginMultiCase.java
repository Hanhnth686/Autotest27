package ClassLessionDay05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginMultiCase {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testLoginWithInVaLidUserName() {
        driver.get("https://saucedemo.com/");
        driver.findElement(By.xpath("id='user-name'")).sendKeys("invalid_user");
        driver.findElement(By.xpath("id='password'")).sendKeys("secret_sauce");
        // Kiểm tra thông bo lỗi
        WebElement erroMsg = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(erroMsg.isDisplayed(), "Error message not displayed");
        Assert.assertTrue(erroMsg.isDisplayed(), "Username and password do not match");
    }
    @Test
    public void testLoginWithInVaLidPasswoprd() {

    }
}
