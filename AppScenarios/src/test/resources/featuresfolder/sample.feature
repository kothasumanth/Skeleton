Feature: sample feature

  @loggerExample
  Scenario: adding two numbers
  Given i have provided two numbers
  When i add them
  Then sum should be equal to math

  @reporterExample
  Scenario: adding two number reporter
  Given i have provided two numbers
    When i add them
    Then sum should be equal to math