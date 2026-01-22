package Methods;

import Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeesPage {

    WebDriver driver;
    WebDriverWait wait;
    Locators loc = new Locators();

    public EmployeesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openEmployeesPage() {
        wait.until(ExpectedConditions.elementToBeClickable(loc.Employees)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='EMP ID']")));
    }

    public void clickAddEmployee() {
        driver.findElement(loc.AddEmployees).click();
    }

    public void enterFirstName(String firstName) {
        WebElement field = driver.findElement(loc.First_name);
        field.clear();
        field.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement field = driver.findElement(loc.last_name);
        field.clear();
        field.sendKeys(lastName);
    }

    public void enterEmpId(String empId) {
        WebElement field = driver.findElement(loc.emp_id);
        field.clear();
        field.sendKeys(empId);
    }

    public void enterEmail(String email) {
        WebElement field = driver.findElement(loc.email);
        field.clear();
        field.sendKeys(email);
    }

    public void selectRole(String roleValue) {
        Select role = new Select(driver.findElement(loc.role));
        role.selectByVisibleText(roleValue);
    }

    public void enterPassword(String password) {
        WebElement field = driver.findElement(loc.password);
        field.clear();
        field.sendKeys(password);
    }

    public void enterDob(String dob) {
        WebElement field = driver.findElement(loc.Dob);
        field.clear();
        field.sendKeys(dob);
    }

    public void enterJoinDate(String joinDate) {
        WebElement field = driver.findElement(loc.joiningdate);
        field.sendKeys(joinDate);
    }

    public void selectQualification(String qualification) {
        Select select = new Select(driver.findElement(loc.Qualifications));
        select.selectByVisibleText(qualification);
    }

    public void enterDepartment(String department) {
        driver.findElement(loc.department).sendKeys(department);
    }

    public void selectGender(String gender) {
        Select select = new Select(driver.findElement(loc.gender));
        select.selectByVisibleText(gender);
    }

    public void enterMobile(String mobile) {
        driver.findElement(loc.Mobilenum).sendKeys(mobile);
    }

    public void selectBloodGroup(String bloodGroup) {
        Select select = new Select(driver.findElement(loc.bloodgroup));
        select.selectByVisibleText(bloodGroup);
    }

    public void enterDesignation(String designation) {
        driver.findElement(loc.designation).sendKeys(designation);
    }

    public void enterSalary(String salary) {
        driver.findElement(loc.salary).sendKeys(salary);
    }

    public void enterLocation(String location) {
        driver.findElement(loc.location).sendKeys(location);
    }

    public void selectReportingTo(String reportingTo) {
        Select select = new Select(driver.findElement(loc.reportingTo));
        select.selectByVisibleText(reportingTo);
    }

    public void clickAddButton() {
        driver.findElement(loc.AddButton).click();
    }
}

