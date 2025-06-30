package tests;

import helpermethods.ElementHelper;
import helpermethods.PageHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test
    public void testMethod(){


        PageHelper pageHelper = new PageHelper(driver);
        ElementHelper elementHelper = new ElementHelper(driver);

        pageHelper.scrollPage(0,400);

        WebElement formMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        elementHelper.clickElement(formMenuElement);

        WebElement formClickElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementHelper.clickElement(formClickElement);

        WebElement firstNameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstnameValue="Abdul";
        elementHelper.fillElement(firstNameElement,"Abdul");

        WebElement lastNameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastnameValue="Nepal";
        elementHelper.fillElement(lastNameElement,"Nepal");

        WebElement emailElment=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        String emailValue="ara@email.com";
        emailElment.sendKeys(emailValue);

        WebElement telefonElment=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String telefonValue="0727272790";
        telefonElment.sendKeys(telefonValue);

        WebElement subjectElement=driver.findElement(By.id("subjectsInput"));
        List<String> subjectValue= Arrays.asList("Accounting","Arts","Maths");
        for (int index = 0;index<subjectValue.size();index++){
            elementHelper.fillElement(subjectElement,subjectValue.get(index));
            elementHelper.pressElement(subjectElement,Keys.ENTER);
        }
        //subjectElement.sendKeys(Keys.ENTER);-METODA DE ENTER, KEYS-SPECIFIC SELENIUM

        String gendervalue= "Female";
        List<WebElement> genderElementList= driver.findElements(By.cssSelector("div[id='genterWrapper'] label[class='custom-control-label']"));
        switch (gendervalue){
            case "Male":
                elementHelper.clickElement(genderElementList.get(0));
                break;
            case "Female":
                elementHelper.clickElement( genderElementList.get(1));
                break;
            case "Other":
               elementHelper.clickElement( genderElementList.get(2));
                break;
        }
        pageHelper.scrollPage(0,400);

        List<WebElement> hobbiesElementList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']"));
        List<String> hobbieValues= Arrays.asList("Sports","Reading");
        for (int index=0;index< hobbiesElementList.size();index++){
            if (hobbieValues.contains(hobbiesElementList.get(index).getText())){
                elementHelper.clickElement(hobbiesElementList.get(index));
            }
        }

        WebElement uploadElement= driver.findElement(By.id("uploadPicture"));
        String uploadValue="src/test/resources/Screenshot 2024-11-13 120523.png";
        File file = new File(uploadValue);
        elementHelper.fillElement(uploadElement,file.getAbsolutePath());
//        uploadElement.sendKeys(file.getAbsolutePath());

        WebElement adressELement= driver.findElement(By.id("currentAddress"));
        String curentadressValue="Milcoiu";
        adressELement.sendKeys(curentadressValue);



        WebElement stateElement = driver.findElement(By.id("state"));
        elementHelper.ultraJSElement(stateElement);

        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateValue = "Uttar Pradesh";
        elementHelper.fillElement(stateInputElement,"Uttar Pradesh");
        elementHelper.pressElement(stateInputElement,Keys.ENTER);
//        stateInputElement.sendKeys(Keys.ENTER);

        WebElement cityElement = driver.findElement(By.id("city"));
        elementHelper.ultraJSElement(cityElement);


        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityValue = "Agra";
        elementHelper.fillElement(cityInputElement,"Agra");
        elementHelper.pressElement(cityInputElement,Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        elementHelper.ultraJSElement(submitElement);
        //mai jos facem validari
        //wait explicit

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[2]")));


        List<WebElement> tableDesList = driver.findElements(By.xpath("//table//td[1]"));
        List<WebElement> tableValueList = driver.findElements(By.xpath("//table//td[2]"));
        //asert e pentru validari-o clasa specifica testng
        //al treilea param in assert e mesaj in cazul in care cade testul
        //equals cand e o singura val
        Assert.assertEquals(tableDesList.get(0).getText(),"Student Name","Student name text is not displayed correctly");
        Assert.assertTrue(tableValueList.get(0).getText().contains(firstnameValue),"First name is not displayed correctly");
        Assert.assertTrue(tableValueList.get(0).getText().contains(lastnameValue),"Last name is not displated correctly");

        Assert.assertEquals(tableDesList.get(1).getText(),"Student Email","Student email text is not displayed correctly");
        Assert.assertTrue(tableValueList.get(1).getText().contains(emailValue),"Email Value is not displayed correctly");

        Assert.assertEquals(tableDesList.get(2).getText(),"Gender","Gender text is not displayed correctly");
        Assert.assertEquals(tableValueList.get(2).getText(), gendervalue,"Gender is not correct");

        Assert.assertEquals(tableDesList.get(3).getText(),"Mobile","Mobile text is not correct");
        Assert.assertEquals(tableValueList.get(3).getText(), telefonValue,"Mobile value is not correct");

        Assert.assertEquals(tableDesList.get(4).getText(),"Date of Birth","Date of birth text is not correct");

        String subjectsAsString = String.join(", ", subjectValue);// metoda join in acest caz ia un separator, o lista si le uneste
        //punand separatorul dupa fiecare element
        Assert.assertEquals(tableDesList.get(5).getText(),"Subjects","Subject text is not correct");
        Assert.assertEquals(tableValueList.get(5).getText(), subjectsAsString, "Subjects are not displayed correctly");

        String hobbiesAsString = String.join(", ", hobbieValues);// metoda join in acest caz ia un separator, o lista si le uneste
        Assert.assertEquals(tableDesList.get(6).getText(),"Hobbies","Hobbies text is not correct");
        Assert.assertEquals(tableValueList.get(6).getText(), hobbiesAsString, "Hobbies are not displayed correctly");


        String uploadedFileName = new File(uploadValue).getName(); // "Screenshot 2024-11-13 120523.png"
        //Creează un obiect File folosind stringul uploadValue (care conține calea completă a fișierului pe sistemul tău).
        //Apoi, .getName() extrage doar numele fișierului, fără cale.
        //doarece pe site uri apare doar numele nu si calea completa
        String actualFileNameFromTable = tableValueList.get(7).getText();
        //Accesează elementul de pe poziția 7 din lista tableValueList (probabil un <td> dintr-un tabel cu datele completate după trimiterea formularului).
        //.getText() extrage textul vizibil din acel element — adică numele fișierului afișat pe site.
        Assert.assertEquals(tableDesList.get(7).getText(),"Picture","Picture text is not correct");
        Assert.assertEquals(actualFileNameFromTable, uploadedFileName, "The picture is  not displayed correctly");
        //Verifică dacă textul afișat pe site (în tabel) este egal cu numele fișierului pe care l-ai trimis

        Assert.assertEquals(tableDesList.get(8).getText(),"Address","Address text is not correct");
        Assert.assertEquals(tableValueList.get(8).getText(), curentadressValue, "The Address are not displayed correctly");

        Assert.assertEquals(tableDesList.get(9).getText(),"State and City","The text displayed is not correct");
        Assert.assertTrue(tableValueList.get(9).getText().contains(stateValue),"The state first name is not displayed correctly");
        Assert.assertTrue(tableValueList.get(9).getText().contains(stateValue),"The state second name is not displayed correctly");
        Assert.assertTrue(tableValueList.get(9).getText().contains(cityValue),"City name is not displayed correctly");

    }
}
