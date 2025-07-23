package pages;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    public WebDriver driver;
    public ElementHelper elementHelper;
    public PageHelper pageHelper;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        pageHelper = new PageHelper(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTables;

    public void interactWithWebTableSubMenu(){
        pageHelper.scrollPage(0, 400);
        elementHelper.waitVisibleElement(webTables);
        elementHelper.clickElement(webTables);
    }
}
