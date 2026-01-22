Feature: Urbuddi Login and Employee Management

  Background:
    Given user launches the browser
    And user navigates to the application url

  @Dashboard
  Scenario: Successful login with valid credentials
    When user logs in with valid username and password
    Then user should see the dashboard

  @Accounts
  Scenario Outline: Login validation with multiple credentials
    When user logs in with username "<username>" and password "<password>"
    Then login result should be "<result>"

    Examples:
      | username                           | password        | result |
      | yashwanth.chinthoju@optimworks.com | abcdef          | fail   |
      | abcdef@h.i                        | Srikrishna@123  | fail   |
      | abcdef@h.i                        | abcdef          | fail |
      | yashwanth.chinthoju@optimworks.com | Srikrishna@123  | pass   |

  @Smoke
  Scenario: Automate adding employees
    When user logs in with valid username and password
    And user navigates to employees page
    Then user adds employees from excel sheet successfully
