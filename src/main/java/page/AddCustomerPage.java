package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	// declare WebDriver
	WebDriver driver;

	// Constructor to hold driver
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// identify element using Findby
	@FindBy(how = How.XPATH, using = "//strong[text()='New Customer']")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input")
	WebElement FULL_NAME_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[2]/div/select")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[3]/div/input")
	WebElement EMAIL_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement COMPANY_PHONE_NUM;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[5]/div/input")
	WebElement ADDRESS_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[8]/div[1]/select")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"save_btn\"]")
	WebElement SAVE_BOTTON;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[6]/div/input")
	WebElement CITY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_group\"]")
	WebElement GROUP_SELECT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"port\"]")
	WebElement ZIPCODE_ELEMENT;
	
	

	// Intractable methods
	public String validateAddCustomerPage() {
		String addCustomerHeaderText = ADD_CUSTOMER_HEADER_ELEMENT.getText();
		return addCustomerHeaderText;
	}
	
	public int generateRandomNum(int boundryNum)  {
		Random rnd = new Random();
		return rnd.nextInt(boundryNum);
	}
	
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + generateRandomNum(999)) ;
	}
	

	public void selectCompany(String company) {
		Select sel = new Select(COMPANY_DROPDOWN_ELEMENT);
		sel.selectByVisibleText(company);
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
}
	
	public void insertPhoneNum(String phone) {
		COMPANY_PHONE_NUM.sendKeys(phone);
}
	

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
}
	

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
}
	
	public void insertZipcode(String zipcode) {
		ZIPCODE_ELEMENT.sendKeys(zipcode);
	}
	
	public void clickSave() {
		SAVE_BOTTON.click();
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(999) + email);
}
	
	public void selectCountry(String country) {
		Select sel1 = new Select(COUNTRY_DROPDOWN_ELEMENT);
		sel1.selectByVisibleText(country);
		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);
}
	
	public void selectGroup(String group) {
		Select sel2 = new Select(GROUP_SELECT);
		sel2.selectByVisibleText(group);
		selectFromDropdown(GROUP_SELECT, group);
}
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
}
}