package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.testData.Student;
import com.demoqa.testData.StudentData;
import org.junit.jupiter.api.Test;

public class DemoqaTests extends TestBase {
	RegistrationPage registrationPage = new RegistrationPage();

	@Test
	public void checkMainPage() {

		Student student = StudentData.students[0];

		registrationPage.openPage()
				.setFirstName(student.getFirstName())
				.setLastName(student.getLastName())
				.setEmail(student.getEmail())
				.setGender(student.getGender())
				.setMobile(student.getUserMobile())
				.setBirthDay(student.getDayOfBirth(),student.getMonthOfBirth(),student.getYearOfBirth())
				.setSubjects(student.getSubjects())
				.setHobbies(student.getHobbies())
				.setPicture(student.getPicture(),student.getPathPicture())
				.setCurrentAddress(student.getCurrentAddress())
				.setStateInput(student.getState())
				.setСityInput(student.getCity())
				.clickSubmitButton()
				.checkSubmittingStudentForm(student);
	}
}
