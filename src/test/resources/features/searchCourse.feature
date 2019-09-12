Feature: Search Course

  Scenario: Search course from courses page
    When the user goes to courses page
    And the user search the course
    Then a success message is shown
    And the courses finded are shown in courses page

  Scenario: View course information from courses page
    When the user search the course
    And the user select a course from search result
    Then the course description is displayed