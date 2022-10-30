Feature: Determine the appointment state

Actors: Admin
Scenario: The patient came to his appointment
        Given the patient with username "user12" booked an appointment
        And the patient came to his appointment
        Then the visit state will be converted to visited
        And the visit notes will be added

        
Scenario: The patient booked an appointment, but he did not came
        Given the patient with username "user12" booked an appointment
        And the appointment out of date without visiting 
        Then the visit state will be converted to missed