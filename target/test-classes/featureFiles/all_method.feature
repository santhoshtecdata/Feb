

Feature: verify the proposal is created when give all valid credentails
@flow
 Scenario: verify the proposal created are not
    Given login the vizza portal
    And select the vehicle type 
    When select the newbusiness in plan type "new"
    And provide the valid inputs in basic details page
    And select the premium amount 
    And verify the KYC details
    Then fill the personal details 
    And fill the vechile details 
    And fill the nominee details 
    And proposal is created or not




