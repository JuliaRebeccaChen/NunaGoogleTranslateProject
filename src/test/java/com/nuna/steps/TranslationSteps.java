package com.nuna.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.nuna.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TranslationSteps extends CommonMethods {

	@Given("user navigates to Google Tranlate main page")
	public void user_navigates_to_google_tranlate_main_page() {

		boolean logoIsDisplayed = mainPage.googleTranslateImg.isDisplayed();

		if (logoIsDisplayed) {
			System.out.println("Google Translate logo is displayed.");
		} else {
			System.out.println("Google Translate logo is NOT displayed.");
		}
	}

	@When("user selects {string} from the drop-down menu on the left")
	public void user_selects_from_the_drop_down_menu_on_the_left(String sourceLanguage) {
		List<WebElement> sourceLanguages = driver.findElements(By.cssSelector("span.zQ0atf"));
		WebElement sourceLanguageDropdown = sourceLanguages.get(0);

		selectDropdown(sourceLanguageDropdown, sourceLanguage);

	}

	@When("user selects {string} from the drop-down menu on the right")
	public void user_selects_from_the_drop_down_menu_on_the_right(String resultLanguage) {
		List<WebElement> resultLanguages = driver
				.findElements(By.xpath("//button[@aria-label='More target languages']"));
		WebElement resultLanguageDropdown = resultLanguages.get(0);

		selectDropdown(resultLanguageDropdown, resultLanguage);
	}

	@When("user enters the {string} in the input field on the left")
	public void user_enters_the_in_the_input_field_on_the_left(String sourceText) {

		sendText(mainPage.sourceTextArea, sourceText);
	}

	@Then("I validate the {string} in the right field is correct")
	public void i_validate_the_in_the_right_field_is_correct(String resultText) {

		waitForVisibility(mainPage.resultText);

		String expectedResult = resultText;
		String actualResult = mainPage.resultText.getText();

		compareText(expectedResult, actualResult);
	}

	@When("user clicks swap languages button")
	public void user_clicks_swap_languages_button() {

		List<WebElement> list = driver.findElements(By.cssSelector("div.VfPpkd-Bz112c-RLmnJb"));
		WebElement swapBtn = list.get(1);

		click(swapBtn);
	}

	@Then("I verify the text in the source textarea equals the initial {string}")
	public void i_verify_the_text_in_the_source_textarea_equals_the_initial(String resultText) {

		try {
			waitForVisibility(mainPage.sourceText);
		} catch (StaleElementReferenceException e) {
			e.toString();
			System.out.println("Trying to recover from a stale element :" + e.getMessage());
		}

		String expected = resultText;
		String actual = mainPage.sourceText.getText();

		compareText(expected, actual);
	}

	@Then("I verify the text in the result textarea equals the initial {string}")
	public void i_verify_the_text_in_the_result_textarea_equals_the_initial(String sourceText) {

		try {
			waitForVisibility(mainPage.resultText);
		} catch (StaleElementReferenceException e) {
			e.toString();
			System.out.println("Trying to recover from a stale element :" + e.getMessage());
		}

		String expected = sourceText;
		String actual = mainPage.resultText.getText();

		compareText(expected, actual);
	}

	@When("user clears the input field")
	public void user_clears_the_input_field() {

		click(mainPage.clearSourceTextBtn);
	}

	@When("user clicks Select Input Tool button and selects Screen Keyboard")
	public void user_clicks_select_input_tool_button_and_selects_screen_keyboard() {

		click(mainPage.selectInputToolDropdown);

		List<WebElement> selectInputToolDDList = driver
				.findElements(By.xpath("//span[@class='ita-kd-checkbox ita-kd-menuitem-span']"));
		WebElement keyboard = selectInputToolDDList.get(0);
		click(keyboard);

	}

	@When("user enters {string}")
	public void user_enters(String keyboardInput) {

		click(mainPage.sourceTextArea);

		List<WebElement> keyboard = driver.findElements(By.cssSelector("button.vk-btn"));

		for (int i = 0; i < keyboardInput.length(); i++) {
			for (WebElement k : keyboard) {
				if (k.getText().equalsIgnoreCase(Character.toString(keyboardInput.charAt(i)))) {
					click(k);
				}
			}
		}

		wait(2);
	}

	@Then("I verify the translated result text")
	public void i_verify_the_translated_result_text() {

		System.out.println("Result text: " + mainPage.resultText.getText());
	}

}
