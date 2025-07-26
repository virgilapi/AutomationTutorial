package pages;

import helpermethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public AlertHelper alertHelper;
    public FrameHelper frameHelper;
    public PageHelper pageHelper;
    public TabHelper tabHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
        this.alertHelper = new AlertHelper(driver);
        this.frameHelper = new FrameHelper(driver);
        this.pageHelper = new PageHelper(driver);
        this.tabHelper = new TabHelper(driver);
        PageFactory.initElements(driver, this);
    }
}
