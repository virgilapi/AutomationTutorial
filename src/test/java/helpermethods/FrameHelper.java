package helpermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

    public WebDriver driver;

    public FrameHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void parentFrame(){

        driver.switchTo().parentFrame();
    }

    public void frameSwitchXpath(String xpath){
        driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
    }

    public void frameSwitchId(String id){
        driver.switchTo().frame(driver.findElement(By.id(id)));

    }

    public void frameSwitchCss(String css){
        driver.switchTo().frame(driver.findElement(By.cssSelector(css)));
    }

    public void frameSwitchText(String text){
        driver.switchTo().frame(text);
    }

    public void extractText(WebElement textelement){
        System.out.println(textelement.getText());
    }


}
