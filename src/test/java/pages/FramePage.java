package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{




    @FindBy(id = "sampleHeading")
    private WebElement firstBlockElement;
    @FindBy(id = "sampleHeading")
    private WebElement secondBlockElement;

    public FramePage(WebDriver driver) {
        super(driver);
    }


    public void dealWithBigFrame(){
        frameHelper.frameSwitchXpath("//iframe[@id='frame1']");
        LoggerUtility.infoLog("The user switches to specific frame");
        elementHelper.extractText(firstBlockElement);
        driver.switchTo().parentFrame();
        LoggerUtility.infoLog("The user switches to parent frame");
    }

    public void dealWithSecondFrame(){
        frameHelper.frameSwitchText("frame2");
        LoggerUtility.infoLog("The user switches to specific frame");
        elementHelper.extractText(secondBlockElement);
        driver.switchTo().parentFrame();
        LoggerUtility.infoLog("The user switches to parent frame");
    }
}
