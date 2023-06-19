package com.demoqa.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SubmittingTextBoxForm {
	SelenideElement
			nameOutput = $(" #output #name"),
			emailOutput = $(" #output #email"),
			currentAddressOutput = $(" #output #currentAddress"),
			permanentAddressOutput = $(" #output #permanentAddress");


	public SubmittingTextBoxForm checkFullName(String fullName) {
		nameOutput.shouldHave(Condition.text(fullName));
		return this;
	}

	public SubmittingTextBoxForm checkEmail(String email) {
		emailOutput.shouldHave(Condition.text(email));
		return this;
	}

	public SubmittingTextBoxForm checkCurrentAddress(String currentAddress) {
		currentAddressOutput.shouldHave(Condition.text(currentAddress));
		return this;
	}

	public SubmittingTextBoxForm checkPermanentAddress(String permanentAddress) {
		permanentAddressOutput.shouldHave(Condition.text(permanentAddress));
		return this;
	}
}
