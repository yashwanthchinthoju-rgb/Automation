package Locators;

import org.openqa.selenium.By;

public class LoginPage {

    public By Emailfield = By.xpath("//input[@type='email']");
    public By Passwordfield = By.xpath("//input[@id='userPassword']");
    public By LoginButton = By.xpath("//button[@type='submit']");
    public By LogoCheck = By.xpath("//img[@class='company-logo-header']");
    public By Invalid = By.xpath("//p[text()='Invalid credentials']");


}
