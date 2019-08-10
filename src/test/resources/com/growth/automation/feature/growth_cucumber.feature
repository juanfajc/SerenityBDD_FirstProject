@LoginUser
Feature: The user can enter in the vacation management portal with the email and password

    Scenario Outline: The user can enter in the vacation management GAP portal
        Given the user can enter in the GAP portal
        When the user type the <user> and <password>
        Then the user can validate the logos and the banner

        Examples:
            |user                              |password    |
            |gap-automation-test@mailinator.com|12345678    |
            #|ingmosquera@gmail.com            |Colombia2019|