package tests;

import helpermethods.ElementHelper;
import helpermethods.TabHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {


    @Test
    public void windowTestMethod(){

        ElementHelper elementHelper = new ElementHelper(driver);
        TabHelper tabHelper = new TabHelper(driver);


        WebElement alertsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementHelper.ultraJSElement(alertsElement);

        WebElement windowElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        elementHelper.ultraJSElement(windowElement);

        WebElement newTabElement = driver.findElement(By.id("tabButton"));
        elementHelper.clickElement(newTabElement);

        tabHelper.swithTab(1);
        System.out.println(driver.getCurrentUrl());

        tabHelper.closeCurentTab();

        tabHelper.swithTab(0);

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();

        tabHelper.swithTab(1);
        System.out.println(driver.getCurrentUrl());


        tabHelper.closeCurentTab();

//        WebElement newWindowMessageElement = driver.findElement(By.id("messageWindowButton"));
//        newWindowMessageElement.click();



    }
}
