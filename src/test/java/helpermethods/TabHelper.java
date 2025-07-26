package helpermethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabHelper {

    private WebDriver driver;

    public TabHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void swithTab(int pozition){

        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(pozition));

    }

    public void closeCurentTab(){
        driver.close();

    }

}
