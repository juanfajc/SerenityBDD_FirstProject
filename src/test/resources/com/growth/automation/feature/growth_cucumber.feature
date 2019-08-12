@LoginUser
Feature: The user can enter in the vacation management portal with the email and password in order to management the creation and validation for a user

    Scenario Outline: The user can enter in the vacation management GAP portal
        Given the user can enter in the GAP portal
        When the user type the email <email> and <password> password
        Then the user can validate the logos and the banner

        Examples:
            |email                             |password|
            |gap-automation-test@mailinator.com|12345678|


@Create_User
#Feature: The user can enter in the portal and create a new user in the list with some specific conditions

    Scenario Outline: The user enter in the GAP portal and the user can create a new member with a specific information
        Given the user can enter in the GAP portal with the <email> email and <password> password
        When the user create a new profile in the portal
        Then the user could check the new profile was created

        Examples:
            |email                             |password|
            |gap-automation-test@mailinator.com|12345678|


@Remove_User
#Feature: The user enter in the portal and validate the user create, after that the user can remove the profile created

    Scenario Outline: The user enter in the GAP portal and check the profile that was created, so the user can remove the profile and check that it was removed
        Given the user enter in the GAP portal with the <email> email and <password> password
        When the user check the profile created in the table and get the row
        Then the user can delete the profile
        Then the user check the profile does not appear in the table

        Examples:
            |email                             |password|
            |gap-automation-test@mailinator.com|12345678|