package com.demoqa.pages;

import com.codeborne.selenide.*;
import com.demoqa.pages.components.CalendarForm;
import com.demoqa.pages.components.ResultsModalForm;
import com.demoqa.testData.Student;
import com.demoqa.tests.TestBase;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
	CalendarForm calendarForm = new CalendarForm();
	ResultsModalForm resultsModalForm = new ResultsModalForm();
	TestBase testBase = new TestBase();
	SelenideElement
			firstNameInput = $("#firstName"),
			lastNameInput = $("#lastName"),
			userEmailInput = $("#userEmail"),
			genderCheckBox = $("#genterWrapper"),
			mobileInput = $("#userNumber"),
			dateOfBirth = $("#dateOfBirthInput"),
			subjectsInput = $("#subjectsInput"),
			hobbies = $("#hobbiesWrapper"),
			picture = $("#uploadPicture"),
			currentAddress = $("#currentAddress"),
			stateInput = $("#state"),
			сityInput = $("#city"),
			submitButton = $("#submit"),
			titelRegForm = $(byText("Student Registration Form"));

	public RegistrationPage openPage() {
		Selenide.open("/automation-practice-form");
		titelRegForm.shouldBe(visible);
		testBase.removingFooterBanners();
		return this;
	}



	public RegistrationPage setFirstName(String firstName) {
		firstNameInput.setValue(firstName);
		return this;
	}

	public RegistrationPage setLastName(String lastName) {
		lastNameInput.setValue(lastName);
		return this;
	}

	public RegistrationPage setEmail(String email) {
		userEmailInput.setValue(email);
		return this;
	}

	public RegistrationPage setGender(String gender) {
		genderCheckBox.$(byText(gender)).click();
		return this;
	}

	public RegistrationPage setMobile(String mobile) {
		mobileInput.setValue(mobile);
		return this;
	}


	public RegistrationPage setSubjects(String subjects) {
		subjectsInput.setValue(subjects).pressEnter();
		return this;
	}

	public RegistrationPage setHobbies(String hobbie) {
		hobbies.$(byText(hobbie)).click();
		return this;
	}

	public RegistrationPage setPicture(String pictureName, String pathPicture) {
		picture.uploadFile(new File( pathPicture + pictureName ));
		return this;
	}

	public RegistrationPage setCurrentAddress(String address) {
		currentAddress.setValue(address);
		return this;
	}

	public RegistrationPage setStateInput(String state) {
		stateInput.click();
		stateInput.$(byText(state)).click();
		return this;
	}

	public RegistrationPage setСityInput(String city) {
		сityInput.click();
		сityInput.$(byText(city)).click();
		return this;
	}

	public RegistrationPage setBirthDay(String day, String month, String year) {
		dateOfBirth.click();
		calendarForm.setDate(day, month, year);
		return this;
	}

	public RegistrationPage clickSubmitButton() {
		submitButton.click();
		return this;
	}

	public void checkSubmittingStudentForm(Student student) {
		resultsModalForm.checkTitle();
		resultsModalForm.checkLabel();
		resultsModalForm.checkName(student.getFirstName(), student.getLastName());
		resultsModalForm.checkEmail(student.getEmail());
		resultsModalForm.checkGender(student.getGender());
		resultsModalForm.checkMobile(student.getUserMobile());
		resultsModalForm.checkBirth(student.getDayOfBirth(), student.getMonthOfBirth(), student.getYearOfBirth());
		resultsModalForm.checkSubjects(student.getSubjects());
		resultsModalForm.checkHobbies(student.getHobbies());
		resultsModalForm.checkPicture(student.getPicture());
		resultsModalForm.checkAddress(student.getCurrentAddress());
		resultsModalForm.checkStateCity(student.getState(), student.getCity());
	}
}

