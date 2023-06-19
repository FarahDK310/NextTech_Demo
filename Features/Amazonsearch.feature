Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given User visits Amazon homepage
When user types "<productname>" and click search icon
Then user should be able to see the expected products


Examples:
|productname| 
| iphone 14 promax |
