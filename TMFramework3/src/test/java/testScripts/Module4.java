package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg104_EmergencyContacts;
import applicationPages.Pg105_DependencyDetails;
import applicationPages.Pg106_ImmigartionPage;
import frameworkLibrary.BaseClass;

public class Module4 extends BaseClass
{
	@Test
	public void TC401()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
		loginpage.setUsername("ankit3");
		loginpage.setPassword("abcd1234");
		loginpage.clickOnLogin();

		Pg102_HomePage homepage = new Pg102_HomePage(driver);
		homepage.clickOnMyInfo();
		homepage.ClickOnImmigration();
		Pg106_ImmigartionPage Immigration= new Pg106_ImmigartionPage(driver);
		Immigration.ClickAddBtn();
		Immigration.SelectDocType();
		Immigration.SetNumber("123456");
		Immigration.SetIssueDate("2018-06-26");
		Immigration.ClickIssueDate();
		Immigration.SetExpireDate("2018-11-19");
		Immigration.ClickExpireDate();
		Immigration.SetEligibleCiteria("Inactive");
		Immigration.SetIssueLocation("India");
		Immigration.SetReviewDate("2019-04-20");
		Immigration.ClickRevieweDate();
		Immigration.SetComments("completed sucessfully");
		Immigration.ClicksaveBtn();
		homepage.Logout();

		driver.quit();
	}

@Test()
public void TC402()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	
	Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
	loginpage.setUsername("ankit3");
	loginpage.setPassword("abcd1234");
	loginpage.clickOnLogin();

	Pg102_HomePage homepage = new Pg102_HomePage(driver);
	homepage.clickOnMyInfo();
	homepage.ClickOnImmigration();
	Pg106_ImmigartionPage Immigration= new Pg106_ImmigartionPage(driver);
	Immigration.clickCheckbox();
	Immigration.ClickDelete();
	homepage.Logout();

	driver.quit();
}
}

