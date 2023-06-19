package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsModalForm {

	SelenideElement
			submittingForm = $(".table-responsive"),
			title = $("#example-modal-sizes-title-lg");

	public ResultsModalForm checkTitle() {
		title.shouldBe(visible);
		return this;
	}

	public ResultsModalForm checkLabel() {
		submittingForm.$(byText("Label")).sibling(0).shouldHave(text("Values"));
		return this;
	}

	public ResultsModalForm checkName(String firstName, String lastName) {
		submittingForm.$(byText("Student Name")).
				sibling(0).shouldHave(text(firstName + " " + lastName));
		return this;

	}

	public ResultsModalForm checkEmail(String email) {
		submittingForm.$(byText("Student Email")).sibling(0).shouldHave(text((email)));
		return this;
	}

	public ResultsModalForm checkGender(String gender) {
		submittingForm.$(byText("Gender")).sibling(0).shouldHave(text(gender));
		return this;
	}

	public ResultsModalForm checkMobile(String mobile) {
		submittingForm.$(byText("Mobile")).sibling(0).shouldHave(text(mobile));
		return this;

	}

	public ResultsModalForm checkBirth(String day, String month, String year) {
		submittingForm.$(byText("Date of Birth")).
				sibling(0).
				shouldHave(text(day + " " + month + "," + year));
		return this;
	}

	public ResultsModalForm checkSubjects(String subjects) {
		submittingForm.$(byText("Subjects")).sibling(0).shouldHave(text(subjects));
		return this;
	}

	public ResultsModalForm checkHobbies(String hobbies) {
		submittingForm.$(byText("Hobbies")).sibling(0).shouldHave(text(hobbies));
		return this;
	}

	public ResultsModalForm checkPicture(String picture) {
		submittingForm.$(byText("Picture")).sibling(0).shouldHave(text(picture));
		return this;
	}

	public ResultsModalForm checkAddress(String address) {
		submittingForm.$(byText("Address")).sibling(0).shouldHave(text(address));
		return this;
	}

	public ResultsModalForm checkStateCity(String state, String city) {
		submittingForm.$(byText("State and City")).
				sibling(0).shouldHave(text(state + " " + city));
		return this;
	}
}
