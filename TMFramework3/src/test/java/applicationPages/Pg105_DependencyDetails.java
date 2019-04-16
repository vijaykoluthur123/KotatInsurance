package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg105_DependencyDetails extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	
	WebDriver driver;
	boolean stepstatus;
	
	public Pg105_DependencyDetails(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.XPATH,using="//input[@id='btnAddDependent']")
WebElement ClickAdd;

public void ClickOnAdd()
{
	stepstatus=clickElement(ClickAdd);
	reportEvent(stepstatus, "Able to click on Add button", "Unable to click on Add Button", driver);

}

@FindBy(how=How.XPATH,using="//input[@name='dependent[name]']")
WebElement dependName;

public void setDependName(String Name)
{
	stepstatus= setText(dependName, Name);
	reportEvent(stepstatus, "Able to Enter the Name", "Unable to enter the Name", driver);
}
public WebElement Relationship(String relation)
{
	return driver.findElement(By.xpath(String.format("//select[@name='dependent[relationshipType]']/option[text()='%s']", relation)));
}
public void SetRelationship(String relations)
{
	stepstatus=clickElement(Relationship(relations));
	reportEvent(stepstatus, "Able to click on Relationship", "Unable to click on Relationship", driver);
	
}
	@FindBy(how=How.XPATH,using="//input[@id='dependent_dateOfBirth']")
	WebElement dateofbirth;
	
	public void SetDateofBirth(String date1)
	{
		stepstatus=setText(dateofbirth, date1);
		reportEvent(stepstatus, "Able to enter the date of birth", "Unable to Enter the date of Birth", driver);
	}
	
	@FindBy(how=How.XPATH,using="//img[@class='ui-datepicker-trigger']")
	WebElement dateofb;
	public void ClickOnDateofBirth()
	{
		stepstatus=clickElement(dateofb);
		reportEvent(stepstatus, "Able to click on Birht", "Unablt to click on Birth", driver);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='btnSaveDependent']")
	WebElement savebtn;
	
	public void ClickOnSave()
	{
		stepstatus=clickElement(savebtn);
		reportEvent(stepstatus, "Able to click on Save button", "Unablt to click on Save button", driver);
	}
}
