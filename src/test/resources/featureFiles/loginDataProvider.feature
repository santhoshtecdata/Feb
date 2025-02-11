
Feature: loginPage dataprovider test
 
  Scenario: login with multiple users
    Given go to vizza portal
    When enter the username and password
    | username | password |
    | TESTING1    | 2   | 
    | TESTING2    | 2   |
    | TESTING3    | 2   |
    And click the login button 
   And verify the login
  
    
 

  
