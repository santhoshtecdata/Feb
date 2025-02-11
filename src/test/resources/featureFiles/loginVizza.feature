

Feature: login vizza portal
 

  
  Scenario: login with vaild crententials
    Given open a chrome browser
    And go to vizza poral 
    When provide valid username
    And provide valid password
    And click the submit button
    Then user can see a home page 

