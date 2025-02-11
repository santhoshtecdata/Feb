

Feature: login
@smoke
Scenario: go to vizza site
    Given click the login option 
    And enter the username
    When enter the password
    And click the login button
    And go to home page
  


