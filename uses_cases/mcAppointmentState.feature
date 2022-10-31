Feature: Determine the appointment state

Actors: Admin
Scenario: The patient came to his appointment
        Given the patient with username "uu2020" booked an appointment
        And the appointment is today
        And the patient came to his appointment
        Then the visit state will be converted to visited
        And the visit notes "Nice visit" will be added 

        
Scenario: The patient booked an appointment, but he did not came
        Given the patient with username "uu2020" booked an appointment
        And the appointment out of date without visiting 
        Then the visit state will be converted to missed