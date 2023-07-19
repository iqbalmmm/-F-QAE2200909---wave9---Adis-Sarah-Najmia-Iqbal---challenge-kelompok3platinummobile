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
Feature: Register
  As a user want to test register feature

  @positive
  Scenario: REG-001 user want to register with valid email and password
  	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  	When user click account
  	When user click masuk
  	And user click daftar in register page
  	Then user insert name
  	And user insert email
  	And user insert password
  	And user insert phone number
  	And user insert city
  	And user insert address
  	Then user click daftar
  	
   #@positive
  #	Scenario: REG-002 user is not insert name 
  #	Given user start application and navigate to url "app-release-second-hand-gcp-apk"
  #	When user click account
  #	When user click masuk
  #	And user click daftar in register page
  #	Then user not insert name
  #	And user insert email
  #	And user insert password
  #	And user insert phone number
  #	And user insert city
  #	And user insert address
  #	Then user click daftar
  #	
     #@positive
  #	Scenario: REG-003 user is not insert email
  #	Given user start application and navigate to url "app-release-second-hand-gcp-apk	"
  #	When user click account
  #	When user click masuk
  #	And user click daftar in register page
  #	Then user insert name
  #	And user not insert email
  #	And user insert password
  #	And user insert phone number
  #	And user insert city
  #	And user insert address
  #	Then user click daftar
  	
  	