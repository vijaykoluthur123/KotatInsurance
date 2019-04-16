package testScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import frameworkLibrary.BaseClass;
import kotatInsurance.CalculatePremium;
import kotatInsurance.CoverandTermDetails;
import kotatInsurance.PersonalDetails;

public class Module6_kotakInsurance extends BaseClass
{
@Test()
public void TC601() throws InterruptedException, IOException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
	System.setProperty("webdriver.chrome.driver","C:/Users/Vijay Koluthur/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://insurance.kotak.com/insurance-plans/protection-plans/kotak-saral-suraksha");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	CalculatePremium premium= new CalculatePremium(driver);
	try{
	premium.CalculatePremium1();
	Thread.sleep(100);

	Set <String> str1= driver.getWindowHandles();
	for (String wind : str1) {
		driver.switchTo().window(wind);
		String title=driver.getTitle();
		if(title.equals("Protect Your Family With Saral Suraksha Term Plan | Kotak Life Insurance"))
		{
			Thread.sleep(300);
			driver.close();
		}
			}
	Thread.sleep(300);
	String st=driver.getTitle();
	System.out.println(st);
	}catch (UnhandledAlertException f){
	
Alert ale=driver.switchTo().alert();
ale.accept();
	}catch (NoAlertPresentException e)
	{
		e.printStackTrace();
	}
Thread.sleep(1000);
premium.ClickValueforProduct("Traditional Plans");
Thread.sleep(1000);
premium.ClickProduct("Kotak Assured Savings Plan");
Thread.sleep(1000);
premium.clickProceed();
PersonalDetails ps=new PersonalDetails(driver);
ps.SetFirstName("Vijay");
ps.SetLastName("Koluthur");
ps.SetDOBdd("19");
ps.SetDOBmm("02");
ps.SetDOByyyy("1990");
ps.ClickChanelType("Individual Agent");
Thread.sleep(300);
ps.SetPhone("9912345679");
ps.ClickAgentBranch("Telangana");
ps.ClickToState("Telangana");
ps.ClickPaymentMode("Cash");
Thread.sleep(300);
ps.ClickNext();	

CoverandTermDetails coverterm=new CoverandTermDetails(driver);
Thread.sleep(1000);
coverterm.SetPremium("50000");
coverterm.ClickPolicyTeam("20");
coverterm.ClickPremiumpaymentterm("7");
coverterm.ClickPremiumpaymentfrequency("Yearly");
Thread.sleep(300);
coverterm.ClickNext2();
Thread.sleep(1000);
coverterm.ClickPremiumpaymentterm("7");
coverterm.ClickPremiumpaymentfrequency("Yearly");
Thread.sleep(1000);
coverterm.ClickNext2();
Thread.sleep(1000);
coverterm.ClickCalculate();
Thread.sleep(1000);
ps.BenefiDisplay();
//added code 
	
	
}
}

