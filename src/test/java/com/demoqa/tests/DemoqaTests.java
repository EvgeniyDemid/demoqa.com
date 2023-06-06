package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.testData.Student;
import com.demoqa.testData.StudentData;
import org.junit.jupiter.api.Test;

public class DemoqaTests extends TestBase {

	@Test
	public void checkMainPage() {

		Student student = StudentData.students[0];

		registrationPage.openPage()
				.setFirstNameInput(student)
				.setLastNameInput(student)
				.setUserEmailInput(student)
				.setGenterCheckBox(student)
				.setUserNumberInput(student)
				.setBirthDay(student)
				.setSubjectsContainerInput(student)
				.setHobbies(student)
				.setPicture(student)
				.setCurrentAddress(student)
				.setState(student)
				.setStateCity(student);
		registrationPage.clickSubmit();
		registrationPage.checkSubmittingFormValue(student);
	}
}
