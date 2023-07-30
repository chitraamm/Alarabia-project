package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourcee.Base;

public class Dashboardpage extends Base {

	public	WebDriver driver;


	public Dashboardpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/a[1]")
	WebElement dashboard;

	
	
	
	public WebElement dashboard() {

		return dashboard;
	}
	
}
	
	
	
	
	
	