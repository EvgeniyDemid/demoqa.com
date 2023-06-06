package com.demoqa.tests;

import com.demoqa.testData.TextBox;
import com.demoqa.testData.TextBoxData;
import org.junit.jupiter.api.Test;

public class TestBoxPageTest extends TestBase {

	TextBox textBoxData = TextBoxData.textBoxes[0];

	@Test
	public void checkTextBoxPage(){
		textBoxPage.
				openPage().
				setFirstNameInput(textBoxData.getFullName()).
				setUserEmailInput(textBoxData.getEmail()).
				setCurrentAddressInput(textBoxData.getCurrentAddress()).
				setPermanentAddressInput(textBoxData.getPermanentAddress()).
				clickSubmitButton().
				checkOutPutForm(textBoxData);
	}
}
