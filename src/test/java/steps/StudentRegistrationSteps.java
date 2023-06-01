package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import page.PracticePage;
import testData.Student;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class StudentRegistrationSteps {

	public void fillAllFieldsOfForm(Student student) {
		$(new PracticePage().onRegistrationForm().firstNameInput).setValue(student.getFirstName());
		$(new PracticePage().onRegistrationForm().lastNameInput).setValue(student.getLastName());
		$(new PracticePage().onRegistrationForm().emailInput).setValue(student.getEmail());
		$(new PracticePage().onRegistrationForm().genderMaleRadioButton).should(Condition.visible).click();
		$(new PracticePage().onRegistrationForm().userNumberInput).setValue(student.getUserMobile());
		$(new PracticePage().onRegistrationForm().dateOfBirthInput).should(Condition.visible).click();
		$(new PracticePage().onRegistrationForm().monthSelect).should(Condition.visible).click();
		$$(new PracticePage().onRegistrationForm().monthValue).find(Condition.text(student.getMonthOfBirth())).click();
		$(new PracticePage().onRegistrationForm().yearSelect).should(Condition.visible).click();
		$$(new PracticePage().onRegistrationForm().yearValue).find(Condition.text(student.getYearOfBirth())).click();
		$$(new PracticePage().onRegistrationForm().dayValue).find(Condition.text(student.getDayOfBirth())).click();
		$(new PracticePage().onRegistrationForm().subjectsInput).sendKeys("arts");
		$$(new PracticePage().onRegistrationForm().drobDownList).first().click();
		$(new PracticePage().onRegistrationForm().hobbiesMusicRadioButton).should(Condition.visible).click();
		$(new PracticePage().onRegistrationForm().uploadPicture).uploadFile(new File("src/test/java/testData/Screenshot.png"));
		$(new PracticePage().onRegistrationForm().currentAddressInput).scrollIntoView(false).setValue(student.getCurrentAddress());
		$(new PracticePage().onRegistrationForm().droDownListStateButton).should(Condition.visible).scrollIntoView(true).click();
		$$(new PracticePage().onRegistrationForm().droDownListState).find(Condition.text(student.getState())).click();
		$(new PracticePage().onRegistrationForm().droDownListCityButton).should(Condition.visible).scrollIntoView(true).click();
		$$(new PracticePage().onRegistrationForm().droDownListState).find(Condition.text(student.getCity())).click();
		$(new PracticePage().onRegistrationForm().submitButton).should(Condition.visible).click();
	}

	public void checkSubmittingForm(Student student) {
		$(new PracticePage().onSubmittingForm().studentName).should(Condition.text(student.getFirstName() + " " + student.getLastName()));
		$(new PracticePage().onSubmittingForm().studentEmail).should(Condition.text(student.getEmail()));
		$(new PracticePage().onSubmittingForm().gender).should(Condition.text(student.getGender()));
		$(new PracticePage().onSubmittingForm().mobile).should(Condition.text(student.getUserMobile()));
		$(new PracticePage().onSubmittingForm().dateofBirth).should(Condition.text(student.getDayOfBirth() + " " + student.getMonthOfBirth() + "," + student.getYearOfBirth()));
		$(new PracticePage().onSubmittingForm().subjects).should(Condition.text(student.getSubjects()));
		$(new PracticePage().onSubmittingForm().hobbies).should(Condition.text(student.getHobbiesSport()));
		$(new PracticePage().onSubmittingForm().picture).should(Condition.text(student.getPicture()));
		$(new PracticePage().onSubmittingForm().address).should(Condition.text(student.getCurrentAddress()));
		$(new PracticePage().onSubmittingForm().stateCity).should(Condition.text(student.getState()+" "+student.getCity()));

	}

}
