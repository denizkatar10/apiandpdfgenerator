Feature: Database testing
  Background: st the connection with DB

    Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"






    Scenario Outline: test all customer info based on db
      Given user provides query as "<query>" and "<columnName>"
      And user saves DB Customer info to correspondent file
      Then user validates all customers db have

    Examples: all customer db date
      |query|columnName|
      |Select * from tp_customer|id|