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
Feature: Notification
  As a user want to test Notification feature

  @positive
  Scenario: REG-001 user want to login with valid credential
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user insert email
  	Then user insert password
  	Then user click masuk
  	Then user click notification 
  	
  	  @positive
  Scenario: REG-001 user want to login with valid credential
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user insert email
  	Then user insert password
  	Then user click masuk
  	Then user want to verify date and clock
  	
  		  @positive
  Scenario: REG-001 user want to login with valid credential
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user insert email
  	Then user insert password
  	Then user click masuk
  	Then user want to verify price
  	
  		  @positive
  Scenario: REG-001 user want to login with valid credential
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user insert email
  	Then user insert password
  	Then user click masuk
  	Then user want to verify text berhasil di terbitkan
  	
  		  @positive
  Scenario: REG-001 user want to login with valid credential
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user insert email
  	Then user insert password
  	Then user click masuk
  	Then user want to verify date and clock
  	
  	
  	
