package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {


    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsElement;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement  elementElmenet;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formMenuElement;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void interactOnAlertsFrameWindowMenu(){
        elementHelper.ultraJSElement(alertsFrameWindowsElement);
        LoggerUtility.infoLog("The user clicks on the Alert Window Frame Menu");
    }

    public void interactWithElementsMenu(){
        pageHelper.scrollPage(0, 400);
        elementHelper.ultraJSElement(elementElmenet);
        LoggerUtility.infoLog("The user clicks on Elements Menu");
    }

    public void interactWithFormsMenu(){
        pageHelper.scrollPage(0,400);
        elementHelper.clickElement(formMenuElement);
        LoggerUtility.infoLog("The user click ons the FormsMenu");
    }
}
