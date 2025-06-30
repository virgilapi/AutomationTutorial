package helpermethods;

import org.openqa.selenium.*;

public class ElementHelper {

    public WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void ultraJSElement(WebElement elementCLick){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementCLick);
    }

    public void clickElement(WebElement element){
        element.click();
    }

   public WebElement getElementsXpath(String xpath){
       return driver.findElement(By.xpath(xpath));
   }

    public void extractText(WebElement textelement){
        System.out.println(textelement.getText());
    }

    public void fillElement(WebElement element,String value){
        element.sendKeys(value);
    }

    public void pressElement(WebElement element,Keys value){
        element.sendKeys(value);

    }

    public void clearElement(WebElement element){
        element.clear();
    }
}

