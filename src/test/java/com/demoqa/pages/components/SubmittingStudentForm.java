package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.testData.Student;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SubmittingStudentForm {

	SelenideElement
			submittingForm = $(".table-responsive"),
			titelSubForm = $("#example-modal-sizes-title-lg");
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
