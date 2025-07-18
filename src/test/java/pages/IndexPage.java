package pages;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
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
    public WebElement alertsFrameWindowsElement;
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement  elementElmenet;
    @FindBy(xpath = "//h5[text()='Forms']")
    public WebElement formMenuElement;

    public void interactOnAlertsFrameWindowMenu(){
        elementHelper.ultraJSElement(alertsFrameWindowsElement);
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
