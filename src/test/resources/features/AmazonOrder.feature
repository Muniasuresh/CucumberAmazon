Feature: Feature containing Amazon Login page functionalities

Scenario Outline: Login into Amazon 
Given user launches chrome
When user enters Search as "<SearchTxt>"
Then login should be successful

Examples:
| SearchTxt |
| mobiles |
| Laptop |

Scenario:
Given user lanches chrome and navigates to url 
When user enters Search as "mobile"
Then login should be successful
