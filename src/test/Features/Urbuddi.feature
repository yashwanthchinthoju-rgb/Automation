Feature: Urbuddi Login Functionality

  @Dashboard
  Scenario: Successful login with valid credentials
    Given launch browser
    When go url
    Then enter credentials
    Then check the dashboard

  @Accounts
  Scenario Outline: Valid Login
    Given Open browser
    When enter Url
    Then Enter Credentials "<username>" and "<password>"
    Then Validate login result "<result>"


    Examples:
      | username                             | password        | result |
      | yashwanth.chinthoju@optimworks.com   | abcdef          | fail   |
      | abcdef@h.i                           | Srikrishna@123  | fail   |
      | abcdef@h.i                           | abcdef          | fail   |
      | yashwanth.chinthoju@optimworks.com   | Srikrishna@123  | pass   |

@Smoke
Scenario: Automate adding empoloyees
  Given Open browser and enter url
  When Login valid credentials
  Then click on employees and add employess
  And complete the adding employees from excelsheet successfully