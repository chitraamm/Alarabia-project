package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.ResetPasswordPage;
import resourcee.Base;

public class ResetPassword extends Base {
	org.apache.logging.log4j.Logger log;


	public WebDriver driver;

	ResetPasswordPage resetpassword = new ResetPasswordPage(driver);
	String actualResult = null;
	
	@Test
	public void resetpassword() throws InterruptedException, AWTException {

		ResetPasswordPage resetpassword = new ResetPasswordPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		log.debug("Page is zoomed out");

		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.passwordfield().sendKeys(prop.getProperty("resetpassword"));
		try
		{
			if (resetpassword.confirmation().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.confirmation().sendKeys(prop.getProperty("resetpassword"));
		try
		{
			if (resetpassword.resetnow().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		resetpassword.resetnow().click();
		log.info("ResetPassword got passed");
		
	}
	
	@Test
	public void resetpassword1() throws InterruptedException, AWTException {

		ResetPasswordPage resetpassword = new ResetPasswordPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		log.debug("Page is zoomed out");

		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.passwordfield().sendKeys(prop.getProperty("resetPassword"));
		try
		{
			if (resetpassword.confirmation().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.confirmation().sendKeys(prop.getProperty("resetPassword"));
		try
		{
			if (resetpassword.resetnow().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		log.info("Must Contain One Uppercase, One Lowercase");
			
	}
	
	@Test
	public void resetpassword2() throws InterruptedException, AWTException {

		ResetPasswordPage resetpassword = new ResetPasswordPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		log.debug("Page is zoomed out");

		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.passwordfield().sendKeys(prop.getProperty("Password1"));
		try
		{
			if (resetpassword.confirmation().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.eyeicon().click();
		AssertJUnit.assertTrue(resetpassword.passwordfield().isDisplayed());
		log.info("Must Contain One Uppercase, One Lowercase");
		//restpassword.restnow().click();
		
	}
	
	@Test
	public void resetpassword3() throws InterruptedException, AWTException {

		ResetPasswordPage resetpassword = new ResetPasswordPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		log.debug("Page is zoomed out");

		try
		{
			if (resetpassword.passwordfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.passwordfield().sendKeys(prop.getProperty("resetpassword"));
		try
		{
			if (resetpassword.confirmation().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		resetpassword.confirmation().sendKeys(prop.getProperty("resetPassword"));
		try
		{
			if (resetpassword.resetnow().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		resetpassword.eyeicon().click();
	
	}
	
	

	
	
	
	
	
	
	@BeforeMethod
	public void openapplication() throws IOException {
		log = org.apache.logging.log4j.LogManager.getLogger(LoginTest.class.getName());

		driver = initializeDriver();

		log.debug("Browser got launched");
		driver.get(prop.getProperty("reseturl"));
		log.debug("Navigated to url");
		System.out.println("Reset password page opened");
	}

	@AfterMethod
	public void close() {
		driver.close();
		log.debug("Browser got closed");
	}
}
