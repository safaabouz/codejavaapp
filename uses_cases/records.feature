Feature: records feature


Scenario: patient Logged in
         Given logIn succeed
         Then logged in shall be recorded
         

Scenario: patient Logged out
         Given logIn succeed
         And  patient logged out
         Then logged out shall be recorded 
         

Scenario: patient register an appointment 
         Given patient registered an appointement successfully
         Then registration shall be recorded  
         

Scenario: patient delete an appointment 
         Given patient registered an appointement successfully
         Then registration shall be recorded                          

         ###########################################################
         
Scenario: Doctor Logged in
         Given logIn succeed
         Then logged in shall be recorded
         

Scenario: Doctor Logged out
         Given logIn succeed
         And  Doctor logged out
         Then logged out shall be recorded 
         

Scenario: Doctor register an appointment 
         Given Doctor registered an appointement successfully
         Then registration shall be recorded  
         

Scenario: patient delete an appointment 
         Given Doctor registered an appointement successfully
         Then registration shall be recorded  
         
         
         ##### doctor edit patients files
