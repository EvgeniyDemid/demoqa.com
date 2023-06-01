package tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import testData.Student;
import testData.StudentData;

import java.io.File;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DemoqaTests {


	@BeforeAll
	static void beforeAll() {
		Configuration.baseUrl = "https://demoqa.com";
		Configuration.pageLoadStrategy = "eager";
		Configuration.browser = FIREFOX;
	}

	@Test
	public void checkMainPage() {
		Selenide.open("/automation-practice-form");
		WebDriverRunner.driver().getWebDriver().manage().window().maximize();
		Student student = StudentData.students[0];
		$("#firstName").should(Condition.visible).setValue(student.getFirstName());
		$("#lastName").setValue(student.getLastName());
		$("#userEmail").setValue(student.getEmail());
		$("#genterWrapper").$(byText("Male")).click();
		$("#userNumber").setValue(student.getUserMobile());
		$("#dateOfBirthInput").click();
		$(".react-datepicker__month-select").click();
		$$(".react-datepicker__month-select option[value]").find(Condition.text(student.getMonthOfBirth())).click();
		$(".react-datepicker__year-select").click();
		$$(".react-datepicker__year-select option[value]").find(Condition.text(student.getYearOfBirth())).click();
		$$(".react-datepicker__month div div").find(Condition.text(student.getDayOfBirth())).click();
		$("#subjectsContainer input").sendKeys(student.getSubjects());
		$$("[class*='css-26l3qy-menu'] div").should(CollectionCondition.sizeGreaterThan(0)).get(1).click();
		$("#hobbiesWrapper").$(byText("Music")).click();
		$("#uploadPicture").uploadFile(new File("src/test/resources/Screenshot.png"));
		$("#currentAddress").scrollIntoView(true).setValue(student.getCurrentAddress());
		$("#state").scrollIntoView(true).click();
		$("#stateCity-wrapper").$(byText(student.getState())).click();
		$("#city").click();
		$("#stateCity-wrapper").$(byText(student.getCity())).click();
		$("#submit").click();

		$$("tr td:nth-child(even)").get(0).should(Condition.text(student.getFirstName() + " " + student.getLastName()));
		$$("tr td:nth-child(even)").get(1).should(Condition.text(student.getEmail()));
		$$("tr td:nth-child(even)").get(2).should(Condition.text(student.getGender()));
		$$("tr td:nth-child(even)").get(3).should(Condition.text(student.getUserMobile()));
		$$("tr td:nth-child(even)").get(4).should(Condition.text(student.getDayOfBirth() + " " + student.getMonthOfBirth() + "," + student.getYearOfBirth()));
		$$("tr td:nth-child(even)").get(5).should(Condition.text(student.getSubjects()));
		$$("tr td:nth-child(even)").get(6).should(Condition.text(student.getHobbiesSport()));
		$$("tr td:nth-child(even)").get(7).should(Condition.text(student.getPicture()));
		$$("tr td:nth-child(even)").get(8).should(Condition.text(student.getCurrentAddress()));
		$$("tr td:nth-child(even)").get(9).should(Condition.text(student.getState() + " " + student.getCity()));
	}
}
