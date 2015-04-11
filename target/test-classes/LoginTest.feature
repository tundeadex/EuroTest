Feature: As a EuroTest train customer, i want to login
  so that can manage my account.

  @EuroTest1
  Scenario: Successful login
  Given I am on EuroTest website
  When  I login  with valid credentials
  Then  I am successfully logged in.

  @EuroTest2
  Scenario: Unsuccessful login with invalid credentials
  Given I am on EuroTest website
  When  I login with invalid credentials
  Then  I am not logged in.