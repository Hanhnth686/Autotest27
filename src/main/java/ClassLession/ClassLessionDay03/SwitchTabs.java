package ClassLession.ClassLessionDay03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class SwitchTabs {
    public static void main(String[] args) {
//        Khởi tạo web driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Mở trang web đầu tiên
        driver.get("https://saucelabs.com/request-demo");
        System.out.println("tab 1 title: " + driver.getTitle());
//        Lưu ID của tab gốc
        String originalTab = driver.getWindowHandle();
//        Mở tab mới để truy cập google
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");
//        Lấy tất cả các ID tab/cửa sổ
        Set<String> allTabs = driver.getWindowHandles();
//        Chuyển sang tab mới
        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
//        Thao tác trên tab mới (Google);
        System.out.println("Tab 2 title: " + driver.getTitle());
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Sauce labs Request Demo");

    }

}
