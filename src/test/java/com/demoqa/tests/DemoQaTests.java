package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.ResultsModalForm;
import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Locale;
@Tag("property")
@Tag("remote")
public class DemoQaTests extends RemoteTestBase {
	RegistrationPage registrationPage = new RegistrationPage();
	ResultsModalForm resultsModalForm = new ResultsModalForm();
	RandomUtils randomUtils = new RandomUtils();
	Faker faker = new Faker(new Locale("en"));
	LocalDate current_date = LocalDate.now();
	int current_Year = current_date.getYear();

	@Test
	@DisplayName("Успешная регистрация студента")
	public void checkMainPage() {

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = faker.internet().emailAddress();
		String gender = faker.dog().gender();
		String mobile = faker.phoneNumber().subscriberNumber(10);
		String day = String.format("%02d", faker.number().numberBetween(1, 28));
		String month = faker.options().option(
				"January","February","March","April","May","June","July",
				"August","September","October","November","December"
		);
		String year = String.valueOf(current_Year - faker.date().birthday().getYear());
		String subject = faker.options().option("Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
				"Computer Science", "Commerce", "Accounting", "Economics", "Arts",
				"Social Studies", "History", "Civics"
		);
		String hobby = faker.options().option("Sports", "Reading", "Music");
		String picture = "Screenshot.png";
		String pathPicture = "src/test/resources/";
		String currentAddress = faker.address().fullAddress();
		String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
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
				.setCityInput(city)
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
