package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pratice2 {

    public WebDriver driver1;

    @Test
    public void pratice2(){
        driver1=new ChromeDriver();
        driver1.get("https://demoqa.com/webtables");
        driver1.manage().window().maximize();

        WebElement adddElement=driver1.findElement(By.id("addNewRecordButton"));
        adddElement.click();

        WebElement fElement=driver1.findElement(By.id("firstName"));
        String fnameValue="Frank";
        fElement.sendKeys(fnameValue);

        WebElement lElement=driver1.findElement(By.id("lastName"));
        String lnameValue="Sinatra";
        lElement.sendKeys(lnameValue);

        WebElement imailElement=driver1.findElement(By.id("userEmail"));
        String imailValue="franksinatra@gmail.com";
        imailElement.sendKeys(imailValue);

        WebElement subElement=driver1.findElement(By.id("submit"));
        subElement.click();


    }
}
