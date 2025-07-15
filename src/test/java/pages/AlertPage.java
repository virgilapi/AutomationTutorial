package pages;

import helpermethods.AlertHelper;
import helpermethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public AlertHelper alertHelper;

    public AlertPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "alertButton")
    public WebElement alertsElement;
    @FindBy(id = "timerAlertButton")
    public WebElement alertWaitButtonElement;
    @FindBy(id = "confirmButton")
    public WebElement alertOkCancelElement;
    @FindBy(id = "promtButton")
    public WebElement alertPromptElement;

    public void alertOK(){
        elementHelper.clickElement(alertsElement);
        alertHelper.acceptAlert();
    }
    public void alertWaitOk(){
        elementHelper.clickElement(alertWaitButtonElement);
        //wait explicit pentru alerta
        alertHelper.acceptAlert();
    }

    public void alertCancel(){
        elementHelper.clickElement(alertOkCancelElement);
        alertHelper.dismissAlert();

    }

    public void fillAlert(String value){
        elementHelper.clickElement(alertPromptElement);
        alertHelper.sentAndAccpetAlert(value);
    }
}
