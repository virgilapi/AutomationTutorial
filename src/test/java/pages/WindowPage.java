package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage {


    @FindBy(id = "tabButton")
    private WebElement newTabElement;
    @FindBy(id = "windowButton" )
    private WebElement newWindow;

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    public void interactWithTab(){
        elementHelper.ultraJSElement(newTabElement);
        LoggerUtility.infoLog("The user clicks on new tab button");
        tabHelper.swithTab(1);
        LoggerUtility.infoLog("The user switches on the second tab opened");
        System.out.println(driver.getCurrentUrl());
        tabHelper.closeCurentTab();
        LoggerUtility.infoLog("The user closes the second tab");
        tabHelper.swithTab(0);
        LoggerUtility.infoLog("The user switches back on the main tab");
    }

    public void interactWithWindow(){
        elementHelper.ultraJSElement(newWindow);
        LoggerUtility.infoLog("The user clicks on the new window button");
        tabHelper.swithTab(1);
        LoggerUtility.infoLog("The user switches on the second window");
        System.out.println(driver.getCurrentUrl());
        tabHelper.closeCurentTab();
        LoggerUtility.infoLog("The user closes the second window");
        tabHelper.swithTab(0);
        LoggerUtility.infoLog("The user switches back to the main window");
    }
}
