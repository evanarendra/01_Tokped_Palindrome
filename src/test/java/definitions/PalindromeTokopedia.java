package definitions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PalindromeTokopedia {
		String testPalindrome;
		boolean isPalindrome;
		
		@Given("Input string {string}")
		public void saya_input_string(String string) {
			testPalindrome = string;
		}

		@When("Test Palindrome")
		public void saya_test_apakah_palindrome() {
			String hasilBalik = new StringBuilder(testPalindrome).reverse().toString();
			isPalindrome = testPalindrome.equalsIgnoreCase(hasilBalik);
		}

		@Then("hasil {string}")
		public void hasilnya_harus(String string) {
			boolean expectResult = Boolean.parseBoolean(string);
			
			if (expectResult) {
				assertTrue(isPalindrome);
			} else {
				assertFalse(isPalindrome);
			}
		}

}

