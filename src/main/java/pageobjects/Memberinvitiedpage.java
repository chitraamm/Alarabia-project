package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourcee.Base;

public class Memberinvitiedpage extends Base {
	
	public WebDriver driver;

	public Memberinvitiedpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div[4]/div/input")
	WebElement contact;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div[6]/div[1]")
	WebElement eyeicon;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[2]/button")
	WebElement completebutton;
	
	
	

	
	
	
	
	public WebElement contact() {
		return contact;
	}
	public WebElement name() {
		return name;
	}
	public WebElement password() {
		return password;
	}
	public WebElement confirmpassword() {
		return confirmpassword;
	}
	public WebElement eyeicon() {
		return eyeicon;
	}
	public WebElement completebutton() {
		return completebutton;
	}
	
}
