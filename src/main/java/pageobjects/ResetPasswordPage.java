package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourcee.Base;

public class ResetPasswordPage extends Base {
	public WebDriver driver;
	
	public ResetPasswordPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name="password")
	WebElement passwordfield;
	
	@FindBy(name="passwordConfirmation")
	WebElement confirmation;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/button")
	WebElement resetnow;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div/div[1]")
	WebElement eyeicon;
		
	
	
	
		
	
	public WebElement passwordfield() {
		return passwordfield;
	}
	public WebElement confirmation() {
		return confirmation;
	}
	public WebElement resetnow() {
		return resetnow;
	}
	public WebElement eyeicon() {
		return eyeicon;
	}
	
	
}
