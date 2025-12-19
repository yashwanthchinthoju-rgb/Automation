package Methods;

import Locators.AddEmployees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEmpAutoPage {

    WebDriver driver;
    AddEmployees AE;
    WebDriverWait wait;

    public AddEmpAutoPage(WebDriver driver){
        this.driver = driver;
        AE = new AddEmployees();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void email(String Email){
        WebElement emailfield = driver.findElement(AE.Emailfield);
        emailfield.sendKeys(Email);

    }

    public void password(String Password){
        WebElement password = driver.findElement(AE.Passwordfield);
        password.sendKeys(Password);

    }

    public void loginButton(){
        WebElement LoginButton = driver.findElement(AE.LoginButton);
        LoginButton.click();

    }

    public void employees(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.Employees));
        wait.until(ExpectedConditions.elementToBeClickable(AE.Employees)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='EMP ID']")));
    }

    public void addEmployees(){
        WebElement AddEmployees = driver.findElement(AE.AddEmployees);
        AddEmployees.click();
    }


    public void enterFirstName(String FirstName){
        WebElement first_name = driver.findElement(AE.First_name);
        first_name.clear();
        first_name.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        WebElement last_name = driver.findElement(AE.last_name);
        last_name.clear();
        last_name.sendKeys(LastName);
    }

    public void enterEmpId(String EmpId){
        WebElement empid = driver.findElement(AE.emp_id);
        empid.clear();
        empid.sendKeys(EmpId);
    }

    public void enterEmployeeEmail(String Email){
        WebElement email = driver.findElement(AE.email);
        email.clear();
        email.sendKeys(Email);
    }

    public void enterrole(String roleValue){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.role));
        wait.until(ExpectedConditions.elementToBeClickable(AE.role));
        Select roleDropdown = new Select(driver.findElement(AE.role));
        roleDropdown.selectByVisibleText(roleValue);

    }

    public void enterpassword(String Password) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.password));
        WebElement password = driver.findElement(AE.password);
        password.clear();
        password.sendKeys(Password);
    }

    public void enterDob(String dob) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.Dob));
        WebElement dobField = driver.findElement(AE.Dob);
        dobField.clear();
        dobField.sendKeys(dob);

    }

    public void enterjoindate(String joindate) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.joiningdate));
        WebElement dobField = driver.findElement(AE.joiningdate);
        dobField.click();
        dobField.sendKeys(joindate);

    }

    public void enterqualifications(String Qualifications){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.Qualifications));
        wait.until(ExpectedConditions.elementToBeClickable(AE.Qualifications));
        Select qualifications = new Select(driver.findElement(AE.Qualifications));
        qualifications.selectByVisibleText(Qualifications);
    }

    public void enterdepartment(String Department){
        WebElement department = driver.findElement(AE.department);
        department.clear();
        department.sendKeys(Department);
    }

    public void entergender(String Gender){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.gender));
        wait.until(ExpectedConditions.elementToBeClickable(AE.gender));
        Select qualifications = new Select(driver.findElement(AE.gender));
        qualifications.selectByVisibleText(Gender);

    }

    public void entermobilenum(String Mobilenum){
        WebElement mobilenum = driver.findElement(AE.Mobilenum);
        mobilenum.clear();
        mobilenum.sendKeys(Mobilenum);
    }

    public void enterbloodgroup(String Bloodgroup){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.bloodgroup));
        wait.until(ExpectedConditions.elementToBeClickable(AE.bloodgroup));
        Select bloodgroup = new Select(driver.findElement(AE.bloodgroup));
        bloodgroup.selectByVisibleText(Bloodgroup);

    }

    public void enterdesignation(String Designation){
        WebElement designation = driver.findElement(AE.designation);
        designation.sendKeys(Designation);
    }

    public void entersalary(String Salary){
        WebElement salary = driver.findElement(AE.salary);
        salary.sendKeys(Salary);
    }

    public void enterloc(String Location){
        WebElement loc = driver.findElement(AE.location);
        loc.sendKeys(Location);

    }

    public void enterreportingTo(String ReportingTo){

        wait.until(ExpectedConditions.visibilityOfElementLocated(AE.reportingTo));
        wait.until(ExpectedConditions.elementToBeClickable(AE.reportingTo));
        Select reportto = new Select(driver.findElement(AE.reportingTo));
        reportto.selectByVisibleText(ReportingTo);

    }

    public void addButton(){
        WebElement AddButton = driver.findElement(AE.AddButton);
        AddButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
