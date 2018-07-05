Feature: login functionality 
Scenario Outline: wheather user is able to login or not with correct credentials.
Given when user is in home page
When click on signin 
And enter "<uname>" and "<password>" 
Then verify login link
Then close the browser

Examples:
|uname | password |
|demo2 | 1234     |
|demo  | 1234     |

Scenario: wheather user is able to navigate or not 
Given where user is in homepage
When click on signin
And enter user name 
And enter password 
Then login
Then navigate to link 

 