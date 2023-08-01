Feature: User should be able to log in using the correct credentials

  User Story: As sales manager and expenses manager, I should be able to Login with valid credentials.

  Accounts are sales manger and expenses manager

  Background: User is already in the login page
    Given the user is on the login page


  @B29G31-203
  Scenario Outline: Positive Login as sales manager
    When user enters "<username>" username and "<password>" password
    Then user clicks on the Log in button
    Then user should gain access to their inbox

    Examples:
      | username                    | password         |
      | salesmanager55@info.com     | salesmanger      |
      | expensesmanager12@info.com  | expensesmanager  |

  @B29G31-204
  Scenario Outline: Negative Login
    When user enters wrong "<Username>" username and correct "<Password>" password
    Then user clicks on the Log in button
    Then user should see the following error message "Wrong login/password"

    Examples:
      | Username                     | Password         |
      | salesmanager550@info.com     | salesmanger      |
      | expensesmanager200@info.com  | expensesmanager  |
      | salesmanager55@info.com      | salesmanager     |
      | expensesmanager12@info.com   | expensesmanager  |

  @B29G31-205
  Scenario Outline: Incomplete Login
    When user enters different "<Username>" username and "<Password>" password
    Then user clicks on the Log in button
    Then user should see the following message "Please fill in this field."

    Examples:
      | Username              | Password   |
      | salesmanager50@info.com |            |
      |                       | salesmanger |
