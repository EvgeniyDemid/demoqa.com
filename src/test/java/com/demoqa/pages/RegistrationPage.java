package com.demoqa.pages;

import com.codeborne.selenide.*;
import com.demoqa.pages.components.CalendarForm;
import com.demoqa.pages.components.SubmittingStudentForm;
import com.demoqa.testData.Student;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
	CalendarForm calendarForm = new CalendarForm();
	SubmittingStudentForm submittingStudentForm = new SubmittingStudentForm();
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
			titelRegForm = $(byText("Student Registration Form"));

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
		calendarForm.setDate(student);
		return this;
	}

	public RegistrationPage clickSubmit() {
		submit.click();
		return this;
	}

	public void checkSubmittingStudentForm(Student student) {
		submittingStudentForm.checkSubmittingFormValue(student);
	}
}

