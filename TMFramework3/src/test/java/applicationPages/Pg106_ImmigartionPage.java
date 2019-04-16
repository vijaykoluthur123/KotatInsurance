package applicationPages;

import java.lang.reflect.Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg106_ImmigartionPage extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	
	WebDriver driver;
	boolean stepstatus;
	
	public Pg106_ImmigartionPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(how=How.XPATH,using="//input[@id='btnAdd']")
WebElement addbtn;
 public void ClickAddBtn()
 {
	 stepstatus=clickElement(addbtn);
	 reportEvent(stepstatus, "Able to click on Add button", "Unablt to click on add Button", driver);
 }
	@FindBy(how=How.XPATH,using="//input[@id='immigration_type_flag_1']")
	WebElement doctype;
	public void SelectDocType()
	{
		stepstatus=clickElement(doctype);
		reportEvent(stepstatus, "Able to click document type", "Unabl to Click Document type", driver);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='immigration[number]']")
	WebElement Number1;
	public void SetNumber(String Number)
	{
		stepstatus=setText(Number1, Number);
		reportEvent(stepstatus, "Able to Enter the Number" , "Uable to Enter the Number", driver);
			}
     @FindBy(how=How.XPATH,using="//input[@id='immigration_passport_issue_date']")
WebElement issuedate;
     public void SetIssueDate(String date2)
     {
    	 stepstatus=setText(issuedate, date2);
    	 reportEvent(stepstatus, "Able to Enter the Issuedate", "Unable to enter the Issue Date", driver);
     }
     @FindBy(how=How.XPATH,using="(//li//child::img)[position()=1]")
     WebElement ClickIssudt;
     public void ClickIssueDate()
     {
    	 stepstatus=clickElement(ClickIssudt);
    	 reportEvent(stepstatus, "Able to click on Issuedate", "Unabl to click on Issue Date", driver);
     }
     @FindBy(how=How.XPATH,using="//input[@id='immigration_passport_expire_date']")
     WebElement Expirdate;
     public void SetExpireDate(String Date3)
     {
    	 stepstatus=setText(Expirdate, Date3);
    	 reportEvent(stepstatus, "Able to enter Expire Date", "Unable to Enter the Expire date", driver);
     }
     @FindBy(how=How.XPATH,using="(//li//child::img)[position()=2]")
     WebElement clickexpdate;
     public void ClickExpireDate()
     {
    	 stepstatus=clickElement(clickexpdate);
    	 reportEvent(stepstatus, "Able to Enter the ExpireDate", "Unablt to enter the expire date", driver);
     }
     @FindBy(how=How.XPATH,using="//input[@name='immigration[i9_status]']")
     WebElement Eligible1;
     public void SetEligibleCiteria(String Eligible2)
     {
    	 stepstatus=setText(Eligible1, Eligible2);
    	 reportEvent(stepstatus, "Able to Enter the Elgible", "Unable to Enter the Elgible", driver);
     }
	
     public WebElement setIssuedBy(String Issuedby)
     {
    	 return driver.findElement(By.xpath(String.format("//select[@name='immigration[country]']/option[text()='%s']", Issuedby)));
     }
     
     public void SetIssueLocation(String Location)
     {
    	 stepstatus=clickElement(setIssuedBy(Location));
    	 reportEvent(stepstatus, "Able to selec the IssueLocation", "Unable to select the IssueLocation", driver);
     }
     @FindBy(how=How.XPATH,using="//input[@id='immigration_i9_review_date']")
     WebElement ReviwDate;
     public void SetReviewDate(String Reviewd)
     {
    	 stepstatus=setText(ReviwDate, Reviewd);
    	 reportEvent(stepstatus, "Able to Enter the ReviewDate", "Unable to Enter the ReviewDate", driver);
     }
     @FindBy(how=How.XPATH,using="(//li//child::img)[position()=3]")
     WebElement clickReviewDt;
     public void ClickRevieweDate()
     {
    	 stepstatus=clickElement(clickReviewDt);
    	 reportEvent(stepstatus, "Able to Enter the ReviewDate", "Unablt to enter the ReviewDate", driver);
      }
     @FindBy(how=How.XPATH,using="//textarea[@name='immigration[comments]']")
     WebElement stComments;
     public void SetComments(String Commt)
     {
    	 stepstatus=setText(stComments, Commt);
    	 reportEvent(stepstatus, "Able to Enter the Comments", "Unable to Enter the Comments", driver);
     }
     @FindBy(how=How.XPATH,using="//input[@id='btnSave']")
     WebElement savebtn;
     public void ClicksaveBtn()
     {
    	 stepstatus= clickElement(savebtn);
    	 reportEvent(stepstatus, "Able to click the savebutton", "Unable to click the savebutton", driver);
     }
     @FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[position()=2]")
     WebElement check1;
     public void clickCheckbox()
     {
    	 stepstatus=clickElement(check1);
    	 reportEvent(stepstatus, "Able to select the checkbox", "Unble to select the checkbox", driver);
     }
     @FindBy(how=How.XPATH,using="//input[@id='btnDelete']")
     WebElement del;
     public void ClickDelete()
     {
    	 stepstatus=clickElement(del);
    	 reportEvent(stepstatus, "Able to delete the checkbox", "Unble to delete the checkbox", driver);
     }
     
}
