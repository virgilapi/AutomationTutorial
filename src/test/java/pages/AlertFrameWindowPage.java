package pages;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowPage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public PageHelper pageHelper;

    public AlertFrameWindowPage (WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(this.driver);
        pageHelper = new PageHelper(this.driver);
        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsFrameWindowsElement;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesElement;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement windowElement;


    public void interactWithAlertsSubMenu(){
        elementHelper.waitVisibleElement(alertsFrameWindowsElement);
        elementHelper.ultraJSElement(alertsFrameWindowsElement);

    }

    public void interactWithFramesSubMenu(){
        elementHelper.waitVisibleElement(framesElement);
        elementHelper.ultraJSElement(framesElement);
    }

    public void interactWithWindowSubMenu(){
        elementHelper.waitVisibleElement(windowElement);
        elementHelper.ultraJSElement(windowElement);
    }


}
