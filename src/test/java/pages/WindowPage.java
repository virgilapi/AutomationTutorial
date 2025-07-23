package pages;

import helpermethods.ElementHelper;
import helpermethods.TabHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowPage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public TabHelper tabHelper;

    public WindowPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        tabHelper = new TabHelper(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "tabButton")
    private WebElement newTabElement;
    @FindBy(id = "windowButton" )
    private WebElement newWindow;

    public void interactWithTab(){
        elementHelper.ultraJSElement(newTabElement);
        tabHelper.swithTab(1);
        System.out.println(driver.getCurrentUrl());
        tabHelper.closeCurentTab();
        tabHelper.swithTab(0);
    }

    public void interactWithWindow(){
        elementHelper.ultraJSElement(newWindow);
        tabHelper.swithTab(1);
        System.out.println(driver.getCurrentUrl());
        tabHelper.closeCurentTab();
        tabHelper.swithTab(0);
    }
}
