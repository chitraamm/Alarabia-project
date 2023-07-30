package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourcee.Base;

public class Loginpage extends Base {

	public WebDriver driver;

	public Loginpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(name="email")
	WebElement emailtextfield;

	@FindBy(name="password")
	WebElement passwordtextfield;

	@FindBy(id="signin")
	public
	WebElement signinbutton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div[1]/small")
	WebElement invalidemail;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div[2]/div")
	WebElement eyeicon ;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[2]/a")
	WebElement forgot;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[2]")
	WebElement reset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[3]/a")
	WebElement remember;
	
	
	
	
	
	
	
	
	
	
	public WebElement emailtextfield() {

		return emailtextfield;
	}
	public WebElement passwordtextfield() {

		return passwordtextfield;
	}
	public WebElement signinbutton() {

		return signinbutton;
	}
	public WebElement invalidemail() {
		return invalidemail;
	}
	public WebElement eyeicon() {
		return eyeicon;
	}
	public WebElement forgot() {
		return forgot;
	}
	public WebElement reset() {
		return reset;
	}
	public WebElement remember() {
		return remember;
	}

}
