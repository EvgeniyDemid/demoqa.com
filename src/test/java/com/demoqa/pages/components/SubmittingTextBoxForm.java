package com.demoqa.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.testData.TextBox;

import static com.codeborne.selenide.Selenide.$;

public class SubmittingTextBoxForm {
	SelenideElement
			nameOutput = $(" #output #name"),
			emailOutput = $(" #output #email"),
			currentAddressOutput = $(" #output #currentAddress"),
			permanentAddressOutput = $(" #output #permanentAddress");


	public void checkFullName(String fullName) {
		nameOutput.shouldHave(Condition.text(fullName));
	}

	public void checkEmail(String email) {
		emailOutput.shouldHave(Condition.text(email));
	}

	public void checkCurrentAddress(String currentAddress) {
		currentAddressOutput.shouldHave(Condition.text(currentAddress));
	}

	public void checkPermanentAddress(String permanentAddress) {
		permanentAddressOutput.shouldHave(Condition.text(permanentAddress));
	}
}
