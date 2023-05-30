package testData;

public class StudentData {
	public static Student[] students = new Student[]{
			Student.builder()
					.firstName("ivan")
					.lastName("smirnov")
					.email("qwert@mail.ru")
					.gender("Male")
					.userMobile("8928384858")
					.yearOfBirth("2000")
					.monthOfBirth("5")
					.dayOfBirth("12")
					.subjects("Test")
					.hobbiesSport("Music")
					.currentAddress("Pervomayskaya 89")
					.state("Mockow")
					.city("MockowCity")
					.build()
	};
}
