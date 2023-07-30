package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.Memberinvitiedpage;

import resourcee.Base;


public class MemberinvitedTest extends Base {
	org.apache.logging.log4j.Logger log;

//	@Test
//	public void member1() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//		log.info("contact is displayed");
//	
//	}
	
//	@Test
//	public void member2() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().sendKeys(prop.getProperty("name"));
//		log.info("name is displayed");
//	
//	}
	
//	@Test
//	public void member3() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.password().sendKeys(prop.getProperty("Al-password"));
//		log.info("password is displayed");
//	
//	}
	
//	@Test
//	public void member4() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		
//		try
//		{
//			if (memberinvited.confirmpassword().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.confirmpassword().sendKeys(prop.getProperty("Al-password"));
//		log.info("password is displayed");
//	
//	}
	
//	@Test
//	public void member5() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().click();
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.password().sendKeys(prop.getProperty("Al-password"));
//				
//	}
	
//	@Test
//	public void member7() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().sendKeys(prop.getProperty("name"));
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.password().sendKeys(prop.getProperty("password"));
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//		memberinvited.eyeicon().click();
//	}
	
//	@Test
//	public void member8() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().sendKeys(prop.getProperty("name"));
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.password().sendKeys(prop.getProperty("Al-password"));
//		
//		try
//		{
//			if (memberinvited.confirmpassword().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//		memberinvited.confirmpassword().sendKeys(prop.getProperty("password"));
//	}
	
//	@Test
//	public void member9() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().sendKeys(prop.getProperty("name"));
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.password().sendKeys(prop.getProperty("Al-password"));
//		
//		try
//		{
//			if (memberinvited.confirmpassword().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//		memberinvited.confirmpassword().sendKeys(prop.getProperty("Al-password"));
//		
//		try
//		{
//			if(memberinvited.completebutton().isDisplayed()) {
//		}
//			
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		
//	}
	
//	@Test
//	public void member10() throws InterruptedException, AWTException {
//
//		Memberinvitiedpage memberinvited = new Memberinvitiedpage(driver);
//
//		Robot robot = new Robot();
//
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 4; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//		log.debug("Page is zoomed out");
//		try
//		{
//			if (memberinvited.contact().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.contact().sendKeys(prop.getProperty("num"));
//
//		try
//		{
//			if (memberinvited.name().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberinvited.name().sendKeys(prop.getProperty("name"));
//		
//		try
//		{
//			if (memberinvited.password().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//		memberinvited.password().sendKeys(prop.getProperty("Al-password"));
//		
//		try
//		{
//			if(memberinvited.confirmpassword().isDisplayed()) {
//		}
//			
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		memberinvited.confirmpassword().sendKeys(prop.getProperty("Al-password"));
//		try
//		{
//			if(memberinvited.eyeicon().isDisplayed()) {
//		}
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		memberinvited.eyeicon().click();
//			
//	}

	
	
	

	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			@BeforeMethod
			public void openapplication() throws IOException {
				log = org.apache.logging.log4j.LogManager.getLogger(LoginTest.class.getName());

				driver = initializeDriver();

				log.debug("Browser got launched");
				driver.get(prop.getProperty("url"));
				log.debug("Navigated to url");
				System.out.println("Members page opened");
			}

//				@AfterMethod
//				public void close() {
//					driver.close();
//					log.debug("Browser got closed");
//				}


		}

