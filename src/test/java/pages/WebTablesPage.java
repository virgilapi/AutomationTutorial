package pages;

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

        clickAddButton();
        fillFirstName(firstnameValue);
        fillLastName(lastnameValue);
        fillEmail(emailValue);
        fillAge(ageValue);
        fillSalary(salaryValue);
        fillDepartment(departmentValue);
        clickSubmit();

       elementHelper.validateListsize(tableList, tableSize + 1);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), firstnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), lastnameValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), emailValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), ageValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), salaryValue);
        elementHelper.validateElementCotainsText(tableList.get(tableSize), departmentValue);

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

       elementHelper.validateListsize(tableList, tableSize + 1);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editfirstnameValue);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editlastnameValue);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editemailValue);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editageValue);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editsalaryValue);
       elementHelper.validateElementCotainsText(tableList.get(tableSize), editdepartmentValue);

   }

   public void deleteNewEntry(int tableSize){
       clickDeleteButton();
       elementHelper.validateListsize(tableList, tableSize);

   }

   public void clickAddButton(){
       elementHelper.clickElement(addElement);
   }

   public void fillFirstName(String firstnameValue){
       elementHelper.fillElement(firstnameElement, firstnameValue);
   }

   public void fillLastName(String lastnameValue) {
       elementHelper.fillElement(lastnameElement, lastnameValue);
   }

   public void fillEmail(String emailValue){
       elementHelper.fillElement(emailELement, emailValue);
   }

   public void fillAge(String ageValue){
       elementHelper.fillElement(ageElement, ageValue);
   }

   public void fillSalary(String salaryValue){
       elementHelper.fillElement(salaryElement, salaryValue);
   }

   public void fillDepartment(String departmentValue){
       elementHelper.fillElement(departmentElement, departmentValue);
   }

   public void clickSubmit(){
       elementHelper.ultraJSElement(submitElement);
   }

   public void clickEdit(){
       elementHelper.ultraJSElement(editElement);
   }

    public void editfillFirstName(String firstnameValue){
        elementHelper.clearFillElement(editfirstnameElement, firstnameValue);
    }

    public void editfillLastName(String lastnameValue) {
        elementHelper.clearFillElement(editlastnameElement, lastnameValue);
    }

    public void editfillEmail(String emailValue){
        elementHelper.clearFillElement(editemailELement, emailValue);
    }

    public void editfillAge(String ageValue){
        elementHelper.clearFillElement(editageElement, ageValue);
    }

    public void editfillSalary(String salaryValue){
        elementHelper.clearFillElement(editsalaryElement, salaryValue);
    }

    public void editfillDepartment(String departmentValue){
        elementHelper.clearFillElement(editdepartmentElement, departmentValue);
    }

    public void clickDeleteButton(){
        elementHelper.ultraJSElement(deleteElement);

    }

}


