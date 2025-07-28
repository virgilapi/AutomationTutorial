package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{



    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement formClickElement;

    public FormsPage(WebDriver driver) {
        super(driver);
    }


    public void interactWithPracticeFormSubMenu(){
        elementHelper.clickElement(formClickElement);
        LoggerUtility.infoLog("The user clicks on Practice menu");
    }
}
