Feature: Determine the appointment state

Scenario: The patient came to his appointment
        Given the patient booked an appointment
        And the patient came to his appointment
        Then the visit state will be converted to visited
        
      
Scenario: The patient booked an appointment, the appointment does not came yet
        Given the patient booked an appointment
        And the appointment date still not came
        Then the visit state will be converted to waiting
        
Scenario: The patient booked an appointment, but he did not came
        Given the patient booked an appointment
        And the appointment out of date without visiting 
        Then the visit state will be converted to out of date
        
