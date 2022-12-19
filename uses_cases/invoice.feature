#Feature: Patient bill
#Actors: Patient
#@test
#Scenario: User can generate an invoice for single service
#Given that the User have an appointment on "4/11/2022"
#And the appointment has "getmedicine" service
#Then the invoice value is the sum of doctorcost and medcost
#And the invoice generated successfully
#
#@test
#Scenario: User can generate an invoice without service
#Given that the User have an appointment on "4/11/2022"
#Then the invoice value is the doctorcost "100"
#And the invoice generated successfully
#
#Scenario: User who missed his appointment
#Given that the User have an appointment on "4/11/2022"
#Then the invoice value is "0"
#And the invoice generated successfully
#
#@test2
#Scenario: User can generate an invoice for multiple services
#Given that the User have an appointment on "23/10/2022"
#And the appointment has "Normal tooth extraction" service and "Teeth whitening" service 
#Then the invoice value is the summation of "170" and "320" 
#And the invoice generated successfully
#Scenario: patient with missed appointments
# 	Given that the administrator with username "1" is logged in
 #	And there is a registered patient with username "user12"
 #	When  the patient did not visit the doctor on time
# 	Then he will get a null value
 	#
#Scenario: pationt visit an appointment 
#    Given that the administrator with username "1" is logged in
 #   And there is registered patient with username "user12"
 #   When  the patient visits the doctor at the appointed time
 #   And get the medicine with mid-name "Capsules "
 #   Then he will get a invoice for the patient
    #
     #	
#Scenario: pationt visit an appointment 
  #  Given that the administrator with username "1" is logged in
  #  And there is registered patient with username "user12"
  #  When  the patient visits the doctor at the appointed time
 #   And do not get the medicine 
  #  Then he will get a invoice for the patient
    