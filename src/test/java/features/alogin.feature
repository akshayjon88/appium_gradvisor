Feature: login test

 Scenario: enter user details
 Given user redirect to login page
  When user enter emailID
  And user enter has password
  Then user click on login button
  