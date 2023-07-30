package pageobjects;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resourcee.Base;

public class Memberspage extends Base {
	
	public WebDriver driver;

	public Memberspage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/a[2]")
	WebElement members;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/h5")
	WebElement allmembers;
	
	@FindBy(id="doc_searchQueryInput")
	WebElement searchmembers;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div")
	WebElement button;
	
	@FindBy(xpath="//*[@id=\"sortDropDown\"]/div/div[2]/h6[1]")
	WebElement added;
	
	@FindBy(xpath="//*[@id=\"sortDropDown\"]/div/div[2]/h6[2]")
	WebElement update;
	
	@FindBy(xpath="//*[@id=\"sortDropDown\"]/div/div[2]/h6[3]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"sortDropDown\"]/div/div[2]/h6[4]")
	WebElement zname;
	
	@FindBy(xpath="//*[@id=\"sortDropDown\"]/div/div[2]/h6[5]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[2]")
	WebElement filter;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/a/button")
	WebElement invitemember;
	
	@FindBy(name="email")
	WebElement emailtextfield;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div/div/form/div[2]/div/div/div[1]")
	WebElement role;
	
	@FindBy(id="react-select-2-listbox")
	WebElement roleset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div/div/form/div[3]/div/div/div[2]")
	WebElement department;
	
	@FindBy(id="react-select-3-listbox")
	WebElement departmentset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div/div/form/button")
	WebElement sendinvite;
	
	@FindBy(xpath="//*[@id=\"download-content\"]/div/table/tbody/tr[2]/td[6]/div/div[1]")
	WebElement edit;
	
	
	@FindBy(name="alternate_number")
	WebElement altnumber;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[3]/div[1]/div/div[1]/input")
	WebElement location;		
	
	@FindBy(name="whatsapp_number")
	WebElement whatsapp;
	
	@FindBy(name="iqama_no")
	WebElement iqama;
	
	@FindBy(name="biography")
	WebElement biography;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[2]")
	WebElement updateprofile;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement dontupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement yesupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[1]")
	WebElement cancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement dontcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement yescancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[2]/a")
	WebElement comprofile;
	
	@FindBy(name="work_space_id")
	WebElement workspace;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/div/div[1]/div/div[1]")
	WebElement cmprole;
	
	@FindBy(id="react-select-2-listbox")
	WebElement cmproleset;
	
	@FindBy(name="date_of_joining")
	WebElement cmpdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/div/div[1]/div[2]")
	WebElement cmpdateset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div/div[1]")
	WebElement cmpdepartment;
	
	@FindBy(id="react-select-3-listbox")
	WebElement cmpdeptset;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[2]")
	WebElement cmpupdateprofile;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement cmpdontupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement cmpyesupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[1]")
	WebElement cmpcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement cmpdontcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement cmpyescancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[3]/a")
	WebElement vehicleinfo;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/div")
	WebElement vehicletype;
	
	@FindBy(id="react-select-2-listbox")
	WebElement vehicletypeset;
	
	@FindBy(name="number")
	WebElement licencenum;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[2]")
	WebElement vehicleupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement vehicledontupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement vehicleyesupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[1]")
	WebElement vehiclecanacle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement vehicledontcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement vehicleyescancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[4]/a")
	WebElement vehresetpassword;
	
	@FindBy(name="password")
	WebElement vehnewpassword;
	
	@FindBy(name="password_confirmation")
	WebElement vehconfirmpaaword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[2]")
	WebElement vehresetpass;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement vehresetdontupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement vehresetyesupdate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/button[1]")
	WebElement vehcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[1]")
	WebElement vehdontcancle;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/h6[2]")
	WebElement vehyescancle;
	
	@FindBy(xpath="//*[@id=\"download-content\"]/div/table/tbody/tr[1]/td[6]/div/div[2]")
	WebElement block;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/h6[1]")
	WebElement dontblock;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/h6[2]")
	WebElement yesblock;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div")
	WebElement filterby;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[2]/div/h6[1]")
	WebElement admin;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[2]/div/h6[2]")
	WebElement manager;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[2]/div/h6[3]")
	WebElement supervisor;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[2]/div/h6[4]") 
	WebElement technician;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[3]/div")
	WebElement filterdepartment;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[3]/div/div/div")
	WebElement filterdepart;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[4]/div/div/input")
	WebElement responsiblearea;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[5]/div/h6[1]")
	WebElement active;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[5]/div/h6[2]")
	WebElement blocked;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[5]/div/h6[3]")
	WebElement expired;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[5]/div/h6[4]")
	WebElement pending;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[6]/button[1]")
	WebElement filtercancle;
	
	@FindBy(xpath="//*[@id=\"filterDropDown\"]/div/div[6]/button[2]")
	WebElement filterapply;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[3]")
	WebElement download;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div/div/div[1]")
	WebElement downloadasexcel;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div/div/div[2]")
	WebElement downloadaspdf;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[1]")
	WebElement page1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[2]")
	WebElement page2;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[3]")
	WebElement page3;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[4]")
	WebElement page4;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[5]")
	WebElement page5;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[6]")
	WebElement page6front;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[7]")
	WebElement page7front;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[2]")
	WebElement page8back;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[4]/div[2]/div[1]")
	WebElement page9back;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]")
	WebElement count;
			
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement members() {
		return members;
	}
	public WebElement allmembers() {
		return allmembers;
	}
	public WebElement searchmembers() {
		return searchmembers;
	}
	public WebElement button() {
		return button;
	}
	public WebElement added() {
		return added;
	}
	public WebElement update() {
		return update;
	}
	public WebElement name() {
		return name;
	}
	public WebElement zname() {
		return zname;
	}
	public WebElement date() {
		return date;
	}
	public WebElement filter() {
		return filter;
	}
	public WebElement invitemember() {
		return invitemember;
	}
	public WebElement emailtextfield() {
		return emailtextfield;
	}
	public WebElement role() {
		return role;
	}
	public WebElement roleset() {
		return roleset;
	}
	public WebElement department() {
		return department;
	}
	public WebElement departmentset() {
		return departmentset;	
	}
	public WebElement sendinvite() {
		return sendinvite;
	}
	public WebElement edit() {
		return edit;
	}
	public WebElement altnumber() {
		return altnumber;
	}
	public WebElement location() {
		return location;
	}
	public WebElement whatsapp() {
		return whatsapp;
	}
	public WebElement iqama() {
		return iqama;
	}
	public WebElement biography() {
		return biography;
	}
	public WebElement updateprofile() {
		return updateprofile;
	}
	public WebElement dontupdate() {
		return dontupdate;
	}
	public WebElement yesupdate() {
		return yesupdate;
	}
	public WebElement cancle() {
		return cancle;
	}
	public WebElement dontcancle() {
		return dontcancle;
	}
	public WebElement yescancle() {
		return yescancle;
	}
	public WebElement comprofile() {
		return comprofile;
	}
	public WebElement workspace() {
		return workspace;
	}
	public WebElement cmprole() {
		return cmprole;
	}
	public WebElement cmproleset() {
		return cmproleset;
	}
	public WebElement cmpdate() {
		return cmpdate;
	}
	public WebElement cmpdateset() {
		return cmpdateset;
	}
	public WebElement cmpdepartment() {
		return cmpdepartment;
	}
	public WebElement cmpdeptset() {
		return cmpdeptset;
	}
	public WebElement cmpupdateprofile() {
		return cmpupdateprofile;
	}
	public WebElement  cmpdontupdate() {
		return  cmpdontupdate;
	}
	public WebElement cmpyesupdate() {
		return cmpyesupdate;
	}
	public WebElement cmpcancle() {
		return cmpcancle;
	}
	public WebElement cmpdontcancle() {
		return cmpdontcancle;
	}
	public WebElement cmpyescancle() {
		return cmpyescancle;
	}
	public WebElement vehicleinfo() {
		return vehicleinfo;
	}
	public WebElement vehicletype() {
		return vehicletype;
	}
	public WebElement vehicletypeset() {
		return vehicletypeset;
	}
	public WebElement licencenum() {
		return licencenum;
	}
	public WebElement vehicleupdate() {
		return vehicleupdate;
	}
	public WebElement vehicledontupdate() {
		return vehicledontupdate;
	}
	public WebElement vehicleyesupdate() {
		return vehicleyesupdate;
	}
	public WebElement vehiclecanacle() {
		return vehiclecanacle;
	}
	public WebElement vehicledontcancle() {
		return vehicledontcancle;
	}
	public WebElement vehicleyescancle() {
		return vehicleyescancle;
	}
	public WebElement vehresetpassword() {
		return vehresetpassword;
	}
	public WebElement vehnewpassword() {
		return vehnewpassword;
	}
	public WebElement vehconfirmpaaword() {
		return vehconfirmpaaword;
	}
	public WebElement vehresetpass() {
		return vehresetpass;
	}
	public WebElement vehresetdontupdate() {
		return vehresetdontupdate;
	}
	public WebElement vehresetyesupdate() {
		return vehresetyesupdate;
	}
	public WebElement vehcancle() {
		return vehcancle;
	}
	public WebElement vehdontcancle() {
		return vehdontcancle;
	}
	public WebElement vehyescancle() {
		return vehyescancle;
	}
	public WebElement block() {
		return block;
	}
	public WebElement dontblock() {
		return dontblock;
	}
	public WebElement yesblock() {
		return yesblock;
	}
	public WebElement filterby() {
		return filterby;
	}
	public WebElement admin() {
		return admin;
	}
	public WebElement manager() {
		return manager;
	}
	public WebElement supervisor() {
		return supervisor;
	}
	public WebElement technician() {
		return technician;
	}
	public WebElement filterdepartment() {
		return filterdepartment;
	}
	public WebElement filterdepart() {
		return filterdepart;
	}
	public WebElement responsiblearea() {
		return responsiblearea;
	}
	public WebElement active() {
		return active;
	}
	public WebElement blocked() {
		return blocked;
	}
	public WebElement expired() {
		return expired;
	}
	public WebElement pending() {
		return pending;
	}
	public WebElement filtercancle() {
		return filtercancle;
	}
	public WebElement filterapply() {
		return filterapply;
	}
	public WebElement download() {
		return download;
	}
	public WebElement  downloadasexcel() {
		return  downloadasexcel;
	}
	public WebElement downloadaspdf() {
		return downloadaspdf;
	}
	public WebElement page1() {
		return page1;
	}
	public WebElement page2() {
		return page2;
	}
	public WebElement page3() {
		return page3;
	}
	public WebElement page4() {
		return page4;
	}
	public WebElement page5() {
		return page5;
	}
	public WebElement page6front() {
		return page6front;
	}
	public WebElement page7front() {
		return page7front;
	}
	public WebElement page8back() {
		return page8back;
	}
	public WebElement page9back() {
		return page9back;
	}
	public WebElement count() {
		return count;
	}
	
}

	
