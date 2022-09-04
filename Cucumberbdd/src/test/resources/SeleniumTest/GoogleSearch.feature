
Feature: Feature to test google search functionality
Scenario: Validate google search is working

Given Browser is open
And User is on google search page
When User enters keyword
And Click on Search button
Then Search result should be displayed
