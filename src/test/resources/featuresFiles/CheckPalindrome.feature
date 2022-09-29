Feature: Check string palindrome

	Scenario Outline: Periksa string palindrome
		Given Input string <input>
		When Test Palindrome
		Then hasil <output>
		Examples:
			| input		| output	|
			| "minum"	| "false" |
			| "radar"	| "true" 	|
			| "katak"	| "true"  |
			| "klambi"	| "false" |
			
			
			
			