package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
	TestBase testBase = new TestBase();

	SelenideElement
			userNameInput = $("#userName"),
			userEmailInput = $("#userEmail"),
			currentAddressInput = $("#currentAddress"),
			permanentAddressInput = $("#permanentAddress"),
			submitButton = $("#submit");

	public TextBoxPage setFirstName(String firstName) {
		userNameInput.setValue(firstName);
		return this;
	}

	public TextBoxPage setUserEmail(String email) {
		userEmailInput.setValue(email);
		return this;
	}

	public TextBoxPage setCurrentAddress(String currentAddress) {
		currentAddressInput.setValue(currentAddress);
		return this;
	}

	public TextBoxPage setPermanentAddress(String permanentAddress) {
		permanentAddressInput.setValue(permanentAddress);
		return this;
	}

	public TextBoxPage clickSubmitButton() {
		submitButton.click();
		return this;
	}


	public TextBoxPage openPage() {
		Selenide.open("/text-box");
		testBase.removingFooterBanners();
		return this;
	}
}
