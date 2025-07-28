package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertFrameWindowPage extends BasePage {

    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsFrameWindowsElement;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesElement;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement windowElement;


    public void interactWithAlertsSubMenu(){
        elementHelper.waitVisibleElement(alertsFrameWindowsElement);
        elementHelper.ultraJSElement(alertsFrameWindowsElement);
        LoggerUtility.infoLog("The user clicks on Alerts sub menu");

    }

    public void interactWithFramesSubMenu(){
        elementHelper.waitVisibleElement(framesElement);
        elementHelper.ultraJSElement(framesElement);
        LoggerUtility.infoLog("The user clicks on Frame sub Menu");
    }

    public void interactWithWindowSubMenu(){
        elementHelper.waitVisibleElement(windowElement);
        elementHelper.ultraJSElement(windowElement);
        LoggerUtility.infoLog("The user clicks on Window Menu");
    }


}
