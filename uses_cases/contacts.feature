Feature: Clinic contacts
Actors: Admin

Scenario: save patient as contact
        Given the user logged in successfully
        And the user log state is "3"
        And this patient information is not saved as a contact
        Then save the patient contact information
        
Scenario: save doctor as contact
        Given the user logged in successfully
        And the user log state is "2"
        And this doctor information is not saved as a contact
        Then save the doctor contact information
        
Scenario: Companies and other contacts
        Given the admin is logged in with username "1"
        Then save the company contact information