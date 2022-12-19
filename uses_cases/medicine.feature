#Feature: medicine feature
#
 #  The first example has two steps
#Scenario: patient can get medicine
#	Given I have the following medicine in my clinic by list
#	  | Capsules     | Amgen   |13/11/2022|20 |
#	  | Appetiser    | Novartis|17/4/2023 |40 |
#	  | Anti-allergic| Pfizer  |25/5/2024 |100|
#	  | Antipyretic  | Roche   |07/07/2023|180|
#	  | Antifungal   | AbbVie  |28/07/2025|60 |
#	And The patient is successfully entered
#	And the information of that patient is "user12" , "12admina" respectively
#	Then the patient get medicine succeeds
#	
#	
#	Scenario: patient can not logged in
#	Given I have the following medicine in my clinic by list
#	  | Capsules     | Amgen   |13/11/2022|20 |100|
#	  | Appetiser    | Novartis|17/4/2023 |40 | 40|
#	  | Anti-allergic| Pfizer  |25/5/2024 |100|50 |
#	  | Antipyretic  | Roche   |07/07/2023|180|70 |
#	  | Antifungal   | AbbVie  |28/07/2025|60 |150|
#	And The patient is failed entered
#	Then the patient don't get medicine succeeds and return null
#	