package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.jsonwebtoken.security.Keys;
import pageobjects.Dashboardpage;
import pageobjects.ForgotPage;
import pageobjects.Loginpage;
import pageobjects.Memberspage;

import resourcee.Base;

public class MembersTest extends Base {
	org.apache.logging.log4j.Logger log;

	public WebDriver driver;
	Dashboardpage dashboardpage = new Dashboardpage(driver);
	Loginpage signinpage = new Loginpage(driver);
	ForgotPage forgotpage = new ForgotPage(driver);
	Memberspage memberspage = new Memberspage(driver);
	String actualResult = null;

//		@Test
//		public void member1() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//				
//				try {
//					if (memberspage.members().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//				
//				memberspage.members().click();
//			
//			
//			AssertJUnit.assertTrue(memberspage.members().isDisplayed());
//			log.info("Member1 got passed");		
//	}

//		@Test
//		public void member2() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.searchmembers().sendKeys(prop.getProperty("search"));	
//				
//				try
//				{
//					if (memberspage.searchmembers().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.searchmembers().sendKeys(org.openqa.selenium.Keys.ENTER);
//				
//				try {
//					if (memberspage.searchmembers().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//				
//				
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member2 got passed");			
//	}

//		@Test
//		public void member3() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.searchmembers().sendKeys(prop.getProperty("Search"));	
//				
//				try
//				{
//					if (memberspage.searchmembers().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.searchmembers().sendKeys(org.openqa.selenium.Keys.ENTER);
//				
//				try {
//					if (memberspage.searchmembers().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//				
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member3 got passed");		
//	}

//		@Test
//		public void member4() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.searchmembers().sendKeys(prop.getProperty("invsearch"));	
//				
//				try
//				{
//					if (memberspage.searchmembers().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.searchmembers().sendKeys(org.openqa.selenium.Keys.ENTER);
//				
//				try {
//					if (memberspage.searchmembers().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member4 got passed");			
//	}

//		@Test
//		public void member5() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}

//		@Test
//		public void member6() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.added().click();
//				
//				try {
//					if (memberspage.added().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member6 got passed");			
//	}

//		@Test
//		public void member7() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.update().click();
//				
//				try {
//					if (memberspage.update().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member7 got passed");			
//	}

//		@Test
//		public void member8() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.name().click();
//				
//				try {
//					if (memberspage.name().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member8 got passed");			
//	}

//		@Test
//		public void member9() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.zname().click();
//				
//				try {
//					if (memberspage.zname().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member9 got passed");			
//	}
//
//		@Test
//		public void member10() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.button().click();	
//				
//				try
//				{
//					if (memberspage.button().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.date().click();
//				
//				try {
//					if (memberspage.date().isDisplayed()) {
//						actualResult = "Success";
//						log.debug("Members got displayed");
//					}
//				
//			}catch(Exception e) {
//				Thread.sleep(10000);
//				actualResult = "Failure";
//				log.debug("Members not get displayed");
//			}
//							
//			AssertJUnit.assertTrue(memberspage.searchmembers().isDisplayed());
//			log.info("Member10 got passed");			
//	}

//		@Test
//		public void member11() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member12() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.emailtextfield().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	
//				memberspage.emailtextfield().sendKeys(prop.getProperty("mememail"));
//		}
//
//		@Test
//		public void member13() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//		}
//
//		@Test
//		public void member14() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//				try
//	
//				{
//					if (memberspage.roleset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.roleset().click();
//		}

//		@Test
//		public void member15() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//			   try
//				{
//					if (memberspage.department().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.department().click();
//		}

//		@Test
//		public void member16() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//			   try
//				{
//					if (memberspage.department().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.department().click();
//				try
//				{
//					if (memberspage.departmentset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.departmentset().click();
//		}

//		@Test
//		public void member17() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.emailtextfield().sendKeys(prop.getProperty("mememail"));
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//				try
//	
//				{
//					if (memberspage.roleset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.roleset().click();
//				
//				try
//				{
//					if (memberspage.sendinvite().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				   try
//					{
//						if (memberspage.department().isDisplayed()) {
//		
//						}
//		
//					}catch(Exception e) {
//						Thread.sleep(10000);
//		
//					}
//				   memberspage.department().click();
//					try
//					{
//						if (memberspage.departmentset().isDisplayed()) {
//		
//						}
//		
//					}catch(Exception e) {
//						Thread.sleep(10000);
//					}	
//					memberspage.departmentset().click();
//					try
//					{
//						if (memberspage.sendinvite().isDisplayed()) {
//		
//						}
//		
//					}catch(Exception e) {
//						Thread.sleep(10000);
//					}		
//				memberspage.sendinvite().click();
//	}
//
//		@Test
//		public void member18() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.emailtextfield().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	
//				memberspage.emailtextfield().sendKeys(prop.getProperty("Mememail"));
//				
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//				try
//				{
//				if (memberspage.roleset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.roleset().click();
//				
//				try
//				{
//					if (memberspage.department().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.department().click();
//				
//				try
//				{
//					if (memberspage.departmentset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.departmentset().click();
//				
//				try
//				{
//					if (memberspage.sendinvite().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.sendinvite().click();
//	}
//
//		@Test
//		public void member19() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.emailtextfield().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	
//				memberspage.emailtextfield().sendKeys(prop.getProperty("newemail"));
//				
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//				try
//				{
//				if (memberspage.roleset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.roleset().click();
//				
//				try
//				{
//					if (memberspage.department().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.department().click();
//				
//				try
//				{
//					if (memberspage.departmentset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.departmentset().click();
//				
//				try
//				{
//					if (memberspage.sendinvite().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.sendinvite().click();
//	}
//
//		@Test
//		public void member20() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();	
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.invitemember().click();	
//				
//				try
//				{
//					if (memberspage.invitemember().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				try
//				{
//					if (memberspage.emailtextfield().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	
//				memberspage.emailtextfield().sendKeys(prop.getProperty("Newemail"));
//				
//				try
//				{
//					if (memberspage.role().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.role().click();
//				try
//				{
//				if (memberspage.roleset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.roleset().click();
//				
//				try
//				{
//					if (memberspage.department().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.department().click();
//				
//				try
//				{
//					if (memberspage.departmentset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.departmentset().click();
//				
//				try
//				{
//					if (memberspage.sendinvite().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.sendinvite().click();
//	}

//		@Test
//		public void member21() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member22() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//			
//				memberspage.altnumber().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.altnumber().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	}
//
//		@Test
//		public void member23() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//				memberspage.location().sendKeys(prop.getProperty("location"));
//				
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//	
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.location().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member24() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}				
//				memberspage.whatsapp().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.whatsapp().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member25() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}						
//				memberspage.iqama().sendKeys(prop.getProperty("iqno"));
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	             }
//		}

//		@Test
//		public void member26() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}						
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member27() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}						
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cancle().click();
//				try
//				{
//					if (memberspage.cancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member28() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}						
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cancle().click();
//				try
//				{
//					if (memberspage.cancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.dontcancle().click();
//		}
//
//		@Test
//		public void member29() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}		
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}						
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cancle().click();
//				try
//				{
//					if (memberspage.cancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.yescancle().click();
//		}
//
//		@Test
//		public void member30() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.altnumber().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.altnumber().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.location().sendKeys(prop.getProperty("location"));
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.location().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.whatsapp().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.whatsapp().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.iqama().sendKeys(prop.getProperty("iqno"));
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	             }
//				
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.updateprofile().click();
//				
//				try
//				{
//					if (memberspage.updateprofile().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}

//		@Test
//		public void member31() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.altnumber().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.altnumber().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.location().sendKeys(prop.getProperty("location"));
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.location().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.whatsapp().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.whatsapp().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.iqama().sendKeys(prop.getProperty("iqno"));
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	             }
//				
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.updateprofile().click();
//				
//				try
//				{
//					if (memberspage.updateprofile().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.dontupdate().click();
//		}

//		@Test
//		public void member32() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.altnumber().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.altnumber().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.location().sendKeys(prop.getProperty("location"));
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				
//				memberspage.location().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.location().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.whatsapp().sendKeys(prop.getProperty("number"));
//				try
//				{
//					if (memberspage.whatsapp().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.iqama().sendKeys(prop.getProperty("iqno"));
//				try
//				{
//					if (memberspage.iqama().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	             }
//				
//				memberspage.biography().sendKeys(prop.getProperty("bio"));
//				try
//				{
//					if (memberspage.biography().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.updateprofile().click();
//				
//				try
//				{
//					if (memberspage.updateprofile().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.yesupdate().click();
//		}

//		@Test
//		public void member33() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//		}

//		@Test
//		public void member34() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}	
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//		}

//		@Test
//		public void member35() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}

//		@Test
//		public void member36() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//		}

//		@Test
//		public void member37() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//		}

//		@Test
//		public void member38() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//		}

//		@Test
//		public void member39() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmpdate().click();
//		}

//		@Test
//		public void member40() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//		}

//		@Test
//		public void member41() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpcancle().click();
//		}

//		@Test
//		public void member42() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpcancle().click();
//				try
//				{
//					if (memberspage.cmpdontcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpdontcancle().click();			
//		}

//		@Test
//		public void member43() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();	
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpcancle().click();
//				try
//				{
//					if (memberspage.cmpyescancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpyescancle().click();			
//		}

//		@Test
//		public void member44() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				
//				try
//				{
//					if (memberspage.cmpupdateprofile().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpupdateprofile().click();
//				}

//		@Test
//		public void member45() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				
//				try
//				{
//					if (memberspage.cmpupdateprofile().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpupdateprofile().click();
//				try
//				{
//					if (memberspage.cmpdontupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdontupdate().click();			
//		}

//		@Test
//		public void member46() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				
//				try
//				{
//					if (memberspage.cmpupdateprofile().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpupdateprofile().click();
//				try
//				{
//					if (memberspage.cmpyesupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpyesupdate().click();			
//		}

//		@Test
//		public void member47() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpcancle().click();
//		}

//		@Test
//		public void member48() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpcancle().click();
//				try
//				{
//					if (memberspage.cmpdontcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdontcancle().click();
//		}

//		@Test
//		public void member49() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.comprofile().click();
//				
//				try
//				{
//					if (memberspage.workspace().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.workspace().sendKeys(prop.getProperty("workid"));
//				
//				try
//				{
//					if (memberspage.cmprole().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmprole().click();
//				try
//				{
//					if (memberspage.cmproleset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmproleset().click();
//				
//				try
//				{
//					if (memberspage.cmpdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdepartment().click();
//				
//				try
//				{
//					if (memberspage.cmpdeptset().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdeptset().click();
//				try
//				{
//					if (memberspage.cmpdate().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.cmpdate().click();
//				try
//				{
//					if (memberspage.cmpdateset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.cmpdateset().click();
//				try
//				{
//					if (memberspage.cmpcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpcancle().click();
//				try
//				{
//					if (memberspage.cmpyescancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.cmpyescancle().click();
//		}

//		@Test
//		public void member50() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.vehicletype().click();
//		}
//
//		@Test
//		public void member51() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehicletypeset().click();
//		}

//		@Test
//		public void member52() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();		
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//		}

//		@Test
//		public void member53() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();		
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				
//				memberspage.vehiclecanacle().click();
//		}

//		@Test
//		public void member54() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();		
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehiclecanacle().click();
//				try
//				{
//					if (memberspage.vehicledontcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehicledontcancle().click();
//		}

//		@Test
//		public void member55() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();		
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehiclecanacle().click();
//				try
//				{
//					if (memberspage.vehicleyescancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehicleyescancle().click();
//		}

//		@Test
//		public void member56() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehicleupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehicleupdate().click();
//		}

//		@Test
//		public void member57() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehicleupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehicleupdate().click();
//				try
//				{
//					if (memberspage.vehicledontupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				
//				memberspage.vehicledontupdate().click();
//				}

//		@Test
//		public void member58() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehicleupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehicleupdate().click();
//				try
//				{
//					if (memberspage.vehicleyesupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				
//				memberspage.vehicleyesupdate().click();
//				}
//
//		@Test
//		public void member59() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehiclecanacle().click();
//		}
//
//		@Test
//		public void member60() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehiclecanacle().click();
//				try
//				{
//					if (memberspage.vehicleyescancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				
//				memberspage.vehicleyescancle().click();
//				}
//
//		@Test
//		public void member61() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehicleinfo().click();
//				
//				try
//				{
//					if (memberspage.vehicletype().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehicletype().click();
//				try
//				{
//					if (memberspage.vehicletypeset().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehicletypeset().click();
//				
//				try
//				{
//					if (memberspage.licencenum().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.licencenum().sendKeys(prop.getProperty("num"));
//				
//				try
//				{
//					if (memberspage.vehiclecanacle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				memberspage.vehiclecanacle().click();
//				try
//				{
//					if (memberspage.vehicledontcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//				
//				memberspage.vehicledontcancle().click();
//				}
//
//		@Test
//		public void member62() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//		}
//
//		@Test
//		public void member63() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();			
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));		
//		}
//
//		@Test
//		public void member64() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();			
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);		
//				}					
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehcancle().click();
//		}
//
//		@Test
//		public void member65() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehresetpass().click();
//			}
//
//		@Test
//		public void member66() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehresetpass().click();
//				try
//				{
//					if (memberspage.vehresetdontupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehresetdontupdate().click();
//			}
//
//		@Test
//		public void member67() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehresetpass().click();
//				try
//				{
//					if (memberspage.vehresetyesupdate().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehresetyesupdate().click();
//			}
//
//		@Test
//		public void member68() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehcancle().click();
//			}
//
//		@Test
//		public void member69() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehcancle().click();
//				try
//				{
//					if (memberspage.vehyescancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehyescancle().click();
//			}
//
//		@Test
//		public void member70() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehresetpass().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehcancle().click();
//				try
//				{
//					if (memberspage.vehdontcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}					
//				memberspage.vehdontcancle().click();
//			}
//
//		@Test
//		public void member71() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.edit().click();
//				
//				try
//				{
//					if (memberspage.edit().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.vehresetpassword().click();
//				
//				try
//				{
//					if (memberspage.vehnewpassword().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				memberspage.vehnewpassword().sendKeys(prop.getProperty("Al-password"));
//				try
//				{
//					if (memberspage.vehconfirmpaaword().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehconfirmpaaword().sendKeys(prop.getProperty("password"));
//				
//				try
//				{
//					if (memberspage.vehcancle().isDisplayed()) {
//						
//					}
//				}catch(Exception e) {
//					Thread.sleep(10000);
//						
//				}
//									
//				memberspage.vehcancle().click();
//			}
//
//		@Test
//		public void member72() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.block().click();
//				
//				try
//				{
//					if (memberspage.block().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member73() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.block().click();
//				
//				try
//				{
//					if (memberspage.block().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.dontblock().click();
//				try
//				{
//					if (memberspage.dontblock().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member74() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.block().click();
//				
//				try
//				{
//					if (memberspage.block().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.yesblock().click();
//				try
//				{
//					if (memberspage.yesblock().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member75() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member76() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.admin().click();
//				
//				try
//				{
//					if (memberspage.admin().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member77() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.admin().click();
//				
//				try
//				{
//					if (memberspage.admin().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member78() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.admin().click();
//				
//				try
//				{
//					if (memberspage.admin().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member79() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member80() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member81() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member82() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member83() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member84() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member85() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.technician().click();
//				
//				try
//				{
//					if (memberspage.technician().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member86() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.technician().click();
//				
//				try
//				{
//					if (memberspage.technician().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member87() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.technician().click();
//				
//				try
//				{
//					if (memberspage.technician().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member88() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }            
//		}
//
//		@Test
//		public void member89() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            } 
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }		
//		}
//
//		@Test
//		public void member90() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            } 
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member91() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            } 
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member92() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//		}
//
//		@Test
//		public void member93() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}	
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member94() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}	
//		}
//
//		@Test
//		public void member95() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member96() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().clear();
//		}
//
//		@Test
//		public void member97() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().clear();
//		}
//
//		@Test
//		public void member98() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//		}
//
//		@Test
//		public void member99() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member100() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member101() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.blocked().click();
//				try
//				{
//					if (memberspage.blocked().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//		}
//
//		@Test
//		public void member102() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.blocked().click();
//				try
//				{
//					if (memberspage.blocked().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member103() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.blocked().click();
//				try
//				{
//					if (memberspage.blocked().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member104() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//		}
//
//		@Test
//		public void member105() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member106() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member107() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.expired().click();
//				try
//				{
//					if (memberspage.expired().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}			
//		}
//
//		@Test
//		public void member108() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.expired().click();
//				try
//				{
//					if (memberspage.expired().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filterapply().click();
//		}
//
//		@Test
//		public void member109() throws InterruptedException, AWTException {
//	
//	
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.expired().click();
//				try
//				{
//					if (memberspage.expired().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.filtercancle().click();
//		}
//
//		@Test
//		public void member110() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.admin().click();
//				
//				try
//				{
//					if (memberspage.admin().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filterapply().click();
//				try
//				{
//					if (memberspage.filterapply().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member111() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filterapply().click();
//				try
//				{
//					if (memberspage.filterapply().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member112() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filterapply().click();
//				try
//				{
//					if (memberspage.filterapply().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member113() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filterapply().click();
//				try
//				{
//					if (memberspage.filterapply().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member114() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.technician().click();
//				try
//				{
//					if (memberspage.technician().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filterapply().click();
//				try
//				{
//					if (memberspage.filterapply().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member115() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.admin().click();
//				
//				try
//				{
//					if (memberspage.admin().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filtercancle().click();
//				try
//				{
//					if (memberspage.filtercancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//
//		@Test
//		public void member116() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filtercancle().click();
//				try
//				{
//					if (memberspage.filtercancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member117() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.manager().click();
//				
//				try
//				{
//					if (memberspage.manager().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.pending().click();
//				try
//				{
//					if (memberspage.pending().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filtercancle().click();
//				try
//				{
//					if (memberspage.filtercancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member118() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.active().click();
//				try
//				{
//					if (memberspage.active().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filtercancle().click();
//				try
//				{
//					if (memberspage.filtercancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member119() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterby().click();
//				
//				try
//				{
//					if (memberspage.filterby().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.supervisor().click();
//				
//				try
//				{
//					if (memberspage.supervisor().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				memberspage.filterdepartment().click();
//				try
//				{
//					if (memberspage.filterdepartment().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	            }
//				
//				memberspage.filterdepart().click();
//				try
//				{
//					if (memberspage.filterdepart().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(prop.getProperty("area"));
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ARROW_DOWN);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.responsiblearea().sendKeys(org.openqa.selenium.Keys.ENTER);
//				try
//				{
//					if (memberspage.responsiblearea().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				memberspage.technician().click();
//				try
//				{
//					if (memberspage.technician().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.filtercancle().click();
//				try
//				{
//					if (memberspage.filtercancle().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member120() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//	
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.download().click();
//				
//				try
//				{
//					if (memberspage.download().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//		}
//
//		@Test
//		public void member121() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.download().click();
//				
//				try
//				{
//					if (memberspage.download().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}	
//	            memberspage.downloadasexcel().click();
//				
//				try
//				{
//					if (memberspage.downloadasexcel().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member122() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.download().click();
//				
//				try
//				{
//					if (memberspage.download().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//	            memberspage.downloadaspdf().click();
//				
//				try
//				{
//					if (memberspage.downloadaspdf().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member123() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//				
//			}
//				js.executeScript("window.scroll(0,2500)");
//				try
//				{
//					if (memberspage.page2().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//	
//				}
//		
//				memberspage.page2().click();
//				try
//				{
//					if (memberspage.page3().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.page4().click();
//	           
//				try
//				{
//					if (memberspage.page5().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member124() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//				
//			}
//				js.executeScript("window.scroll(0,2500)");
//				try
//				{
//					if (memberspage.page2().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//	
//				}
//		
//				memberspage.page3().click();
//				try
//				{
//					if (memberspage.page4().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.page4().click();
//	           
//				try
//				{
//					if (memberspage.page5().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member125() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//				
//			}
//				js.executeScript("window.scroll(0,2500)");
//				try
//				{
//					if (memberspage.page2().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//	
//				}
//		
//				memberspage.page4().click();
//				try
//				{
//					if (memberspage.page5().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.page5().click();
//	           
//				try
//				{
//					if (memberspage.page6front().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//		@Test
//		public void member126() throws InterruptedException, AWTException {
//	
//			Loginpage signinpage = new Loginpage(driver);
//			Memberspage memberspage = new Memberspage(driver);
//			
//			Robot robot = new Robot();
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			System.out.println("About to zoom out");
//			for (int i = 0; i < 4; i++) {
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_SUBTRACT);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//			}
//			log.debug("Page is zoomed out");
//	
//			try
//			{
//				if (signinpage.emailtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//			try
//			{
//				if (signinpage.passwordtextfield().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//	
//			signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//			try
//			{
//				if (signinpage.signinbutton().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//			signinpage.signinbutton().click();
//			
//			try
//			{
//				if (memberspage.members().isDisplayed()) {
//	
//				}
//	
//			}catch(Exception e) {
//				Thread.sleep(10000);
//	
//			}
//			
//				memberspage.members().click();
//				
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//	
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//	
//				}
//				
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				try
//				{
//					if (memberspage.members().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//				
//			}
//				js.executeScript("window.scroll(0,2500)");
//				try
//				{
//					if (memberspage.page2().isDisplayed()) {
//						Thread.sleep(5000);
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(5000);
//	
//				}
//		
//				memberspage.page3().click();
//				try
//				{
//					if (memberspage.page5().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//				
//				memberspage.page5().click();
//	           
//				try
//				{
//					if (memberspage.page8back().isDisplayed()) {
//						
//					}
//	
//				}catch(Exception e) {
//					Thread.sleep(10000);
//				}
//		}
//
//	@Test
//	public void member127() throws InterruptedException, AWTException {
//		Loginpage signinpage = new Loginpage(driver);
//		Memberspage memberspage = new Memberspage(driver);
//
//		Robot robot = new Robot();
//		try
//		{
//			if (signinpage.emailtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
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
//			if (signinpage.emailtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//		try
//		{
//			if (signinpage.passwordtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//		try
//		{
//			if (signinpage.signinbutton().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.signinbutton().click();
//
//		try
//		{
//			if (memberspage.members().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberspage.members().click();
//
//		try
//		{
//			if (memberspage.members().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		try
//		{
//			if (memberspage.members().isDisplayed()) {
//				Thread.sleep(5000);
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(5000);
//
//		}
//		js.executeScript("window.scroll(0,2500)");
//		try
//		{
//			if (memberspage.page2().isDisplayed()) {
//				Thread.sleep(5000);
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(5000);
//
//		}
//
//		memberspage.page3().click();
//		try
//		{
//			if (memberspage.page5().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//
//		memberspage.page6front().click();
//
//		try
//		{
//			if (memberspage.page8back().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//
//
//		String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]")).getText();
//		try
//		{
//			if (memberspage.count().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		System.out.println("All members"+text);
//	}
//
//
//
//	@Test
//	public void member128() throws InterruptedException, AWTException {
//
//		Loginpage signinpage = new Loginpage(driver);
//		Memberspage memberspage = new Memberspage(driver);
//
//		Robot robot = new Robot();
//		try
//		{
//			if (signinpage.emailtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
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
//			if (signinpage.emailtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.emailtextfield().sendKeys(prop.getProperty("Al-email"));
//		try
//		{
//			if (signinpage.passwordtextfield().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.passwordtextfield().sendKeys(prop.getProperty("Al-password"));
//		try
//		{
//			if (signinpage.signinbutton().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		signinpage.signinbutton().click();
//
//		try
//		{
//			if (memberspage.members().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//
//		memberspage.members().click();
//
//		try
//		{
//			if (memberspage.members().isDisplayed()) {
//
//			}
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//
//		}
//		
//		org.apache.logging.log4j.Logger log;
//		
//		String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]")).getText();
//		try
//		{
//			if (memberspage.count().isDisplayed()) {
//
//			} 
//
//		}catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		System.out.println("All members"+text);
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

//		@AfterMethod
//		public void close() {
//			driver.close();
//			log.debug("Browser got closed");
//		}


}
