Feature: Change background color

Background:
Given Set SkyBlue Background and then Set White Background 

Scenario:  User should be able to change color to sky blue
When I click on the Set Background blue button
Then the background color will change to sky blue



Scenario: User should be able to change color to white
When I click on the Set White Background button
Then the background color will change to white