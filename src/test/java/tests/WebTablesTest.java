package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest {
    public WebDriver driver;

    @Test
    public void testMetod(){
       //deschidem o instanta de chrome(sau altele)
       driver=new ChromeDriver();
      //accesam o pagina specifica

       driver.get("https://demoqa.com/");
     //facem browser ul sa fie in maximize, in fullscreen consumam prea multi rami

     driver.manage().window().maximize();

     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,400)");


     WebElement elementElmenet = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementElmenet.click();

     js.executeScript("window.scrollBy(0,400)");

     WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
     webTables.click();


     List<WebElement> tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        int tableSize=3;
        Assert.assertEquals(tableList.size(),tableSize);

        //identificam un element
        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstnameElement=driver.findElement(By.id("firstName"));
        String firstnameValue="Abdul";
        firstnameElement.sendKeys(firstnameValue);

        WebElement lastnameElement=driver.findElement(By.id("lastName"));
        String lastnameValue="Naptul";
        lastnameElement.sendKeys(lastnameValue);

        WebElement emailELement=driver.findElement(By.id("userEmail"));
        String emailValue="baga@gmail.com";
        emailELement.sendKeys(emailValue);

        WebElement ageElement=driver.findElement(By.id("age"));
        String ageValue="27";
        ageElement.sendKeys(ageValue);

        WebElement salaryElement=driver.findElement(By.id("salary"));
        String salaryValue="2500";
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement=driver.findElement(By.id("department"));
        String departmentValue="frizer";
        departmentElement.sendKeys(departmentValue);

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement submitElement=driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click();", submitElement);

         tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
         Assert.assertEquals(tableList.size(),tableSize+1);
         Assert.assertTrue(tableList.get(tableSize).getText().contains(firstnameValue));
         Assert.assertTrue(tableList.get(tableSize).getText().contains(lastnameValue));
         Assert.assertTrue(tableList.get(tableSize).getText().contains(emailValue));
         Assert.assertTrue(tableList.get(tableSize).getText().contains(ageValue));
         Assert.assertTrue(tableList.get(tableSize).getText().contains(salaryValue));
         Assert.assertTrue(tableList.get(tableSize).getText().contains(departmentValue));

     //edit functionality

        WebElement editElement=driver.findElement(By.id("edit-record-4"));
        editElement.click();

        WebElement editfirstnameElement=driver.findElement(By.id("firstName"));
        String editfirstnameValue="Nepal";
        editfirstnameElement.clear();
        //editfirstnameElement.clear();-sterge un text deja existent
        editfirstnameElement.sendKeys(editfirstnameValue);

        WebElement editlastElement=driver.findElement(By.id("lastName"));
        String editlastnameValue="Paki";
        editlastElement.clear();
        editlastElement.sendKeys(editlastnameValue);

        WebElement editmailElement=driver.findElement(By.id("userEmail"));
        String editemailValue="alablala@gmail.com";
        editmailElement.clear();
        editmailElement.sendKeys(editemailValue);

        WebElement editageElement=driver.findElement(By.id("age"));
        String editageValue="28";
        editageElement.clear();
        editageElement.sendKeys(editageValue);

        WebElement editsalariElement=driver.findElement(By.id("salary"));
        String editsalariValue="1000";
        editsalariElement.clear();
        editsalariElement.sendKeys(editsalariValue);

        WebElement editdepElement=driver.findElement(By.id("department"));
        String editdepValue="Gunoier";
        editdepElement.clear();
        editdepElement.sendKeys(editdepValue);


        WebElement editLine = driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click();", editLine);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(),tableSize+1);
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editfirstnameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editlastnameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editemailValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editageValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editsalariValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editdepValue));

     //delete element
        WebElement deleteElement=driver.findElement(By.id("delete-record-4"));
        deleteElement.click();

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(),tableSize);

        driver.quit();

    }

}
