package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PracticeWigets {

    public WebDriver driver;

    @Test
    public void WindowTestMethod() {
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        driver.manage().window().maximize();

        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        executor.executeScript("arguments[0].click();", alertsFrameWindowsElement);

        executor.executeScript("window.scrollBy(0,200)");

        WebElement framesElement = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
        executor.executeScript("arguments[0].click();", framesElement);

        WebElement smallElement = driver.findElement(By.id("showSmallModal"));
        smallElement.click();

        WebElement closeElement = driver.findElement(By.id("closeSmallModal"));
        closeElement.click();
    }
}
