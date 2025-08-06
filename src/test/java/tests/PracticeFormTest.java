package tests;

import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;
import suite.Suite;

import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test(groups = {Suite.REGRESSION_SUITE,Suite.FORM_SUITE})
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

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithFormsMenu();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.interactWithPracticeFormSubMenu();

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(firstNameValue,lastNameValue,emailValue,mobileValue,subjectsValue,
                genderValue,hobbiesValues, uploadValue, adressValue, stateValue, cityValue);

        practiceFormPage.validateFormValues(firstNameValue, lastNameValue,emailValue,genderValue,mobileValue,
                subjectsValue,hobbiesValues,uploadValue,adressValue,stateValue,cityValue);


    }
}
