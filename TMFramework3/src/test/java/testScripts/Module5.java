package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg104_EmergencyContacts;
import applicationPages.Pg105_DependencyDetails;
import applicationPages.Pg106_ImmigartionPage;
import applicationPages.Pg107_QualificationPage;
import frameworkLibrary.BaseClass;

public class Module5 extends BaseClass
{
@Test()
public void TC501()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnQualification();
	Pg107_QualificationPage qualification= new Pg107_QualificationPage(driver);
	qualification.clickOnAdd();
	qualification.SetCompanyName("CGS");
	qualification.SetTitle("software");
	qualification.setExpFromDate("2018-04-20");
	qualification.ClickFromDate();
	qualification.SetExpToDate("2019-03-22");
	qualification.ClickToDate();
	qualification.SetComments("able to enter the comments");
	qualification.ClickSavebtn();
	homepage.Logout();
    driver.quit();
}

@Test()
public void TC502()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnQualification();
	Pg107_QualificationPage qualification= new Pg107_QualificationPage(driver);
	qualification.ClicAddEducation();
	qualification.ClickSelectLevel("MCA");
	qualification.SetInstute("JNTU");
	qualification.SetMajorSpecialization("Computers");
	qualification.SetEducationYear("2014");
	qualification.SetGPAScore("75");
	qualification.SetEduStartDAte("2014-05-06");
	qualification.ClickEduStartDate();
	qualification.SetEduEndDate("2016-06-07");
	qualification.ClickEduEndDate();
	qualification.ClickEducationSavebtn();
	homepage.Logout();
   driver.quit();
}
@Test()
public void TC503()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnQualification();
	Pg107_QualificationPage qualification= new Pg107_QualificationPage(driver);
	qualification.ClickSkillAdd();
	qualification.ClickSetSkills("QTP");
	qualification.SetYearOfExp("5");
	qualification.SetTextArea("comments box ");
	qualification.ClickSkillSavebtn();
	homepage.Logout();
    driver.quit();
}
@Test()
public void TC504()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnQualification();
	Pg107_QualificationPage qualification= new Pg107_QualificationPage(driver);
	qualification.ClicAddLanguage();
	qualification.SetLanguage("English");
	qualification.SetFlunce("Reading");
	qualification.SetCompentency("Good");
	qualification.SetLanguageComments("Entered the comments in language");
	qualification.ClickLanguageSavebtn();
	homepage.Logout();
    driver.quit();
	
	}
/*@Test()
public void TC505()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnQualification();
	Pg107_QualificationPage qualification= new Pg107_QualificationPage(driver);
	qualification.ClicAddLicence();
	qualification.clickLicenceType("Driving License");
	qualification.SetLicencNumber("123456");
	qualification.SetLicenceIssueDate("2019-02-25");
	qualification.ClicklicenceIssuedate();
	qualification.SetLicenceExpDate("2020-05-25");
	qualification.ClicklicenceExpiredate();
	qualification.ClickLicenceSavebtn();
	homepage.Logout();
    driver.quit();
}*/
}