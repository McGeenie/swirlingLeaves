@US01Login
Feature: User should be able to log in using the correct credentials

  User Story: As POS and CRM manager, I should be able to Login with valid credentials.

  Accounts are POS and CRM manager

  Background: User is already in the login page
    Given the user is on the login page


  @B29G31-203
  Scenario Outline: Positive Login with clicking
    When user enters "<username>" username and "<password>" password
    Then user clicks on the Log in button
    Then user should gain access to their inbox

    Examples:
      | username                    | password         |
      | posmanager55@info.com       | posmanager       |
      | eventscrmmanager12@info.com | eventscrmmanager |

  @B29G31-264
  Scenario Outline: Positive Login with pressing ENTER
    When user enters "<username>" username and "<password>" password
    Then user presses the ENTER key
    Then user should gain access to their inbox

    Examples:
      | username                    | password         |
      | posmanager55@info.com       | posmanager       |
      | eventscrmmanager12@info.com | eventscrmmanager |

  @B29G31-204
  Scenario Outline: Negative Login
    When user enters wrong "<Username>" username and correct "<Password>" password
    Then user clicks on the Log in button
    Then user should see the following error message "Wrong login/password"

    Examples:
      | Username                     | Password         |
      | posmanager550@info.com       | posmanager       |
      | eventscrmmanager200@info.com | eventscrmmanager |
      | posmanager55@info.com        | posmanage        |
      | eventscrmmanager12@info.com  | eventscrmanager  |

  @B29G31-205
  Scenario Outline: Incomplete Login
    When user enters different "<Username>" username and "<Password>" password
    Then user clicks on the Log in button
    Then user should see the following message "Please fill in this field."

    Examples:
      | Username              | Password   |
      | posmanager50@info.com |            |
      |                       | posmanager |





