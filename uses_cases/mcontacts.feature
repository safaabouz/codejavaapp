Feature: Clinic contacts
Actors: Admin

Scenario: save patient as contact
        Given that the patient has a username "user12"
        And the patient contects is null
        When the patient enter "sally@gmail.com" , "05698731" and "nablus-rafedia" as contact information
        Then add this patient as contact to the system

 Scenario: save patient as contact
        Given that the patient has a username "uu2020"
        And the patient contects is null
        When the patient enter "rama@gmail.com" , "05638731" and "ramallah" as contact information
        Then add this patient as contact to the system
            
Scenario: save doctor as contact
        Given that the doctor has a username "2364"
        And the doctor contects is null
        When the doctor enter "ahmad@gmail.com" , "056987231" and "Tubas" as contact information
        Then add this doctor as contact to the system       
         
Scenario: update doctor contact
        Given that the doctor has a username "2364"
        And the doctor contects is not null
        When the doctor enter "Nablus" as the new address
        Then the doctor contact will updated to hold the new address
               
 Scenario: delete patient contact
        Given that the patient has a username "uu2020"
        And the patient contects is not null
        When the Admin tries to delete the pation contact record
        Then delete this contact from the system
            
#Scenario: save doctor as contact
   #     Given the user logged in successfully
    #    And the user log state is "2"
   #     And this doctor information is not saved as a contact
   #     Then save the doctor contact information
        
#Scenario: Companies and other contacts
     #   Given the admin is logged in with username "1"
     #   Then save the company contact information