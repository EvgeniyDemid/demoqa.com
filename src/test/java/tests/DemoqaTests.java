package tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import testData.Student;
import testData.StudentData;

import java.io.File;

import static com.codeborne.selenide.Browsers.FIREFOX;
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
		$("#lastName").should(Condition.visible).setValue(student.getLastName());
		$("#userEmail").should(Condition.visible).setValue(student.getEmail());
		$("[for='gender-radio-1']").should(Condition.visible).click();
		$("#userNumber").should(Condition.visible).setValue(student.getUserMobile());
		$("#dateOfBirthInput").should(Condition.visible).click();
		$(".react-datepicker__month-select").should(Condition.visible).click();
		$$(".react-datepicker__month-select option[value]").find(Condition.text(student.getMonthOfBirth())).click();
		$(".react-datepicker__year-select").should(Condition.visible).click();
		$$(".react-datepicker__year-select option[value]").find(Condition.text(student.getYearOfBirth())).click();
		$$(".react-datepicker__month div div").find(Condition.text(student.getDayOfBirth())).click();
		$("#subjectsContainer input").should(Condition.visible).sendKeys(student.getSubjects());
		$$("[class*='css-26l3qy-menu'] div").should(CollectionCondition.sizeGreaterThan(0)).get(1).click();
		$("[for='hobbies-checkbox-3']").should(Condition.visible).click();
		$("#uploadPicture").uploadFile(new File("src/test/resources/Screenshot.png"));
		$("#currentAddress").scrollIntoView(false).setValue(student.getCurrentAddress());
		$("#state .css-tlfecz-indicatorContainer").should(Condition.visible).scrollIntoView(true).click();
		$$(".css-26l3qy-menu div").find(Condition.text(student.getState())).click();
		$("#city .css-tlfecz-indicatorContainer").should(Condition.visible).scrollIntoView(true).click();
		$$(".css-26l3qy-menu div").find(Condition.text(student.getCity())).click();
		$("#submit").should(Condition.visible).click();

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
