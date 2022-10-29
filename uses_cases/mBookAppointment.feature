Feature: book appointment
Description:Each Doctor can receive new appointment evrey half hour

Background: booking

Given I have these Doctors in my Clinic
		| 1111 | 10:00 | 14:00 | Saturday,Sunday |
		| 2364 | 12:00 | 18:00 | Thursday,Friday |
And these already booked appointments 
		| 1111 |2022-11-27| 10:30 |	
		
Scenario: the doctor is on his off day
Given that the user with username "user12" is logged in
And there is an appintment for doctor "1111" on "2022-10-30" at "10"
When the user tries to book this appointment
Then error massage "This doctor is on his off day" should display 	
	
		