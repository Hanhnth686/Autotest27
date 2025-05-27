package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.firefox.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.printf("Tieu de trang: " + driver.getTitle());
        try {
            Thread.sleep(millis:5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
