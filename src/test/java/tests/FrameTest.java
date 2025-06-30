package tests;

import helpermethods.ElementHelper;
import helpermethods.FrameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class FrameTest extends SharedData {


    @Test
    public void frameTestMethod() {

        ElementHelper elementHelper = new ElementHelper(driver);
        FrameHelper frameHelper = new FrameHelper(driver);

        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementHelper.ultraJSElement(alertsFrameWindowsElement);

        WebElement framesElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementHelper.ultraJSElement(framesElement);

        frameHelper.frameSwitchXpath("//iframe[@id='frame1']");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        frameHelper.extractText(driver.findElement(By.id("sampleHeading")));
//        WebElement firstBlockElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println(firstBlockElement.getText());

        frameHelper.parentFrame();

        frameHelper.frameSwitchText("frame2");
//        driver.switchTo().frame("frame2");
//        WebElement secondElement = driver.findElement(By.id("sampleHeading"));
        frameHelper.extractText(driver.findElement(By.id("sampleHeading")));
//        System.out.println(secondElement.getText());

        frameHelper.parentFrame();
    }
}
