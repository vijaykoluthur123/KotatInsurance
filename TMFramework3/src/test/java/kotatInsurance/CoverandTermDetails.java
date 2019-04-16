package kotatInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import applicationPages.HRMBasePage;

public class CoverandTermDetails extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	WebDriver driver;
	boolean stepstatus;
	public CoverandTermDetails(WebDriver drivrele)
	{
		this.driver= drivrele;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txtpremium']")
	WebElement Premium;
	public void SetPremium(String prem)
	{
		stepstatus=setText(Premium, prem);
		reportEvent(stepstatus, "Able to Enter the Premium", "Unablt to enter the premium" , driver);
	}
	// policy term
	public WebElement SelectPolicyTerm(String pterm)
	{
		return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_premium']/option[text()='%s']", pterm)));
	}

	public void ClickPolicyTeam(String plicyterm)
	{
		stepstatus=clickElement(SelectPolicyTerm(plicyterm));
		reportEvent(stepstatus, "Able to selec the policy term", "Unable to selec the policy term", driver);
	}
	//premium payment term
	public WebElement SelectPremiumpayment(String ppayment)
	{
		return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_premiumpaymentterm']/option[text()='%s']", ppayment)));
	}

	public void ClickPremiumpaymentterm(String ppayterm)
	{
		stepstatus=clickElement(SelectPremiumpayment(ppayterm));
		reportEvent(stepstatus, "Able to selec the payment term", "Unable to selec the payment term", driver);
	}
	// premiumpaymentFrequency
	public WebElement SelectPremiumFrequency(String ppaymentfreq)
	{
		return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_premiumpaymentfreq']/option[text()='Yearly']", ppaymentfreq)));
	}

	public void ClickPremiumpaymentfrequency(String ppatemfreq)
	{
		stepstatus=clickElement(SelectPremiumFrequency(ppatemfreq));
		reportEvent(stepstatus, "Able to selec the payment frequency", "Unable to selec the payment frequency", driver);
	}
	//click next2
	@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_imgbtn_Continuefund']")
	WebElement clicknext2;
	public void ClickNext2()
	{
		stepstatus=clickElement(clicknext2);
		reportEvent(stepstatus, "Able to click next2", "Unable to click next2", driver);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_imgbtn_Calculateothdetails']")
	WebElement calc;
	public void ClickCalculate()
	{
		stepstatus=clickElement(calc);
		reportEvent(stepstatus, "Able to click Calclate", "Unble to click calculate", driver);
	}
	
	
}
