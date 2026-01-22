package stepDefinitions;

import Methods.EmployeesPage;
import Methods.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.*;
import utilities.AddEmpExcelUtils;

import java.util.List;
import java.util.Map;

public class EmployeesSteps {

    LoginPage login;
    EmployeesPage emp;

    @When("user navigates to employees page")
    public void user_navigates_to_employees_page() {
        emp = new EmployeesPage(Hooks.driver);
        emp.openEmployeesPage();
        emp.clickAddEmployee();
    }


    @Then("user adds employees from excel sheet successfully")
    public void user_adds_employees_from_excel_sheet_successfully() {

        String excelPath = "src/test/resources/TestData/AddEmp.xlsx";
        List<Map<String, String>> excelData = AddEmpExcelUtils.getExcelData(excelPath, "Sheet1");

        for (Map<String, String> data : excelData) {

            emp.enterFirstName(data.get("First Name"));
            emp.enterLastName(data.get("Last Name"));
            emp.enterEmpId(data.get("EmpId"));
            emp.enterEmail(data.get("Email"));
            emp.selectRole(data.get("Role"));
            emp.enterPassword(data.get("Password"));
            emp.enterDob(data.get("DOB"));
            emp.enterJoinDate(data.get("JoinDate"));
            emp.selectQualification(data.get("Qualifications"));
            emp.enterDepartment(data.get("Department"));
            emp.selectGender(data.get("Gender"));
            emp.enterMobile(data.get("Mobile no"));
            emp.selectBloodGroup(data.get("Blood group"));
            emp.enterDesignation(data.get("Designation"));
            emp.enterSalary(data.get("Salary"));
            emp.enterLocation(data.get("Location"));
            emp.selectReportingTo(data.get("Reporting to"));

            emp.clickAddButton();
        }
    }
}
