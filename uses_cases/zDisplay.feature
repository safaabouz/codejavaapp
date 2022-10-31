Feature: Dispaly
Actors: Admin

Scenario: display the clinic doctors
 	Given that an admin with username "1" is logged in
 	When the admin tries to display the clinic doctors
 	Then a list of Doctors will be prented

Scenario: display the clinic Patients
 	Given that an admin with username "1" is logged in
 	When the admin tries to display the clinic patients
 	Then a list of patients will be prented 	