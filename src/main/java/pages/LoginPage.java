package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements Library
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")WebElement EmailInput;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")WebElement PasswordInput;
	@FindBy(how = How.XPATH, using = "//form/button[@type='submit']")WebElement SubmitButton;
	
	// Interactive Methods
	
	public void FillEmailInput() {
	
	}

	public void FillPasswordInput() {
		
	}
	
	public void Login(String username, String password) {
		EmailInput.sendKeys(username);
		PasswordInput.sendKeys(password);
		SubmitButton.click();
	}

}
