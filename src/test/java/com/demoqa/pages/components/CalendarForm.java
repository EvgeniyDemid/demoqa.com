package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.testData.Student;

import static com.codeborne.selenide.Selenide.$;

public class CalendarForm {
	public void setDate(Student student){
		SelenideElement
				month_select = $(".react-datepicker__month-select"),
				year_select = $(".react-datepicker__year-select"),
				day_select = $(".react-datepicker__day--0" + student.getDayOfBirth() +":not(.react-datepicker__day--outside-month)");

		month_select.selectOption(student.getMonthOfBirth());
		year_select.selectOption(student.getYearOfBirth());
		day_select.click();

	}
}
