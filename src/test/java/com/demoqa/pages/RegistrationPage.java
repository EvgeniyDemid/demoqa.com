package com.demoqa.pages;

import com.codeborne.selenide.*;
import com.demoqa.pages.components.Calendar;
import com.demoqa.testData.Student;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
	Calendar calendar = new Calendar();
	SelenideElement
			firstNameInput = $("#firstName"),
			lastNameInput = $("#lastName"),
			userEmailInput = $("#userEmail"),
			genterCheckBox = $("#genterWrapper"),
			userNumberInput = $("#userNumber"),
			birthInput = $("#dateOfBirthInput"),
			subjectsContainerInput = $("#subjectsInput"),
			hobbies = $("#hobbiesWrapper"),
			picture = $("#uploadPicture"),
			currentAddress = $("#currentAddress"),
			state = $("#state"),
			stateCity = $("#city"),
			submit = $("#submit"),
			submittingForm = $(".table-responsive"),
			titelRegForm = $(byText("Student Registration Form")),
			titelSubForm = $("#example-modal-sizes-title-lg");

	public RegistrationPage openPage() {
		Selenide.open("/automation-practice-form");
		WebDriverRunner.driver().getWebDriver().manage().window().maximize();
		titelRegForm.shouldBe(visible);
		executeJavaScript("$('#fixedban').remove()");
		executeJavaScript("$('footer').remove()");
		return this;
	}

	public RegistrationPage setFirstNameInput(Student student) {
		firstNameInput.setValue(student.getFirstName());
		return this;
	}

	public RegistrationPage setLastNameInput(Student student) {
		lastNameInput.setValue(student.getLastName());
		return this;
	}

	public RegistrationPage setUserEmailInput(Student student) {
		userEmailInput.setValue(student.getEmail());
		return this;
	}

	public RegistrationPage setGenterCheckBox(Student student) {
		genterCheckBox.$(byText(student.getGender())).click();
		return this;
	}

	public RegistrationPage setUserNumberInput(Student student) {
		userNumberInput.setValue(student.getUserMobile());
		return this;
	}


	public RegistrationPage setSubjectsContainerInput(Student student) {
		subjectsContainerInput.setValue(student.getSubjects()).pressEnter();
		return this;
	}

	public RegistrationPage setHobbies(Student student) {
		hobbies.$(byText(student.getHobbies())).click();
		return this;
	}

	public RegistrationPage setPicture(Student student) {
		picture.uploadFile(new File(student.getPathPicture() + student.getPicture()));
		return this;
	}

	public RegistrationPage setCurrentAddress(Student student) {
		currentAddress.setValue(student.getCurrentAddress());
		return this;
	}

	public RegistrationPage setState(Student student) {
		state.click();
		state.$(byText(student.getState())).click();
		return this;
	}

	public RegistrationPage setStateCity(Student student) {
		stateCity.click();
		stateCity.$(byText(student.getCity())).click();
		return this;
	}

	public RegistrationPage setBirthDay(Student student) {
		birthInput.click();
		calendar.setDate(student);
		return this;
	}

	public void clickSubmit() {
		submit.click();
	}

	public void checkSubmittingFormValue(Student student) {
		titelSubForm.shouldBe(visible);
		submittingForm.$(byText("Label")).sibling(0).shouldHave(text("Values"));
		submittingForm.$(byText("Student Name")).sibling(0).shouldHave(text(student.getFirstName() + " " + student.getLastName()));
		submittingForm.$(byText("Student Email")).sibling(0).shouldHave(text((student.getEmail())));
		submittingForm.$(byText("Gender")).sibling(0).shouldHave(text(student.getGender()));
		submittingForm.$(byText("Mobile")).sibling(0).shouldHave(text(student.getUserMobile()));
		submittingForm.$(byText("Date of Birth")).sibling(0).shouldHave(text(student.getDayOfBirth() + " " + student.getMonthOfBirth() + "," + student.getYearOfBirth()));
		submittingForm.$(byText("Subjects")).sibling(0).shouldHave(text(student.getSubjects()));
		submittingForm.$(byText("Hobbies")).sibling(0).shouldHave(text(student.getHobbies()));
		submittingForm.$(byText("Picture")).sibling(0).shouldHave(text(student.getPicture()));
		submittingForm.$(byText("Address")).sibling(0).shouldHave(text(student.getCurrentAddress()));
		submittingForm.$(byText("State and City")).sibling(0).shouldHave(text(student.getState() + " " + student.getCity()));
	}
}
