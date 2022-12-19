Feature: Patient bill
Actors: Patient
@test
Scenario: User can generate an invoice for single service
Given that the User have an appointment on "4/11/2022"
And the appointment has "getmedicine" service
Then the invoice value is the sum of doctorcost and medcost
And the invoice generated successfully

@test
Scenario: User can generate an invoice without service
Given that the User have an appointment on "4/11/2022"
Then the invoice value is the doctorcost "100"
And the invoice generated successfully

Scenario: User who missed his appointment
Given that the User have an appointment on "4/11/2022"
Then the invoice value is "0"
And the invoice generated successfully