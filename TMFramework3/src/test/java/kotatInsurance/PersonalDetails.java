package kotatInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import applicationPages.HRMBasePage;

public class PersonalDetails extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	WebDriver driver;
	boolean stepstatus; 
public PersonalDetails(WebDriver Driverinstance)
{
	this.driver=Driverinstance;
	PageFactory.initElements(Driverinstance, this);
}
//First Name
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txt_fname']")
WebElement FirstName;
public void SetFirstName(String FName)
{
	stepstatus= setText(FirstName, FName);
	reportEvent(stepstatus, "Able to Enter the FirstName", "Unable to Enter the FirstName", driver);
}
// Last Name
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txt_lname']")
WebElement LastName;
public void SetLastName(String lName)
{
	stepstatus= setText(LastName, lName);
	reportEvent(stepstatus, "Able to Enter the lastName", "Unable to Enter the lastName", driver);
}
//DOB
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txtDOB_dd']")
WebElement DOBdd;
public void SetDOBdd(String dd)
{
	stepstatus= setText(DOBdd, dd);
	reportEvent(stepstatus, "Able to Enter the date", "Unable to Enter the date", driver);
}
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txtDOB_mm']")
WebElement DOBmm;
public void SetDOBmm(String mm)
{
	stepstatus= setText(DOBmm, mm);
	reportEvent(stepstatus, "Able to Enter the month", "Unable to Enter the month", driver);
}
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txtDOB_yyyy']")
WebElement DOByy;
public void SetDOByyyy(String yy)
{
	stepstatus= setText(DOByy, yy);
	reportEvent(stepstatus, "Able to Enter the year", "Unable to Enter the year", driver);
}
//Channel type

public WebElement SelectChannelType(String channel)
{
	return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_chnltype']/option[text()='%s']", channel)));
}

public void ClickChanelType(String chh)
{
	stepstatus=clickElement(SelectChannelType(chh));
	reportEvent(stepstatus, "Able to selec the ChanelType", "Unable to selec the ChanelType", driver);
}

//mobile number
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_txt_mno']")
WebElement phone;
public void SetPhone(String phone1)
{
	stepstatus= setText(phone, phone1);
	reportEvent(stepstatus, "Able to Enter the phone", "Unable to Enter the phone", driver);
}
// Agent Branch Location

public WebElement SelectAgentBranch(String AgentB)
{
	return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_fromstate']/option[text()='%s']", AgentB)));
}

public void ClickAgentBranch(String AgentBranch)
{
	stepstatus=clickElement(SelectAgentBranch(AgentBranch));
	reportEvent(stepstatus, "Able to selec the AgentBranch", "Unable to selec the AgentBranch", driver);
}
//To State

public WebElement SelectToState(String ToState)
{
	return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_tostate']/option[text()='%s']", ToState)));
}

public void ClickToState(String ToState)
{
	stepstatus=clickElement(SelectToState(ToState));
	reportEvent(stepstatus, "Able to selec the ToState", "Unable to selec the ToState", driver);
}

//payemnt Mode
public WebElement SelectPaymentMode(String payment)
{
	return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_drpmodeofpayment']/option[text()='%s']", payment)));
}

public void ClickPaymentMode(String paymentmode)
{
	stepstatus=clickElement(SelectPaymentMode(paymentmode));
	reportEvent(stepstatus, "Able to selec the Paymentmode", "Unable to selec the PaymentMode", driver);
}
@FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_imgbtn_personalcontinue']")
WebElement next1;
public void ClickNext()
{
	stepstatus=clickElement(next1);
	reportEvent(stepstatus, "Able to click Next","Unablt to click next",driver);
}
public String BenfitValue() 
{
	
	String st=driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_gv_coverdetails_lblTotal']")).getText();
	return st;
}
//new one
public void BenefiDisplay()
{
	System.out.println(BenfitValue());
}
}
