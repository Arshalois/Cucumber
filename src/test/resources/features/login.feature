
Feature: Login user

  Background: Need to open the url
   Given Open the url "https://www.bookdepository.com"

    Scenario: Login user
     // When Open the url "https://www.bookdepository.com"
    Then Click "Log in" btn
   Then Enter login
   Then Enter password
    Then Click "Sign In" btn




