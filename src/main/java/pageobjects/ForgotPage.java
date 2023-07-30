package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourcee.Base;

public class ForgotPage extends Base {
	public WebDriver driver;

	public ForgotPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[2]/a")
	WebElement forgot;
	
	@FindBy(name="email")
	WebElement emailtextfield;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[2]/button")
	WebElement reset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[3]/a")
	WebElement remember;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[2]/form/div[1]/div/div")
	WebElement eyeicon;
	
	
		
	
	
	
	
	public WebElement forgot() {
		return forgot;
	}

	public WebElement reset() {
		return reset;
	}
	public WebElement emailtextfield() {
		return emailtextfield;
	}
	public WebElement remember() {
		return remember;
	}
	public WebElement eyeicon() {
		return eyeicon;
	}

}
