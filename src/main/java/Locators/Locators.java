package Locators;

import org.openqa.selenium.By;

public class Locators {


    public By Emailfield = By.xpath("//input[@type='email']");
    public By Passwordfield = By.xpath("//input[@id='userPassword']");
    public By LoginButton = By.xpath("//button[@type='submit']");
    public By LogoCheck = By.xpath("//img[@class='company-logo-header']");
    public By Invalid = By.xpath("//p[text()='Invalid credentials']");
    public By Employees = By.xpath("(//p[text()='Employees'])[1]");
    public By AddEmployees = By.xpath("//button[contains(text(),'Add Employee')]");
    public By AddButton = By.xpath("//button[text()='Add']");
    public By First_name = By.xpath("//input[@name='firstName']");
    public By last_name = By.xpath("//input[@name='lastName']");
    public By emp_id = By.xpath("//input[@id='employeeID']");
    public By email = By.xpath("//input[@name='email']");
    public By role = By.xpath("//select[@name='role']");
    public By password = By.xpath("//input[@type='password']");
    public By Dob = By.xpath("(//input[@type='date'])[1]");
    public By joiningdate = By.xpath("(//input[@type='date'])[2]");
    public By Qualifications = By.xpath("//select[@id='qualifications']");
    public By department = By.xpath("//input[@name='department']");
    public By gender = By.xpath("//select[@id='gender']");
    public By Mobilenum = By.xpath("//input[@name='mobileNumber']");
    public By bloodgroup = By.xpath("//select[@id='bloodGroup']");
    public By designation = By.xpath("//input[@name='designation']");
    public By salary = By.xpath("//input[@id='salary']");
    public By location = By.xpath("//input[@name='location']");
    public By reportingTo = By.xpath("//select[@id='reportingTo']");
}

