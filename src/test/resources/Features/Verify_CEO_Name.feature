@GetCEOName
Feature: This feature is to get the CEO name from the ORANGEHRM App
Scenario Outline: The test is to verify  the CEO name
Given the user is logged in successfully and is on home page
When the user clicks on the directory option from the menu bar
And the user select the job title as "Chief Executive Officer" from the drop down
And clicks the search button
Then the user should see the CEO name as "John Smith"
