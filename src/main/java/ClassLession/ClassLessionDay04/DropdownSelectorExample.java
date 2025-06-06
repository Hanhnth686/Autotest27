package ClassLession.ClassLessionDay04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");
        WebElement Interest = driver.findElement(By.xpath("//select[@id='Solution_Interest__c']"));
        Select selectInterest = new Select(Interest);
        selectInterest.selectByValue("Scalable Test Automation");
        System.out.println("Interest selected successfully");
    }
}
