package com.demoqa.testData;

public class StudentData {
	public static Student[] students = new Student[]{
			Student.builder()
					.firstName("ivan")
					.lastName("smirnov")
					.email("qwert@mail.ru")
					.gender("Male")
					.userMobile("8928384858")
					.yearOfBirth("2001")
					.monthOfBirth("March")
					.dayOfBirth("15")
					.subjects("Arts")
					.hobbies("Music")
					.currentAddress("Pervomayskaya 89")
					.state("Haryana")
					.city("Karnal")
					.picture("Screenshot.png")
					.pathPicture("src/test/resources/")
					.build()
	};
}
