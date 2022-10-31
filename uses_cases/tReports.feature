Feature: Reports for admin
Actors: Admin

Scenario: admin needs a report for all patients usernames
   	Given that the administrator with username "1" is logged in
    And the admin requests a report for all usernames
    Then the report will be generated successfully
    
Scenario: admin needs a report for a user appointments
   	Given that the administrator with username "1" is logged in1
    And the admin requests a report for patient "uu2020" appointments
    Then the appointments report will be generated successfully
       
    
