package testData;

public class StudentData {
	public static Student[] students = new Student[]{
			Student.builder()
					.firstName("ivan")
					.lastName("smirnov")
					.email("qwert@mail.ru")
					.gender("Male")
					.userMobile("8928384858")
					.yearOfBirth("2001")
					.monthOfBirth("June")
					.dayOfBirth("12")
					.subjects("Arts")
					.hobbiesSport("Music")
					.currentAddress("Pervomayskaya 89")
					.state("Haryana")
					.city("Karnal")
					.picture("Screenshot.png")
					.build()
	};
}
