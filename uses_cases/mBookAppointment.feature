Feature: book appointment
Description:Each Doctor can receive new appointment evrey half hour

Background: booking

Given I have these Doctors in my Clinic
		| 1111 | 10:00 | 14:00 | Saturday,Sunday |
		| 2364 | 12:00 | 18:00 | Thursday,Friday |
And these already booked appointments 
		| 1111 | 2022-12-23 | 10:30 |	
		
Scenario: the doctor is on his off day
Given that the user with username "user12" is logged in
And there is an appintment for doctor "2364" on "2022-12-23" at "10:00"
When the user tries to book this appointment
Then error massage "This doctor is on his off day" should display 	
	
Scenario: this appointment is past
Given that the user with username "user12" is logged in
And there is an appintment for doctor "2364" on "2022-10-30" at "10:00"
When the user tries to book this appointment
Then error massage "It's an old Appointment,try to book a new one" should display 		

Scenario: already booked appointment
Given that the user with username "user12" is logged in
And there is an appintment for doctor "1111" on "2022-12-23" at "10:30"
When the user tries to book this appointment
Then error massage "It's already booked by another patient, try to book a new one" should display 

Scenario: the appointment booked successfully
Given that the user with username "uu2020" is logged in
And there is an appintment for doctor "1111" on "2022-12-23" at "11:00"
When the user tries to book this appointment
And the user dosen't have any appointments at the same time
Then this appointment will booked successfully		

Scenario: book multiple appointments at different times
Given that the user with username "uu2020" is logged in
And there is an appintment for doctor "2364" on "2022-12-24" at "12:30"
When the user tries to book this appointment
And the user dosen't have any appointments at the same time
Then this appointment will booked successfully		

Scenario: the appointment booked successfully
Given that the user with username "uu2020" is logged in
And there is an appintment for doctor "1111" on "2022-12-22" at "13:30"
When the user tries to book this appointment
And the user dosen't have any appointments at the same time
Then this appointment will booked successfully		

Scenario: book multiple appointments at the same time
Given that the user with username "uu2020" is logged in
And there is an appintment for doctor "2364" on "2022-12-22" at "13:30"
When the user tries to book this appointment
And the user dosen't have any appointments at the same time
Then conflict in appointments will occurs

		