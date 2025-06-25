package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class FrameTest extends SharedData {


    @Test
    public void WindowTestMethod() {



        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        executor.executeScript("arguments[0].click();", alertsFrameWindowsElement);

        WebElement framesElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        executor.executeScript("arguments[0].click();", framesElement);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement firstBlockElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(firstBlockElement.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame2");
        WebElement secondElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(secondElement.getText());

        driver.switchTo().parentFrame();
    }
}
