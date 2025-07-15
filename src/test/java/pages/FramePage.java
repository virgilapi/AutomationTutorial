package pages;

import helpermethods.ElementHelper;
import helpermethods.FrameHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    public WebDriver driver;
    public ElementHelper elementHelper;
    public FrameHelper frameHelper;

    public FramePage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        frameHelper = new FrameHelper(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "sampleHeading")
    public WebElement firstBlockElement;
    @FindBy(id = "sampleHeading")
    public WebElement secondBlockElement;


    public void dealWithBigFrame(){
        frameHelper.frameSwitchXpath("//iframe[@id='frame1']");
        elementHelper.extractText(firstBlockElement);
        driver.switchTo().parentFrame();
    }

    public void dealWithSecondFrame(){
        frameHelper.frameSwitchText("frame2");
        elementHelper.extractText(secondBlockElement);
        driver.switchTo().parentFrame();
    }
}
