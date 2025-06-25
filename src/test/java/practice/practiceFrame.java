package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class practiceFrame {
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

        WebElement framesElement = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
        executor.executeScript("arguments[0].click();", framesElement);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement parentElement = driver.findElement(By.tagName("body"));
        System.out.println(parentElement.getText());

        driver.switchTo().frame(0);

        WebElement childElement = driver.findElement(By.tagName("p"));
        System.out.println(childElement.getText());

        driver.switchTo().parentFrame();

        driver.quit();
    }
}

