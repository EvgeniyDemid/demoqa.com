package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.StudentRegistrationSteps;
import testData.Student;
import testData.StudentData;

import static com.codeborne.selenide.Browsers.FIREFOX;

public class DemoqaTests {

	StudentRegistrationSteps studentRegistrationSteps = new StudentRegistrationSteps();

	@BeforeAll
	static void beforeAll() {

		Configuration.pageLoadStrategy = "eager";
		Configuration.browser = FIREFOX;
	}

	@BeforeEach
	public void setUp() {
		Selenide.open("https://demoqa.com/automation-practice-form");
		WebDriverRunner.driver().getWebDriver().manage().window().maximize();
	}

	@Test
	public void checkMainPage() {
		Student[] student = StudentData.students;
		studentRegistrationSteps.fillAllFieldsOfForm(student[0]);
		studentRegistrationSteps.checkSubmittingForm(student[0]);
	}
}
