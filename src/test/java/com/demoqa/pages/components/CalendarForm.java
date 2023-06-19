package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;

public class CalendarForm {
	public void setDate(String day, String month, String year) {
		if (day.length()==1){
			day="0"+day;
		}
		SelenideElement
				month_select = $(".react-datepicker__month-select"),
				year_select = $(".react-datepicker__year-select"),
				day_select = $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)");

		month_select.selectOption(month);
		year_select.selectOption(year);
		day_select.click();

	}
}
