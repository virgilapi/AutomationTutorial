package helpermethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    private WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void ultraJSElement(WebElement elementCLick){
        waitVisibleElement(elementCLick);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementCLick);
    }

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void extractText(WebElement textelement){
        System.out.println(textelement.getText());
    }

    public void fillElement(WebElement element,String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void pressElement(WebElement element,Keys value){
        waitVisibleElement(element);
        element.sendKeys(value);

    }

    public void clearElement(WebElement element){
        waitVisibleElement(element);
        element.clear();
    }

    public void clearFillElement(WebElement element,String value){
        waitVisibleElement(element);
        clearElement(element);
        fillElement(element,value);
    }

    public void validateListsize(List<WebElement> elementList,int expectedsize){
        waitForListVizible(elementList);
        Assert.assertEquals(elementList.size(),expectedsize,"Actual list size "+elementList.size()+" different than"+expectedsize);

    }

    public void validateElementCotainsText(WebElement element,String expectedtext){
        waitVisibleElement(element);
        Assert.assertTrue(element.getText().contains(expectedtext),"Actual element text "+element.getText()+" different than" +expectedtext);

    }

    public void validateElementEqualsText(WebElement element,String expectedtext){
        waitVisibleElement(element);
        Assert.assertEquals(element.getText(),expectedtext,"Actual element text "+element.getText()+" different than" +expectedtext);
    }

    public void fillPressElement(WebElement element,String value,Keys keyValue){
        fillElement(element,value);
        pressElement(element,keyValue);
    }

    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForListVizible(List<WebElement> elementList){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
    }
}


