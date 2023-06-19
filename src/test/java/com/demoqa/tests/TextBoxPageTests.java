package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import com.demoqa.pages.components.SubmittingTextBoxForm;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class TextBoxPageTests extends TestBase {

	TextBoxPage textBoxPage = new TextBoxPage();
	SubmittingTextBoxForm submittingTextBoxForm = new SubmittingTextBoxForm();
	Faker faker = new Faker(new Locale("en"));

	@Test
	public void checkTextBoxPage() {
		String fullName = faker.name().fullName();
		String email = faker.internet().emailAddress();
		String currentAddress = faker.address().fullAddress();
		String permanentAddress = faker.address().fullAddress();

		textBoxPage.
				openPage().
				setFirstName(fullName).
				setUserEmail(email).
				setCurrentAddress(currentAddress).
				setPermanentAddress(permanentAddress).
				clickSubmitButton();

		submittingTextBoxForm.checkFullName(fullName).
				checkEmail(email).
				checkCurrentAddress(currentAddress).
				checkPermanentAddress(permanentAddress);


	}
}
