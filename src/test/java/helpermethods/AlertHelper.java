package helpermethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public WebDriver driver;

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void acceptAlert(){
        waitAlert();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert(){
        waitAlert();
        Alert alertDismiss = driver.switchTo().alert();
        alertDismiss.dismiss();

    }

    public void sentAndAccpetAlert(String text){
        waitAlert();
        Alert alertValoare = driver.switchTo().alert();
        alertValoare.sendKeys(text);
        alertValoare.accept();
    }
}
