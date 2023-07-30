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

import pageobjects.ForgotPage;
import pageobjects.Loginpage;
import resourcee.Base;

public class ForgotPassTest extends Base {
	org.apache.logging.log4j.Logger log;

	public WebDriver driver;
	Loginpage signinpage = new Loginpage(driver);
	ForgotPage forgotpage = new ForgotPage(driver);
	String actualResult = null;
	
	@Test
	public void forgot() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
			
			try
			{
				if (forgotpage.reset().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}
			
			forgotpage.reset().click();
			
			try
			{
				if (signinpage.emailtextfield().isDisplayed()) {
					actualResult = "Success";
					log.debug("LoginPage got displayed");
				}

			}catch(Exception e) {
				Thread.sleep(10000);
				actualResult = "Failure";
				log.debug("LoginPage not get displayed");
			}


	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("ForgotPassword1 got passed");

}
	
	@Test
	public void forgot1() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
			
			try
			{
				if (forgotpage.remember().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.remember().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("loginpage got displayed");

	}
	
	@Test
	public void forgot2() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("Email"));
			
			try
			{
				if (forgotpage.reset().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.reset().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("User not found");

	}
	
	@Test
	public void forgot3() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("invemail"));
			
			try
			{
				if (forgotpage.eyeicon().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.eyeicon().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("Invalid email address or phone number");

	}
	
	@Test
	public void forgot4() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("@email"));
			
			try
			{
				if (forgotpage.eyeicon().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.eyeicon().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("Invalid email address or phone number");

	}
	
	@Test
	public void forgot5() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("comemail"));
			
			try
			{
				if (forgotpage.eyeicon().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.eyeicon().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("Invalid email address or phone number");

	}
	
	@Test
	public void forgot6() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("coemail"));
			
			try
			{
				if (forgotpage.eyeicon().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.eyeicon().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("Invalid email address or phone number");

	}
	
	@Test
	public void forgot7() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		ForgotPage forgotpage = new ForgotPage(driver);
		

		Robot robot = new Robot();
		try
		{
			if (signinpage.emailtextfield().isDisplayed()) {

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
			if (signinpage.emailtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.forgot().click();
	

        	try
			{
				if (forgotpage.emailtextfield().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.emailtextfield().sendKeys(prop.getProperty("helpemail"));
			
			try
			{
				if (forgotpage.eyeicon().isDisplayed()) {

				}

			}catch(Exception e) {
				Thread.sleep(10000);

			}

			forgotpage.eyeicon().click();
			
	    	AssertJUnit.assertTrue(signinpage.emailtextfield().isDisplayed());
			log.info("Invalid email address or phone number");

	}
	
	
   
		
	
	
	
	
	@BeforeMethod
	public void openapplication() throws IOException {
		log = org.apache.logging.log4j.LogManager.getLogger(LoginTest.class.getName());

		driver = initializeDriver();

		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to url");
		System.out.println("Forgot Password page opened");
	}

	@AfterMethod
	public void close() {
		driver.close();
		log.debug("Browser got closed");
	}
	

}
