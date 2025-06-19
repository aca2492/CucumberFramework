Feature: Practice Form

  @Form @Smoke
  Scenario: Form Submission

    Given the user is on the form submission page

    When the user enters first name, surname and date

    And the user clicks on radio buttons and checkbox

    And the user selects dropdown option and uploads file

    And the user clicks the submit button

    Then the form should be submitted

#  @Form @Smoke
#  Scenario Outline: Failed Form Submission
#
#    Given the user is on the form submission page
#
#    When the user enters first name, surname and date
#
#    And the user clicks on radio buttons and checkbox
#
#    And the user selects dropdown option and uploads file
#
#    And the user clicks the submit button
#
#    Then the form should be submitted