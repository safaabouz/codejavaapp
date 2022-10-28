Feature: Patient bill
Actors: Patient

Scenario: patient with no visit appointments
 	Given that the administrator with username "1" is logged in
 	And there is a registered patient with username "user12"
 	When  the patient did not visit the doctor on time
 	Then he will get a null value
 	
Scenario: pationt visit an appointment 
    Given that the administrator with username "1" is logged in
    And there is registered patient with username "user12"
    When  the patient visits the doctor at the appointed time
    And get the medicine with mid-name "Capsules "
    Then he will get a invoice for the patient
    
     	
Scenario: pationt visit an appointment 
    Given that the administrator with username "1" is logged in
    And there is registered patient with username "user12"
    When  the patient visits the doctor at the appointed time
    And do not get the medicine 
    Then he will get a invoice for the patient
    