package form;

import org.openqa.selenium.By;

public class RegistrationForm {
	public By firstNameInput = By.xpath("//input[contains(@id,'firstName')]");
	public By lastNameInput = By.xpath("//input[contains(@id,'lastName')]");
	public By emailInput = By.xpath("//input[contains(@id,'userEmail')]");
	public By genderMaleRadioButton = By.xpath("//label[contains(text(),'Male')]");
	public By genderFemaleRadioButton = By.xpath("//label[contains(text(),'Female')]");
	public By genderOtherRadioButton = By.xpath("//label[contains(text(),'Other')]");
	public By userNumberInput = By.xpath("//input[contains(@id,'userNumber')]");
	public By dateOfBirthInput = By.xpath("//input[contains(@id,'dateOfBirthInput')]");
	public By monthSelect = By.xpath("//select[contains(@class,'react-datepicker__month-select')]");
	public By monthValue = By.xpath("//select[contains(@class,'react-datepicker__month-select')]/option");
	public By yearSelect = By.xpath("//select[contains(@class,'react-datepicker__year-select')]");
	public By yearValue = By.xpath("//select[contains(@class,'react-datepicker__year-select')]/option");
	public By dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day')]");
	public By subjectsInput = By.xpath("//input[contains(@id,'subjectsInput')]");
	public By drobDownList = By.xpath("//div[contains(@class,'subjects-auto-complete__menu')]/div");
	public By hobbiesSportsRadioButton = By.xpath("//label[contains(text(),'Sports')]");
	public By hobbiesReadingRadioButton = By.xpath("//label[contains(text(),'Reading')]");
	public By hobbiesMusicRadioButton = By.xpath("//label[contains(text(),'Music')]");
	public By uploadPictureButton = By.xpath("//input[@id='uploadPicture']");
	public By currentAddressInput = By.xpath("//textarea[@id='currentAddress']");
	public By droDownListStateButton = By.xpath("//div[contains(text(),'Select State')]");
	public By droDownListState = By.xpath("//div[contains(@class,'qy-menu')]/div");
	public By uploadPicture = By.xpath("//input[@id='uploadPicture']");
	public By droDownListCityButton = By.xpath("(//div[contains(@class,' css-tlfecz-indicatorContainer')])[2]");
	public By submitButton = By.xpath("//button[@id='submit']");


}
