package tests;

import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.IndexPage;
import pages.WebTablesPage;
import sharedData.SharedData;

public class WebTablesTest extends SharedData {

    @Test
    public void testMetod() {



        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithElementsMenu();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.interactWithWebTableSubMenu();


        int tableSize = 3;
        String firstnameValue = "Abdul";
        String lastnameValue = "Naptul";
        String emailValue = "baga@gmail.com";
        String ageValue = "27";
        String salaryValue = "2500";
        String departmentValue = "frizer";
        String editfirstnameValue = "Nepal";
        String editlastnameValue = "Paki";
        String editemailValue = "alablala@gmail.com";
        String editageValue = "28";
        String editsalaryValue = "1000";
        String editdepartmentValue = "Gunoier";


        WebTablesPage webTablesPage = new WebTablesPage(getDriver());
        webTablesPage.addNewEntry(tableSize,firstnameValue,lastnameValue,emailValue,ageValue,salaryValue,departmentValue);
        webTablesPage.editNewEntry(tableSize,editfirstnameValue,editlastnameValue,editemailValue,editageValue,editsalaryValue,editdepartmentValue);
        webTablesPage.deleteNewEntry(3);
    }

}
