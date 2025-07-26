package pages;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public PageHelper pageHelper;


    public IndexPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        pageHelper = new PageHelper(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsElement;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement  elementElmenet;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formMenuElement;

    public void interactOnAlertsFrameWindowMenu(){
        elementHelper.ultraJSElement(alertsFrameWindowsElement);
        LoggerUtility.infoLog("The user clicks on the Alert Window Frame Menu");
    }

    public void interactWithElementsMenu(){
        pageHelper.scrollPage(0, 400);
        elementHelper.ultraJSElement(elementElmenet);
    }

    public void interactWithFormsMenu(){
        pageHelper.scrollPage(0,400);
        elementHelper.clickElement(formMenuElement);
    }
}
