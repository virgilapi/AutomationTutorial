package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablesPage extends BasePage {



    @FindBy(xpath = "//div[@class='rt-tr -even' or @class='rt-tr -odd']")
    private List<WebElement> tableList;
    @FindBy (id = "addNewRecordButton")
    private WebElement addElement;
    @FindBy(id = "firstName")
    private WebElement firstnameElement;
    @FindBy(id = "lastName")
    private WebElement lastnameElement;
    @FindBy(id = "userEmail")
    private WebElement emailELement;
    @FindBy(id = "age")
    private WebElement ageElement;
    @FindBy(id = "salary")
    private WebElement salaryElement;
    @FindBy(id = "department")
    private WebElement departmentElement;
    @FindBy(id ="submit" )
    private WebElement submitElement;
    @FindBy(id = "edit-record-4")
    private WebElement editElement;
    @FindBy(id = "firstName")
    private WebElement editfirstnameElement;
    @FindBy(id = "lastName")
    private WebElement editlastnameElement;
    @FindBy(id = "userEmail")
    private WebElement editemailELement;
    @FindBy(id = "age")
    private WebElement editageElement;
    @FindBy(id = "salary")
    private WebElement editsalaryElement;
    @FindBy(id = "department")
    private WebElement editdepartmentElement;
    @FindBy(id = "delete-record-4")
    private WebElement deleteElement;

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public void addNewEntry(int tableSize, String firstnameValue,String lastnameValue,
                           String emailValue,String ageValue,String salaryValue,String departmentValue){
        elementHelper.validateListsize(tableList, tableSize);
        LoggerUtility.infoLog("The user validates that the table has"+tableSize+"rows");

        clickAddButton();
        fillFirstName(firstnameValue);
        fillLastName(lastnameValue);
        fillEmail(emailValue);
        fillAge(ageValue);
        fillSalary(salaryValue);
        fillDepartment(departmentValue);
        clickSubmit();

        int expectedTableSize = tableSize+1;
        elementHelper.validateListsize(tableList, expectedTableSize);
        LoggerUtility.infoLog("The user validates that the table has"+expectedTableSize+"rows");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), firstnameValue);
        LoggerUtility.infoLog("The user validates that the table contains"+firstnameValue+"value");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), lastnameValue);
        LoggerUtility.infoLog("The user validates that the table contains"+lastnameValue+"value");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), emailValue);
        LoggerUtility.infoLog("The user validates that the table contains"+emailValue+"value");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), ageValue);
        LoggerUtility.infoLog("The user validates that the table contains"+ageValue+"value");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), salaryValue);
        LoggerUtility.infoLog("The user validates that the table contains"+salaryValue+"value");
        elementHelper.validateElementCotainsText(tableList.get(tableSize), departmentValue);
        LoggerUtility.infoLog("The user validates that the table contains"+departmentValue+"value");

    }

   public void editNewEntry(int tableSize, String editfirstnameValue,String editlastnameValue,
                            String editemailValue,String editageValue,String editsalaryValue,String editdepartmentValue){

       clickEdit();
       editfillFirstName(editfirstnameValue);
       editfillLastName(editlastnameValue);
       editfillEmail(editemailValue);
       editfillAge(editageValue);
       editfillSalary(editsalaryValue);
       editfillDepartment(editdepartmentValue);
       clickSubmit();

       int expectedTableSize = tableSize+1;
       elementHelper.validateListsize(tableList, expectedTableSize);
       LoggerUtility.infoLog("The user validates that the table has"+expectedTableSize+"rows");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editfirstnameValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editfirstnameValue+"value");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editlastnameValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editlastnameValue+"value");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editemailValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editemailValue+"value");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editageValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editageValue+"value");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editsalaryValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editsalaryValue+"value");
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editdepartmentValue);
       LoggerUtility.infoLog("The user validates that the table contains"+editdepartmentValue+"value");

   }

   public void deleteNewEntry(int tableSize){
       clickDeleteButton();
       elementHelper.validateListsize(tableList, tableSize);

   }

   public void clickAddButton(){
       elementHelper.clickElement(addElement);
       LoggerUtility.infoLog("The user clicks on the add button");
   }

   public void fillFirstName(String firstnameValue){
       elementHelper.fillElement(firstnameElement, firstnameValue);
       LoggerUtility.infoLog("The user fills first name filed"+firstnameValue);
   }

   public void fillLastName(String lastnameValue) {
       elementHelper.fillElement(lastnameElement, lastnameValue);
       LoggerUtility.infoLog("The user fills last name filed"+lastnameValue);

   }

   public void fillEmail(String emailValue){
       elementHelper.fillElement(emailELement, emailValue);
       LoggerUtility.infoLog("The user fills email filed"+emailValue);

   }

   public void fillAge(String ageValue){
       elementHelper.fillElement(ageElement, ageValue);
       LoggerUtility.infoLog("The user fills age filed"+ageValue);
   }

   public void fillSalary(String salaryValue){
       elementHelper.fillElement(salaryElement, salaryValue);
       LoggerUtility.infoLog("The user fills salary filed"+salaryValue);
   }

   public void fillDepartment(String departmentValue){
       elementHelper.fillElement(departmentElement, departmentValue);
       LoggerUtility.infoLog("The user fills department filed"+departmentValue);
   }

   public void clickSubmit(){
       elementHelper.ultraJSElement(submitElement);
       LoggerUtility.infoLog("The user clicks on the submit button");
   }

   public void clickEdit(){
       elementHelper.ultraJSElement(editElement);
       LoggerUtility.infoLog("The user clicks on the edit button");
   }

    public void editfillFirstName(String firstnameValue){
        elementHelper.clearFillElement(editfirstnameElement, firstnameValue);
        LoggerUtility.infoLog("The user fills first name filed"+firstnameValue);

    }

    public void editfillLastName(String lastnameValue) {
        elementHelper.clearFillElement(editlastnameElement, lastnameValue);
        LoggerUtility.infoLog("The user fills last name filed"+lastnameValue);
    }

    public void editfillEmail(String emailValue){
        elementHelper.clearFillElement(editemailELement, emailValue);
        LoggerUtility.infoLog("The user fills email filed"+emailValue);
    }

    public void editfillAge(String ageValue){
        elementHelper.clearFillElement(editageElement, ageValue);
        LoggerUtility.infoLog("The user fills age filed"+ageValue);
    }

    public void editfillSalary(String salaryValue){
        elementHelper.clearFillElement(editsalaryElement, salaryValue);
        LoggerUtility.infoLog("The user fills salary filed"+salaryValue);
    }

    public void editfillDepartment(String departmentValue){
        elementHelper.clearFillElement(editdepartmentElement, departmentValue);
        LoggerUtility.infoLog("The user fills departmen filed"+departmentValue);
    }

    public void clickDeleteButton(){
        elementHelper.ultraJSElement(deleteElement);
        LoggerUtility.infoLog("The user clicks on delete button");
    }

}


