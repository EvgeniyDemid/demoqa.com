package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.demoqa.testData.TextBox;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

	SelenideElement
			userNameInput = $("#userName"),
			userEmailInput = $("#userEmail"),
			currentAddressInput = $("#currentAddress"),
			permanentAddressInput = $("#permanentAddress"),
			submitButton = $("#submit"),
			nameOutput = $(" #output #name"),
			emailOutput = $(" #output #email"),
			currentAddressOutput = $(" #output #currentAddress"),
			permanentAddressOutput = $(" #output #permanentAddress");

	public TextBoxPage setFirstNameInput(String firstName) {
		userNameInput.setValue(firstName);
		return this;
	}

	public TextBoxPage setUserEmailInput(String email) {
		userEmailInput.setValue(email);
		return this;
	}

	public TextBoxPage setCurrentAddressInput(String currentAddress) {
		currentAddressInput.setValue(currentAddress);
		return this;
	}

	public TextBoxPage setPermanentAddressInput(String permanentAddress) {
		permanentAddressInput.setValue(permanentAddress);
		return this;
	}

	public TextBoxPage clickSubmitButton() {
		submitButton.click();
		return this;
	}

	public void checkOutPutForm(TextBox data){
		nameOutput.shouldHave(Condition.text(data.getFullName()));
		emailOutput.shouldHave(Condition.text(data.getEmail()));
		currentAddressOutput.shouldHave(Condition.text(data.getCurrentAddress()));
		permanentAddressOutput.shouldHave(Condition.text(data.getPermanentAddress()));
	}

	public TextBoxPage openPage() {
		Selenide.open("/text-box");
		WebDriverRunner.driver().getWebDriver().manage().window().maximize();
		executeJavaScript("$('#fixedban').remove()");
		executeJavaScript("$('footer').remove()");
		return this;
	}
}
