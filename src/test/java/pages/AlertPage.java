package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertsElement;
    @FindBy(id = "timerAlertButton")
    private WebElement alertWaitButtonElement;
    @FindBy(id = "confirmButton")
    private WebElement alertOkCancelElement;
    @FindBy(id = "promtButton")
    private WebElement alertPromptElement;



    public void alertOK(){
        elementHelper.clickElement(alertsElement);
        LoggerUtility.infoLog("The user clicks on Alerts Element");
        alertHelper.acceptAlert();
        LoggerUtility.infoLog("The user deals with Alert ok presence");
    }
    public void alertWaitOk(){
        elementHelper.clickElement(alertWaitButtonElement);
        LoggerUtility.infoLog("The user clicks Alert Wait Element");
        //wait explicit pentru alerta
        alertHelper.acceptAlert();
        LoggerUtility.infoLog("The user deals with Alert ok presence");
    }

    public void alertCancel(){
        elementHelper.ultraJSElement(alertOkCancelElement);
        LoggerUtility.infoLog("The user clicks on Alert OK element");
        alertHelper.dismissAlert();
        LoggerUtility.infoLog("The user deals with Alert dismiss presence");

    }

    public void fillAlert(String value){
        elementHelper.ultraJSElement(alertPromptElement);
        LoggerUtility.infoLog("The user clicks on Alert Prompt element");
        alertHelper.sentAndAccpetAlert(value);
        LoggerUtility.infoLog("The user fills and clicks ok with Alert prompt");
    }
}
