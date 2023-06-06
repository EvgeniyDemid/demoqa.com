package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.demoqa.pages.components.SubmittingTextBoxForm;
import com.demoqa.testData.TextBox;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

	SubmittingTextBoxForm submittingTextBoxForm = new SubmittingTextBoxForm();

	SelenideElement
			userNameInput = $("#userName"),
			userEmailInput = $("#userEmail"),
			currentAddressInput = $("#currentAddress"),
			permanentAddressInput = $("#permanentAddress"),
			submitButton = $("#submit");

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

	public void checkSubmittingTextBoxForm(TextBox data) {
		submittingTextBoxForm.checkOutPutForm(data);
	}

	public TextBoxPage openPage() {
		Selenide.open("/text-box");
		WebDriverRunner.driver().getWebDriver().manage().window().maximize();
		executeJavaScript("$('#fixedban').remove()");
		executeJavaScript("$('footer').remove()");
		return this;
	}
}
