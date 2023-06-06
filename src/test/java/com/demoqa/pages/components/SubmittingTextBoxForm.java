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

	public void checkOutPutForm(TextBox data){
		nameOutput.shouldHave(Condition.text(data.getFullName()));
		emailOutput.shouldHave(Condition.text(data.getEmail()));
		currentAddressOutput.shouldHave(Condition.text(data.getCurrentAddress()));
		permanentAddressOutput.shouldHave(Condition.text(data.getPermanentAddress()));
	}

}
