#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Handle Social Media
  
  @tag1
  Scenario: Facebook
  
    Given user is on the CyberTech homepage
    When user scroll down the footer links
    Then user clicks on Facebook link button 
    And user able to navigate the Facebook
    
  Scenario: Twitter
  
    Given user is on the CyberTech homepage
    When user scroll down the footer links
    Then user clicks on Twitter link button 
    And user able to navigate the Twitter
    
  Scenario: LinkedIn
  
    Given user is on the CyberTech homepage
    When user scroll down the footer links
    Then user clicks on LinkedIn link button 
    And user able to navigate the LinkedIn
    
  Scenario: YouTube
  
    Given user is on the CyberTech homepage
    When user scroll down the footer links
    Then user clicks on YouTube link button 
    And user able to navigate the YouTube  