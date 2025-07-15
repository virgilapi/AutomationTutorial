package pages;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class FormsPage {

    public WebDriver driver;
    public ElementHelper elementHelper;
    public PageHelper pageHelper ;

    public FormsPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        pageHelper = new PageHelper(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement formClickElement;


    public void interactWithPracticeFormSubMenu(){
        elementHelper.clickElement(formClickElement);
    }
}
