package steps;

import com.google.inject.Inject;
import page.PracticePage;
import testData.Student;

public class StudentRegistrationSteps {
	@Inject
	PracticePage practicePage;

	public void fillAllFieldsOfForm(Student student){
		practicePage.onRegistrationForm()

	}
}
