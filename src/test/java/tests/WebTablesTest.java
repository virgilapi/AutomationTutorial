package tests;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;
import java.util.List;

public class WebTablesTest extends SharedData {

    @Test
    public void testMetod(){

        ElementHelper elementHelper = new ElementHelper(driver);
        PageHelper pageHelper = new PageHelper(driver);

       pageHelper.scrollPage(0,400);


     WebElement elementElmenet = driver.findElement(By.xpath("//h5[text()='Elements']"));
      elementHelper.clickElement(elementElmenet);

     pageHelper.scrollPage(0,400);

     WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
     elementHelper.clickElement(webTables);


     List<WebElement> tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        int tableSize=3;
        Assert.assertEquals(tableList.size(),tableSize);

        //identificam un element
        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
       elementHelper.clickElement(addElement);

        WebElement firstnameElement=driver.findElement(By.id("firstName"));
        String firstnameValue="Abdul";
        elementHelper.fillElement(firstnameElement,"Abdul");

        WebElement lastnameElement=driver.findElement(By.id("lastName"));
        String lastnameValue="Naptul";
        elementHelper.fillElement(lastnameElement,"Naptul");

        WebElement emailELement=driver.findElement(By.id("userEmail"));
        String emailValue="baga@gmail.com";
        elementHelper.fillElement(emailELement,"baga@gmail.com");

        WebElement ageElement=driver.findElement(By.id("age"));
        String ageValue="27";
        elementHelper.fillElement(ageElement,"27");

        WebElement salaryElement=driver.findElement(By.id("salary"));
        String salaryValue="2500";
        elementHelper.fillElement(salaryElement,"2500");

        WebElement departmentElement=driver.findElement(By.id("department"));
        String departmentValue="frizer";
        elementHelper.fillElement(departmentElement,"frizer");

        WebElement submitElement=driver.findElement(By.id("submit"));
        elementHelper.ultraJSElement(submitElement);

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
        elementHelper.clickElement(editElement);

        WebElement editfirstnameElement=driver.findElement(By.id("firstName"));
        String editfirstnameValue="Nepal";
        editfirstnameElement.clear();
        //editfirstnameElement.clear();-sterge un text deja existent
        editfirstnameElement.sendKeys(editfirstnameValue);

        WebElement editlastElement=driver.findElement(By.id("lastName"));
        String editlastnameValue="Paki";
        elementHelper.clearElement(editlastElement);
        elementHelper.fillElement(editlastElement,"Paki");

        WebElement editmailElement=driver.findElement(By.id("userEmail"));
        String editemailValue="alablala@gmail.com";
        elementHelper.clearElement(editmailElement);
        elementHelper.fillElement(editmailElement,"alablala@gmail.com");

        WebElement editageElement=driver.findElement(By.id("age"));
        String editageValue="28";
        elementHelper.clearElement(editageElement);
        elementHelper.fillElement(editageElement,"28");

        WebElement editsalariElement=driver.findElement(By.id("salary"));
        String editsalariValue="1000";
        elementHelper.clearElement(editsalariElement);
        elementHelper.fillElement(editsalariElement,"1000");

        WebElement editdepElement=driver.findElement(By.id("department"));
        String editdepValue="Gunoier";
        elementHelper.clearElement(editdepElement);
        elementHelper.fillElement(editdepElement,"Gunoier");


        WebElement editLine = driver.findElement(By.id("submit"));
        elementHelper.ultraJSElement(editLine);

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
        elementHelper.clickElement(deleteElement);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(),tableSize);


    }

}
