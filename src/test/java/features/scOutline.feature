Feature: Search product on online shoppoing site 

Background: Open the browser 
	Given Open the webpage 
	Then Go to "https://www.google.com/" 
@search 
Scenario Outline: Search different product on amazon and flipkart 
	Given Navigate to <website> 
	Then Search shoe <shoe> 
	Then Search mobile <mobile> 
	Then Close the browser instances
	
	Examples: 
		|website|shoe | mobile|
		|"https://www.amazon.in/"|"Black shoe for men"   |"Samsung m31"|
		|"https://www.flipkart.com/"|"Blue shoe for women"   |"iphone 13"|
		
@search
Scenario Outline: Search movies on different site 
	Given Search the movie <movie> 
	Then Verify ratting <rating> 
	Then Close the browser instances 
			
	Examples: 
		|movie|rating|
		|"Avatar: The Way of Water"|7.9|
		|"Avengers: Endgame"|8.4|
		|"Qala"|7.5|
