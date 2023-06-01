package page;

import form.RegistrationForm;
import form.SubmittingForm;

public class PracticePage {

	public RegistrationForm onRegistrationForm(){ return new RegistrationForm();}

	public SubmittingForm onSubmittingForm(){return new SubmittingForm();}
}
