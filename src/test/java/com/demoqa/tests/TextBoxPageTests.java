package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import com.demoqa.testData.TextBox;
import com.demoqa.testData.TextBoxData;
import org.junit.jupiter.api.Test;

public class TextBoxPageTests extends TestBase {

	TextBox textBoxData = TextBoxData.textBoxes[0];
	TextBoxPage textBoxPage = new TextBoxPage();

	@Test
	public void checkTextBoxPage(){
		textBoxPage.
				openPage().
				setFirstName(textBoxData.getFullName()).
				setUserEmail(textBoxData.getEmail()).
				setCurrentAddress(textBoxData.getCurrentAddress()).
				setPermanentAddress(textBoxData.getPermanentAddress()).
				clickSubmitButton().
				checkResultTextBoxForm(textBoxData);
	}
}
