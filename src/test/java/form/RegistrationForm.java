package form;

import org.openqa.selenium.By;

public class RegistrationForm {
	public By firstNameInput = By.xpath("//input[contains(@id,'firstName')]");
	public By lastNameInput = By.xpath("//input[contains(@id,'lastName')]");
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
	public By subjectsInput = By.xpath("//div[contains(@class,'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi')]");
	public By hobbiesSportsRadioButton = By.xpath("//label[contains(text(),'Sports')]");
	public By hobbiesReadingRadioButton = By.xpath("//label[contains(text(),'Reading')]");
	public By hobbiesMusicRadioButton = By.xpath("//label[contains(text(),'Music')]");
	public By uploadPictureButton = By.xpath("//input[@id='uploadPicture']");
	public By currentAddressInput = By.xpath("//textarea[@id='currentAddress']");
	public By droDownListStateButton = By.xpath("//textarea[@id='currentAddress']");

	public By droDownListCityButton = By.xpath("(//div[contains(@class,' css-tlfecz-indicatorContainer')])[2]");


}
