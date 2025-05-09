@timesheets
Feature: This feature is to get pending Timesheet

  Scenario: This test is to verify the pending Timesheet
    Given the user is on the homepage
    And the user clicks on the time option from the menu
    And the user enters the name as "John Smith"
    And clicks on view button
    Then the user should see the message as "<message>"
    And add the timesheet
    And Create the timesheet
