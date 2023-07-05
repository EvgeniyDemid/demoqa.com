package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarForm;
import com.demoqa.tests.TestBase;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
	CalendarForm calendarForm = new CalendarForm();
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
			cityInput = $("#city"),
			submitButton = $("#submit"),
			titleRegForm = $(byText("Student Registration Form"));

	@Step("Открываем страницу")
	public RegistrationPage openPage() {
		Selenide.open("/automation-practice-form");
		titleRegForm.shouldBe(visible);
		testBase.removingFooterBanners();
		return this;
	}

	@Step("Заполняем поле firstName значением {firstName}")
	public RegistrationPage setFirstName(String firstName) {
		firstNameInput.setValue(firstName);
		return this;
	}

	@Step("Заполняем поле lastName значением {lastName}")
	public RegistrationPage setLastName(String lastName) {
		lastNameInput.setValue(lastName);
		return this;
	}

	@Step("Заполняем поле email значением {email}")
	public RegistrationPage setEmail(String email) {
		userEmailInput.setValue(email);
		return this;
	}

	@Step("Устанавливаем пол {gender}")
	public RegistrationPage setGender(String gender) {
		genderCheckBox.
				$(withText(gender.substring(0, 1).toUpperCase() + gender.substring(1))).
				click();
		return this;
	}

	@Step("Заполняем поле mobile значением {mobile}")
	public RegistrationPage setMobile(String mobile) {
		mobileInput.setValue(mobile);
		return this;
	}

	@Step("Заполняем поле subjects значением {subjects}")
	public RegistrationPage setSubjects(String subjects) {
		subjectsInput.setValue(subjects).pressEnter();
		return this;
	}

	@Step("Заполняем поле hobby значением {hobby}")
	public RegistrationPage setHobbies(String hobby) {
		hobbies.$(byText(hobby)).click();
		return this;
	}

	@Step("Загружаем фото")
	public RegistrationPage setPicture(String pictureName, String pathPicture) {
		picture.uploadFile(new File(pathPicture + pictureName));
		return this;
	}

	@Step("Устанавливаем CurrentAddress в значение {address}")
	public RegistrationPage setCurrentAddress(String address) {
		currentAddress.setValue(address);
		return this;
	}

	@Step("Устанавливаем state в значение {state}")
	public RegistrationPage setStateInput(String state) {
		stateInput.click();
		stateInput.$(byText(state)).click();
		return this;
	}

	@Step("Устанавливаем city в значение {city}")
	public RegistrationPage setCityInput(String city) {
		if (city != null) {
			cityInput.click();
			cityInput.$(byText(city)).click();
		}
		return this;
	}

	@Step("Указываем дату рождения {day} {month} {year}")
	public RegistrationPage setBirthDay(String day, String month, String year) {
		dateOfBirth.click();
		calendarForm.setDate(day, month, year);
		return this;
	}

	@Step("Нажать на кнопку Submit")
	public RegistrationPage clickSubmitButton() {
		submitButton.click();
		return this;
	}
}

