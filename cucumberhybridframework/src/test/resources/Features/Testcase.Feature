@orangeHRM
Feature: orangeHrm Website
@tc_01_Login
Scenario Outline:validate the login functionality
Given launch the browser and enter the url
When login page is opened
Then enter the "<username>" and "<password>"
And click the login button

Examples:
|username    |password  |
|Admin    | admin123  |
|admin  | Admin1234  |





@tc_02_Admin
Scenario: Click on Admin Search
Given launch the browser and enter the url
When login page is opened
Then enter the username and password
And click the login button
Then click Admin page
Then enter the Username 
Then enter the UserRole
Then enter the EmployeeName
Then enter the Status
And click the select button




@tc_03_Recruitment
Scenario: Click on Recruitment page
Given Launch OrangeHRM Recruitment and Login
When login page is opened
Then enter the username and password
Then click the login button
Then select Recruitment page
Then enter the JobTitle
Then enter the candidateName
Then enter the Keywords
And click the select button





