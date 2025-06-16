package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class proiect {
    public WebDriver driver;

    @Test
    public void testCase() {

        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();

        WebElement loginElement=driver.findElement(By.className("fa fa-shopping-cart"));
        loginElement.click();
    }
}