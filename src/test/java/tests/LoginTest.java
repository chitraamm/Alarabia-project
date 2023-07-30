package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Dashboardpage;
import pageobjects.ForgotPage;
import pageobjects.Loginpage;
import pageobjects.Memberinvitiedpage;
import pageobjects.Memberspage;
import pageobjects.ResetPasswordPage;
import resourcee.Base;


public class LoginTest extends Base {
	org.apache.logging.log4j.Logger log;

	public WebDriver driver;
	Dashboardpage dashboardpage = new Dashboardpage(driver);
	Loginpage signinpage = new Loginpage(driver);
	ForgotPage forgotpage = new ForgotPage(driver);
	ResetPasswordPage restpassword = new ResetPasswordPage(driver);
	Memberspage members = new Memberspage(driver);
	Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
	String actualResult = null;


	@Test
	public void signin1() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		Dashboardpage dashboardpage = new Dashboardpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		signinpage.signinbutton().click();
		
		
		
		try
		{
			if (dashboardpage.dashboard().isDisplayed()) {
				actualResult = "Success";
				log.debug("Dashboard got displayed");
			}

		}catch(Exception e) {
			Thread.sleep(10000);
			actualResult = "Failure";
			log.debug("Dashboard not get displayed");
		}


    	AssertJUnit.assertTrue(dashboardpage.dashboard().isDisplayed());
		log.info("Signin1 got passed");

	}

	@Test
	public void signin2() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);
		
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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-invepassword"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		signinpage.signinbutton().click();
		log.info("Invalid Credential");
		

	}
	
	@Test
	public void signin3() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-inv@email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		Assert.assertTrue(signinpage.invalidemail().isDisplayed());
		log.info("Invalid email address or phone number");
		
		
	}
	
	
	@Test
	public void signin4() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-invmemail"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		
		signinpage.signinbutton().click();
		log.info("Invalid email address or phone number");
		

	}
	
	@Test
	public void signin5() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("password@"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		signinpage.eyeicon().click();
		Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		log.info("Must Contain One Uppercase, One Lowercase");
		

	}
	
	@Test
	public void signin6() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Password123"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		signinpage.eyeicon().click();
		log.info("Must Contain One Uppercase, One Lowercase");
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		

	}
	
	@Test
	public void signin7() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("password@123"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		signinpage.eyeicon().click();
		log.info("Must Contain One Uppercase, One Lowercase");
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		

	}
	
	@Test
	public void signin8() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		signinpage.eyeicon().click();
		log.info("Must Contain One Uppercase, One Lowercase");
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		

	}
	
	@Test
	public void signin9() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-dotemail"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		log.info("Invalid email address or phone number");
		//signinpage.eyeicon().click();
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
	}
	
	@Test
	public void signin10() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-invcomemail"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		log.info("Invalid email address or phone number");
		//signinpage.eyeicon().click();
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
	}
	
	@Test
	public void signin11() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("helpemail"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		log.info("Invalid email address or phone number");
		//signinpage.eyeicon().click();
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		

	}
	
	@Test
	public void signin12() throws InterruptedException, AWTException {

		Loginpage signinpage = new Loginpage(driver);

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

		signinpage.emailtextfield().sendKeys(prop.getProperty("Alemail"));
		log.debug("Email addressed got entered");
		try
		{
			if (signinpage.passwordtextfield().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}

		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
		log.debug("Password got entered");

		try
		{
			if (signinpage.signinbutton().isDisplayed()) {

			}

		}catch(Exception e) {
			Thread.sleep(10000);

		}
		signinpage.signinbutton().click();
		log.info("Invalid Cerdential");
		//Assert.assertTrue(signinpage.eyeicon().isDisplayed());
		

	}
	



	
	@BeforeMethod
	public void openapplication() throws IOException {
		log = org.apache.logging.log4j.LogManager.getLogger(LoginTest.class.getName());

		driver = initializeDriver();

		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to url");
		System.out.println("Login page opened");
	}

	@AfterMethod
	public void close() {
		driver.close();
		log.debug("Browser got closed");
	}
	
}