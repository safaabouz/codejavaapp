Feature: book appointment
Actor:Patient

Scenario: the appoitment not found
Given that the patient with username "user12" is logged in
And there is a booked appintment for this patient on "2022-11-06" at "10:00"
When the user tries to update this appoitment
Then error massage "The appoitment not found" will display 	

Scenario: the date updated
Given that the patient with username "uu2020" is logged in
And there is a booked appintment for this patient on "2022-12-24" at "12:30"
When the user tries to update this appoitment
And set the date on "2022-12-26" and the same time
And there is no already booked appointments for that patient at the given time
And the doctor is available at that time
Then the appoitment will updated

Scenario: the time updated
Given that the patient with username "uu2020" is logged in
And there is a booked appintment for this patient on "2022-12-23" at "11:00"
When the user tries to update this appoitment
And set the time at "11:30" and on the same date
And there is no already booked appointments for that patient at the given time
And the doctor is available at that time
Then the appoitment will updated
