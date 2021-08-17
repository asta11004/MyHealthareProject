Feature: Log in

  Scenario: Login to Open EMR
    Given I'm on login page
    When I enter username and password
    Then I'm successfully log in

@test
  Scenario Outline: Login with valid user names to EMR
    Given I'm on login page
    When I enter each "<username>" and "<password>"
    Then user is logged in
    Examples:
       |username|password|
      | admin        | pass         |
      | physician    | physician    |
      | clinician    | clinician    |
      | accountant   | accountant   |
      | receptionist | receptionist |


  Scenario: Login to patient portal
    Given I'm on patient portal
    When enter correct login information:
    Then I should log in successfully

  Scenario: Login to yahoo email

    Given I"m on yahoo mail page
    When I enter mail username and password
    Then I should see my emails

  Scenario: Login with