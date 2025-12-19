package stepDefinitions;

import Hooks.Hooks;
import Methods.AddEmpAutoPage;
import io.cucumber.java.en.*;
import utilities.AddEmpExcelUtils;

import java.util.List;
import java.util.Map;

public class AddEmployees {

    AddEmpAutoPage addEmp;

    @Given("Open browser and enter url")
    public void open_browser_and_enter_url() {
        addEmp = new AddEmpAutoPage(Hooks.driver);
    }

    @When("Login valid credentials")
    public void login_valid_credentials() {
        addEmp.email("yashwanth.chinthoju@optimworks.com");
        addEmp.password("Srikrishna@123");
        addEmp.loginButton();
    }

    @Then("click on employees and add employess")
    public void click_on_employees_and_add_employess() {
        addEmp.employees();
        addEmp.addEmployees();
    }

    @Then("complete the adding employees from excelsheet successfully")
    public void complete_the_adding_employees_from_excelsheet_successfully() {

        String excelPath = "src/test/resources/TestData/AddEmp.xlsx";
        List<Map<String, String>> excelData = AddEmpExcelUtils.getExcelData(excelPath, "Sheet1");
        for (Map<String, String> data : excelData) {
            addEmp.enterFirstName(data.get("First Name"));
            addEmp.enterLastName(data.get("Last Name"));
            addEmp.enterEmpId(data.get("EmpId"));
            addEmp.enterEmployeeEmail(data.get("Email"));
            addEmp.enterrole(data.get("Role"));
            addEmp.enterpassword(data.get("Password"));
            addEmp.enterDob(data.get("DOB"));
            addEmp.enterjoindate(data.get("JoinDate"));
            addEmp.enterqualifications(data.get("Qualifications"));
            addEmp.enterdepartment(data.get("Department"));
            addEmp.entergender(data.get("Gender"));
            addEmp.entermobilenum(data.get("Mobile no"));
            addEmp.enterbloodgroup(data.get("Blood group"));
            addEmp.enterdesignation(data.get("Designation"));
            addEmp.entersalary(data.get("Salary"));
            addEmp.enterloc(data.get("Location"));
            addEmp.enterreportingTo(data.get("Reporting to"));
            addEmp.addButton();
        }
    }
}
