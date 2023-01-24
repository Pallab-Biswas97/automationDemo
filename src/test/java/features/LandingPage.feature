Feature: Verify different elements 

Background: open landing page 
	Given Initialize the webdriver 
	When navigate to "https://demoqa.com/" site 
@smoke1 
Scenario: Verify landing page 
	Given Open the toolsQA home page 
	And Verify the home page 
	Then Close the browser 
@smoke 
Scenario: Verify text box element 
	Given Navigate to text box 
	Then Enter details on the text box "Pallab Biswas" "abc@email.com" "Pune" "Kolkata" 
	Then Click submit 
	Then Verify entered details on the text box 
	Then Close the browser 
@smoke @Regression @activeTest
Scenario: Verify Check Box element 
	Given Navigate to check box 
	Then Select downloads from check box
	And Verify check box selection 
	Then Close the browser
@Regression 
Scenario: Radio button element 
	Given Navigate to radio button "https://demoqa.com/radio-button" 
	Then Select impressive radio button 
	And Verify radio button selection "Impressive" 
	Then Close the browser 
@Regression 
Scenario: Verify the selection section 
	Given Navigate to selection menu "https://demoqa.com/select-menu" 
	Then Select item from dropdown 
	Then verify selection 
	Then Close the browser 
@Regression 
Scenario: Verify button click 
	Given Navigate to button "https://demoqa.com/buttons" 
	Then Perform click, double click and right click 
	And Verify the button clicks 
	Then Close the browser 
@smoke @test
Scenario: Verify browser windows 
	Given Navigate to browser windows 
	Then Access and verify new tab 
	Then Access and verify new window 
	And Access and verify new window message 
	Then Close the browser 
@smoke 
Scenario: Verify the menu widgets 
	Given Navigate to menu section 
	Then Access sub menu elements 
	Then Close the browser 
	
	
