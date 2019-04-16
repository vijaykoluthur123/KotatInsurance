package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import applicationPages.Pg101_LoginPage;
import applicationPages.Pg102_HomePage;
import applicationPages.Pg104_EmergencyContacts;
import applicationPages.Pg105_DependencyDetails;
import frameworkLibrary.BaseClass;

public class Module3 extends BaseClass
{
	@Test
	public void TC301()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		Pg101_LoginPage loginpage = new Pg101_LoginPage(driver);
		loginpage.setUsername("ankit3");
		loginpage.setPassword("abcd1234");
		loginpage.clickOnLogin();

		Pg102_HomePage homepage = new Pg102_HomePage(driver);
		homepage.clickOnMyInfo();
		homepage.ClickOnDependency();
		Pg105_DependencyDetails dependency=new Pg105_DependencyDetails(driver);
		dependency.ClickOnAdd();
		dependency.setDependName("Abhinav");
		dependency.SetRelationship("Child");
		dependency.SetDateofBirth("2019-12-05");
		dependency.ClickOnDateofBirth();
		dependency.ClickOnSave();		
		
		homepage.Logout();

		driver.quit();
	}
}
