Feature: Test Registration
  Scenario: Check Registration is Successful
    Given Open browser
    And Open website
    And Located on Registration page
    When User Enter First Name "Fachrurazy"
    When User Enter Last Name "Atijani"
    When User Enter Student ID "1212121212121212"
    When User Enter Student Email "fachrurazy@gmail.com"
    When User Enter Gender
    When User Enter List of Classes
    When User Enter Date
    When User Choice Multiple
    When User Choice Single
    When User Enter File Upload
    Then Notification Successful