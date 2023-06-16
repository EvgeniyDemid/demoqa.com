package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.testData.Student;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsModalForm {

	SelenideElement
			submittingForm = $(".table-responsive"),
			title = $("#example-modal-sizes-title-lg");

	public void checkTitle() {
		title.shouldBe(visible);
	}

	public void checkLabel() {
		submittingForm.$(byText("Label")).sibling(0).shouldHave(text("Values"));
	}

	public void checkName(String firstName, String lastName) {
		submittingForm.$(byText("Student Name")).
				sibling(0).shouldHave(text(firstName + " " + lastName));

	}

	public void checkEmail(String email) {
		submittingForm.$(byText("Student Email")).sibling(0).shouldHave(text((email)));

	}

	public void checkGender(String gender) {
		submittingForm.$(byText("Gender")).sibling(0).shouldHave(text(gender));
	}

	public void checkMobile(String mobile) {
		submittingForm.$(byText("Mobile")).sibling(0).shouldHave(text(mobile));

	}

	public void checkBirth(String day, String month, String year) {
		submittingForm.$(byText("Date of Birth")).
				sibling(0).
				shouldHave(text(day + " " + month + "," + year));

	}

	public void checkSubjects(String subjects) {
		submittingForm.$(byText("Subjects")).sibling(0).shouldHave(text(subjects));
	}

	public void checkHobbies(String hobbies) {
		submittingForm.$(byText("Hobbies")).sibling(0).shouldHave(text(hobbies));
	}

	public void checkPicture(String picture) {
		submittingForm.$(byText("Picture")).sibling(0).shouldHave(text(picture));
	}

	public void checkAddress(String address) {
		submittingForm.$(byText("Address")).sibling(0).shouldHave(text(address));
	}

	public void checkStateCity(String state, String city) {
		submittingForm.$(byText("State and City")).
				sibling(0).shouldHave(text(state + " " + city));
	}
}
