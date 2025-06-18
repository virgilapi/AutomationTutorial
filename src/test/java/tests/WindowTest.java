package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowTest {
    public WebDriver driver;

    @Test
    public void WindowTestMethod(){
        driver=new ChromeDriver();

        driver.get("https://demoqa.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement alertsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        executor.executeScript("arguments[0].click();", alertsElement);

        WebElement windowElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        executor.executeScript("arguments[0].click();", windowElement);

        WebElement newTabElement = driver.findElement(By.id("tabButton"));
        newTabElement.click();

        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(tabsList.get(0));
        System.out.println(driver.getCurrentUrl());

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(windowList.get(0));
        System.out.println(driver.getCurrentUrl());

        driver.quit();

//        WebElement newWindowMessageElement = driver.findElement(By.id("messageWindowButton"));
//        newWindowMessageElement.click();



    }
}
