package tests;

import helpermethods.AlertHelper;
import helpermethods.ElementHelper;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class AlertsTest extends SharedData {



    @Test
    public void alertsTestMethod() {

        ElementHelper elementHelper = new ElementHelper(driver);
        AlertHelper alertHelper = new AlertHelper(driver);


        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementHelper.ultraJSElement(alertsFrameWindowsElement);

        WebElement alertsElement = elementHelper.getElementsXpath("//span[text()='Alerts']");
//        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementHelper.ultraJSElement(alertsElement);

        WebElement alertWaitButtonElement = driver.findElement(By.id("timerAlertButton"));
        elementHelper.clickElement(alertWaitButtonElement);
        //wait explicit pentru alerta
        alertHelper.acceptAlert();

        WebElement alertOkCancelElement = driver.findElement(By.id("confirmButton"));
        elementHelper.clickElement(alertOkCancelElement);

        alertHelper.dismissAlert();

        WebElement alertPromptElement = driver.findElement(By.id("promtButton"));
        elementHelper.clickElement(alertPromptElement);

       alertHelper.sentAndAccpetAlert("Formula1");
    }
}
