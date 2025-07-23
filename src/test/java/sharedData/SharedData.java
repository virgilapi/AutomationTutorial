package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    @BeforeMethod
    public void prepareEnv(){
        //deschidem o instanta de chrome(sau altele)
        driver = new ChromeDriver();
        //accesam o pagina specifica
        driver.get("https://demoqa.com/");
        //facem browser ul sa fie in maximize, in fullscreen consumam prea multi rami
        driver.manage().window().maximize();
        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //iar daca computeaza sub 10 sec nu mai asteapta 10
        //h5[text()='Forms']
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void clearEnv(){
        driver.quit();
    }
}
