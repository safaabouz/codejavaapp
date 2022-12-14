Feature: Track patient Appointments
Actors: Admin

Scenario: patient with no booked appointments
 	Given that the administrator with username "1" is logged in
 	And there is a registered patient with username "user12"
 	When the admin tries to reache the patient appointments
 	Then he will get a null value
 	
Scenario: pationt booked an appointment 
    Given that the administrator with username "1" is logged in
    And there is a registered patient with username "uu2020"
    When the admin tries to reache the patient appointments
    Then he will get a record for the patient
    
    
Scenario:  pationt visited appointment 
    Given that the admin with username "1" is logged in
    And there is a registered patient with the username "uu2020"
    When the admin tries to reache the patient visited appointments
    Then he will get a record for his visited appointments 
    
    
 	