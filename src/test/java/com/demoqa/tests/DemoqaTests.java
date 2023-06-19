package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.ResultsModalForm;
import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Locale;

public class DemoqaTests extends TestBase {
	RegistrationPage registrationPage = new RegistrationPage();
	ResultsModalForm resultsModalForm = new ResultsModalForm();
	RandomUtils randomUtils = new RandomUtils();
	Faker faker = new Faker(new Locale("en"));
	LocalDate current_date = LocalDate.now();
	int current_Year = current_date.getYear();

	@Test
	public void checkMainPage() {

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = faker.internet().emailAddress();
		String gender = faker.dog().gender();
		String mobile = faker.phoneNumber().subscriberNumber(10);
		String day = String.valueOf(1 + (int) (Math.random() * 27));
		String month = randomUtils.getmonth();
		String year = String.valueOf(current_Year - faker.date().birthday().getYear());
		String subject = randomUtils.getSubject();
		String hobby = randomUtils.getHobby();
		String picture = "Screenshot.png";
		String pathPicture = "src/test/resources/";
		String currentAddress = faker.address().fullAddress();
		String state = randomUtils.getState();
		String city = randomUtils.getCity(state);


		registrationPage.openPage()
				.setFirstName(firstName)
				.setLastName(lastName)
				.setEmail(email)
				.setGender(gender)
				.setMobile(mobile)
				.setBirthDay(day, month, year)
				.setSubjects(subject)
				.setHobbies(hobby)
				.setPicture(picture, pathPicture)
				.setCurrentAddress(currentAddress)
				.setStateInput(state)
				.setСityInput(city)
				.clickSubmitButton();

		resultsModalForm.checkTitle()
				.checkLabel()
				.checkName(firstName, lastName)
				.checkEmail(email)
				.checkGender(gender)
				.checkMobile(mobile)
				.checkBirth(day, month, year)
				.checkSubjects(subject)
				.checkHobbies(hobby)
				.checkPicture(picture)
				.checkAddress(currentAddress)
				.checkStateCity(state, city);
	}
}
