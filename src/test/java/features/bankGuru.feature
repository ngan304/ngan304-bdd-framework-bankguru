#Author: your.email@your.domain.com
Feature: 01_Register
  @tag_01_register
  Scenario: Register
    Given Open register page
    When Input Email textbox
    And  Click Submit button
    And Get User and Password infor 
    And Close Page
    
     @new_customer
  Scenario Outline: New Customer,New account can be created and deposit function work fine
  Given Go to Login page
  When Submit valid info on login form
  And Open New Customer Page
  And Input Name textbox with "<Name>"
  And Select female for Genger
  And Input DoB textbox with "<DateOfBirth>"
  And Input Address textbox with "<Address>"
  And Input City textbox with "<City>"
  And Input State textbox with "<State>"
  And Input Pin textbox with "<Pin>"
  And Input Mobile textbox with "<Mobile>"
  And Input to Email textbox
  And Input Password textbox with "<Password>"
  And Click Submit button to create new Customer
  Then Verify showing sucessfull message
  When Get CustomerID
  And Click on New Account link
  And Input CustomerID
  And Input Initial deposit
  And Click Submit to create New accout
  Then Verify create account successfull
  When Open Deposit Page
  And Input Account No text box
  And Input Amount textbox
   And Input Description textbox
   And Click on Submit button to deposit
   Then Verify depoist successfully
   When Close page
    
Examples: New Customer infor
|Name |DateOfBirth | Address   |City          | State   | Pin  |Mobile    | Password   |
|Home |2022-07-13  |Linh Trung |Ho Chi Min    |Thao Dien|123456|0342335612|Password#123|


