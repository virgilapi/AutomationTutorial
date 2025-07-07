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
    public void testMetod() {

        ElementHelper elementHelper = new ElementHelper(driver);
        PageHelper pageHelper = new PageHelper(driver);

        pageHelper.scrollPage(0, 400);


        WebElement elementElmenet = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementHelper.clickElement(elementElmenet);

        pageHelper.scrollPage(0, 400);

        WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        elementHelper.clickElement(webTables);


        List<WebElement> tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        int tableSize = 3;
        elementHelper.validateListsize(tableList, tableSize);

        //identificam un element
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        elementHelper.clickElement(addElement);

        WebElement firstnameElement = driver.findElement(By.id("firstName"));
        String firstnameValue = "Abdul";
        elementHelper.fillElement(firstnameElement, firstnameValue);

        WebElement lastnameElement = driver.findElement(By.id("lastName"));
        String lastnameValue = "Naptul";
        elementHelper.fillElement(lastnameElement, lastnameValue);

        WebElement emailELement = driver.findElement(By.id("userEmail"));
        String emailValue = "baga@gmail.com";
        elementHelper.fillElement(emailELement, emailValue);

        WebElement ageElement = driver.findElement(By.id("age"));
        String ageValue = "27";
        elementHelper.fillElement(ageElement, ageValue);

        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salaryValue = "2500";
        elementHelper.fillElement(salaryElement, salaryValue);

        WebElement departmentElement = driver.findElement(By.id("department"));
        String departmentValue = "frizer";
        elementHelper.fillElement(departmentElement, departmentValue);

        WebElement submitElement = driver.findElement(By.id("submit"));
        elementHelper.ultraJSElement(submitElement);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        elementHelper.validateListsize(tableList, tableSize + 1);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), firstnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), lastnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), emailValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), ageValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), salaryValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), departmentValue);

        //edit functionality

        WebElement editElement = driver.findElement(By.id("edit-record-4"));
        elementHelper.ultraJSElement(editElement);

        WebElement editfirstnameElement = driver.findElement(By.id("firstName"));
        String editfirstnameValue = "Nepal";
        //editfirstnameElement.clear();-sterge un text deja existent
        elementHelper.clearFillElement(editfirstnameElement,editfirstnameValue);

        WebElement editlastElement = driver.findElement(By.id("lastName"));
        String editlastnameValue = "Paki";
        elementHelper.clearFillElement(editlastElement, editlastnameValue);

        WebElement editmailElement = driver.findElement(By.id("userEmail"));
        String editemailValue = "alablala@gmail.com";
        elementHelper.clearFillElement(editmailElement, editemailValue);

        WebElement editageElement = driver.findElement(By.id("age"));
        String editageValue = "28";
        elementHelper.clearFillElement(editageElement, editageValue);

        WebElement editsalariElement = driver.findElement(By.id("salary"));
        String editsalariValue = "1000";
        elementHelper.clearFillElement(editsalariElement, editsalariValue);

        WebElement editdepElement = driver.findElement(By.id("department"));
        String editdepValue = "Gunoier";
        elementHelper.clearFillElement(editdepElement, editdepValue);


        WebElement editLine = driver.findElement(By.id("submit"));
        elementHelper.ultraJSElement(editLine);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        elementHelper.validateListsize(tableList, tableSize + 1);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editfirstnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editlastnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editemailValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editageValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editsalariValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), editdepValue);

        //delete element
        WebElement deleteElement = driver.findElement(By.id("delete-record-4"));
        elementHelper.clickElement(deleteElement);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        elementHelper.validateListsize(tableList, tableSize);


    }

}
