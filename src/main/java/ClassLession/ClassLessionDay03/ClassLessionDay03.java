package ClassLession.ClassLessionDay03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLessionDay03 {
    static WebDriver driver = null;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com");
        driver.navigate().to("https://saucelabs.com/request-demo");
        driver.navigate().back("https://saucelabs.com");
        driver.navigate().forward();
        WebElement element = driver.findElement(By.xpath("//input[@id='Email']"));
        element.sendKeys("thaotp70@gmail.com");
        driver.quit();
    }
}