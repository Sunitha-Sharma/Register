Feature: Login to Conference Registration

Scenario: User registering Personal Details

Given user want to access conference registration page
And user enters First Name
And user enters Last Name
And user enters EmailId
And user enters mobile number
And user enters count of people attending
And user enters his Building Name and Room No
And user enters Area Name
And user enters city
And user enters state
And user selects Conference full-Access(member)
And user then clicks next
And alert message for validating personal details will be displayed
And user enters his/her Card Holder Name
And user enters his/her Debit Card Number
And user enters his/her CVV
And user enters his/her Expiration Month
And user enters his/her Expiration Year
And user then clicks register on make payment button
Then alert message for the successfully booking conference room will be displayed