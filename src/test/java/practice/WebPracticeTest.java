package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebPracticeTest {

    public WebDriver driver;

    @Test
    public void testPratice(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement clickElement=driver.findElement(By.id("Ap26H"));
        executor.executeScript("arguments[0].click();",clickElement);






    }}


