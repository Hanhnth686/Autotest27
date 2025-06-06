package ClassLession.ClassLessionDay04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class SingleRadioButtonSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
        radioButton.click();

        Thread.sleep(3000);
        String value = radioButton.getAttribute("");

    }
}
