package tests;

import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test
    public void testMethod(){

        String firstNameValue="Andrei";
        String lastNameValue="Mircea";
        String emailValue="ara@email.com";
        String mobileValue="0727272790";
        List<String> subjectsValue= Arrays.asList("Accounting","Arts","Maths");
        String genderValue = "Male";
        List<String> hobbiesValues= Arrays.asList("Sports","Reading");
        String uploadValue="src/test/resources/Screenshot 2024-11-13 120523.png";
        String adressValue="Bucuresti";
        String stateValue = "Uttar Pradesh";
        String cityValue = "Agra";

        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithFormsMenu();

        FormsPage formsPage = new FormsPage( driver);
        formsPage.interactWithPracticeFormSubMenu();

        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillEntireForm(firstNameValue,lastNameValue,emailValue,mobileValue,subjectsValue,
                genderValue,hobbiesValues, uploadValue, adressValue, stateValue, cityValue);

        practiceFormPage.validateFormValues(firstNameValue, lastNameValue,emailValue,genderValue,mobileValue,
                subjectsValue,hobbiesValues,uploadValue,adressValue,stateValue,cityValue);

//        WebElement firstNameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//        String firstnameValue="Andrei";
//        elementHelper.fillElement(firstNameElement,"Andrei");
//
//        WebElement lastNameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//        String lastnameValue="Mircea";
//        elementHelper.fillElement(lastNameElement,"Mircea");
//
//        WebElement emailElment=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
//        String emailValue="ara@email.com";
//        emailElment.sendKeys(emailValue);
//
//        WebElement telefonElment=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        String telefonValue="0727272790";
//        telefonElment.sendKeys(telefonValue);
//
//        WebElement subjectElement=driver.findElement(By.id("subjectsInput"));
//        List<String> subjectValue= Arrays.asList("Accounting","Arts","Maths");
//        for (int index = 0;index<subjectValue.size();index++){
//            elementHelper.fillPressElement(subjectElement,subjectValue.get(index),Keys.ENTER);
//        }
//        //subjectElement.sendKeys(Keys.ENTER);-METODA DE ENTER, KEYS-SPECIFIC SELENIUM
//
//        String gendervalue= "Male";
//        List<WebElement> genderElementList= driver.findElements(By.cssSelector("div[id='genterWrapper'] label[class='custom-control-label']"));
//        switch (gendervalue){
//            case "Male":
//                elementHelper.clickElement(genderElementList.get(0));
//                break;
//            case "Female":
//                elementHelper.clickElement( genderElementList.get(1));
//                break;
//            case "Other":
//               elementHelper.clickElement( genderElementList.get(2));
//                break;
//        }
//        pageHelper.scrollPage(0,400);
//
//        List<WebElement> hobbiesElementList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']"));
//        List<String> hobbieValues= Arrays.asList("Sports","Reading");
//        for (int index=0;index< hobbiesElementList.size();index++){
//            if (hobbieValues.contains(hobbiesElementList.get(index).getText())){
//                elementHelper.clickElement(hobbiesElementList.get(index));
//            }
//        }
//
//        WebElement uploadElement= driver.findElement(By.id("uploadPicture"));
//        String uploadValue="src/test/resources/Screenshot 2024-11-13 120523.png";
//        File file = new File(uploadValue);
//        elementHelper.fillElement(uploadElement,file.getAbsolutePath());
////        uploadElement.sendKeys(file.getAbsolutePath());
//
//        WebElement adressELement= driver.findElement(By.id("currentAddress"));
//        String curentadressValue="Bucuresti";
//        adressELement.sendKeys(curentadressValue);
//
//
//
//        WebElement stateElement = driver.findElement(By.id("state"));
//        elementHelper.ultraJSElement(stateElement);
//
//        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "Uttar Pradesh";
//        elementHelper.fillPressElement(stateInputElement,"Uttar Pradesh",Keys.ENTER);
////        stateInputElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.id("city"));
//        elementHelper.ultraJSElement(cityElement);
//
//
//        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Agra";
//        elementHelper.fillPressElement(cityInputElement,cityValue,Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        elementHelper.ultraJSElement(submitElement);
//        //mai jos facem validari
//        //wait explicit
//
//        List<WebElement> tableDesList = driver.findElements(By.xpath("//table//td[1]"));
//        List<WebElement> tableValueList = driver.findElements(By.xpath("//table//td[2]"));
//        //asert e pentru validari-o clasa specifica testng
//        //al treilea param in assert e mesaj in cazul in care cade testul
//        //equals cand e o singura val
//       elementHelper.validateElementEqualsText(tableDesList.get(0),"Student Name");
//      elementHelper.validateElementCotainsText(tableValueList.get(0),firstnameValue);
//      elementHelper.validateElementCotainsText(tableValueList.get(0),lastnameValue);
//
//        Assert.assertEquals(tableDesList.get(1).getText(),"Student Email");
//        elementHelper.validateElementCotainsText(tableValueList.get(1),emailValue);
//
//      elementHelper.validateElementEqualsText(tableDesList.get(2),"Gender");
//      elementHelper.validateElementEqualsText(tableValueList.get(2),gendervalue);
//
//       elementHelper.validateElementEqualsText(tableDesList.get(3),"Mobile");
//       elementHelper.validateElementEqualsText(tableValueList.get(3),telefonValue);
//
//        elementHelper.validateElementEqualsText(tableDesList.get(4),"Date of Birth");
//
//
//        String subjectsAsString = String.join(", ", subjectValue);// metoda join in acest caz ia un separator, o lista si le uneste
//        //punand separatorul dupa fiecare element
//        elementHelper.validateElementEqualsText(tableDesList.get(5),"Subjects");
//        elementHelper.validateElementEqualsText(tableValueList.get(5),subjectsAsString);
//
//        String hobbiesAsString = String.join(", ", hobbieValues);// metoda join in acest caz ia un separator, o lista si le uneste
//       elementHelper.validateElementEqualsText(tableDesList.get(6),"Hobbies");
//       elementHelper.validateElementEqualsText(tableValueList.get(6), hobbiesAsString);
//
//
//        String uploadedFileName = new File(uploadValue).getName(); // "Screenshot 2024-11-13 120523.png"
//        //Creează un obiect File folosind stringul uploadValue (care conține calea completă a fișierului pe sistemul tău).
//        //Apoi, .getName() extrage doar numele fișierului, fără cale.
//        //doarece pe site uri apare doar numele nu si calea completa
//        String actualFileNameFromTable = tableValueList.get(7).getText();
//        //Accesează elementul de pe poziția 7 din lista tableValueList (probabil un <td> dintr-un tabel cu datele completate după trimiterea formularului).
//        //.getText() extrage textul vizibil din acel element — adică numele fișierului afișat pe site.
//       elementHelper.validateElementEqualsText(tableDesList.get(7),"Picture");
//       //elementHelper.validateElementEqualsText( uploadedFileName, "The picture is  not displayed correctly");
//        //Verifică dacă textul afișat pe site (în tabel) este egal cu numele fișierului pe care l-ai trimis
//
//       elementHelper.validateElementEqualsText(tableDesList.get(8),"Address");
//       elementHelper.validateElementEqualsText(tableValueList.get(8), curentadressValue);
//
//        elementHelper.validateElementEqualsText(tableDesList.get(9),"State and City");
//        elementHelper.validateElementCotainsText(tableValueList.get(9),stateValue);
//        elementHelper.validateElementCotainsText(tableValueList.get(9),stateValue);
//        elementHelper.validateElementCotainsText(tableValueList.get(9),cityValue);

        //        pageHelper.scrollPage(0,400);
//
//        WebElement formMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        elementHelper.clickElement(formMenuElement);

//        WebElement formClickElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        elementHelper.clickElement(formClickElement);

    }
}
