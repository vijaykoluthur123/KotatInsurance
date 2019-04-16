package applicationPages;

import java.lang.reflect.Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pg107_QualificationPage extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	
	WebDriver driver;
	boolean stepstatus;
	
	public Pg107_QualificationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@id='addWorkExperience']")
	WebElement add;
	public void clickOnAdd()
	{
		stepstatus = basepage.clickElement(add);
		reportEvent(stepstatus, "Able to click on add", "Unable to click on add",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='experience[employer]']")
	WebElement Companyname;
	public void SetCompanyName(String CompanyName)
	{
		stepstatus=basepage.setText(Companyname, CompanyName);
		reportEvent(stepstatus, "Able to enter the company name", "Unable to enter company Name",driver);
		
			}
	@FindBy(how=How.XPATH,using="//input[@name='experience[jobtitle]']")
	WebElement Title;
	public void SetTitle(String experience)
	{
		stepstatus=basepage.setText(Title, experience);
		reportEvent(stepstatus, "Able to enter Experience", "Unable to enter Experience",driver);
				
	}
	@FindBy(how=How.XPATH,using="//input[@name='experience[from_date]']")
	WebElement FromDate;
	public void setExpFromDate(String date)
	{
		stepstatus=basepage.setText(FromDate, date);
		reportEvent(stepstatus, "Able to enter the From Date", "Unble to enter the From Date",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='experience_from_date']/following-sibling::img")
	WebElement FromDateclick;
	public void ClickFromDate()
	{
		stepstatus=basepage.clickElement(FromDateclick);
		reportEvent(stepstatus, "Able to click the FromDate" , "Unable to click the FromDate",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='experience_to_date']")
	WebElement expToDate;
	public void SetExpToDate(String todate)
	{
		stepstatus=basepage.setText(expToDate, todate);
		reportEvent(stepstatus, "Able to enter the todate", "Able to enter the todate",driver);
	}
			
	@FindBy(how=How.XPATH,using="//input[@id='experience_to_date']/following-sibling::img")
	WebElement Exptodateclick;
	public void ClickToDate()
	{
		stepstatus=basepage.clickElement(Exptodateclick);
		reportEvent(stepstatus, "Able to click the todate", "Able to click the todate",driver);
	}
	@FindBy(how=How.XPATH,using="//textarea[@name='experience[comments]']")
	WebElement Comments1;
	public void SetComments(String Comments)
	{
		stepstatus=basepage.setText(Comments1, Comments);
		reportEvent(stepstatus, "Able to enter the Comments", "Unable to enter the Comments",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnWorkExpSave']")
	WebElement savebutton;
	public void ClickSavebtn()
	{
		stepstatus=basepage.clickElement(savebutton);
		reportEvent(stepstatus, "Able to click the save button", "Unable to click the save button",driver);
	}
	////////////////////////////////////////////////Skills//////////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH,using="//input[@id='addSkill']")
	WebElement skillAdd;
	public void ClickSkillAdd()
	{
		stepstatus=clickElement(skillAdd);
		reportEvent(stepstatus, "Able to add skills add", "Unable to add skills add", driver);
		
	}
	public WebElement SetSkills(String skills1)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='skill[code]']/option[text()='%s']", skills1)));
	}
	public void ClickSetSkills(String values)
	{
		stepstatus=clickElement(SetSkills(values));
		reportEvent(stepstatus, "Able to enter the skills", "Unablt to enter the skills", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='skill[years_of_exp]']")
	WebElement Experience;
	public void SetYearOfExp(String Exp)
	{
		stepstatus=basepage.setText(Experience, Exp);
		reportEvent(stepstatus, "Able to enter the Experience", "Unable to enter the Experience",driver);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@name='skill[comments]']")
	WebElement Textarea;
	public void SetTextArea(String area)
	{
		stepstatus=basepage.setText(Textarea, area);
		reportEvent(stepstatus, "Able to enter the Textarea", "Unable to enter the Textarea",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnSkillSave']")
	WebElement skillsavebutton;
	public void ClickSkillSavebtn()
	{
		stepstatus=basepage.clickElement(skillsavebutton);
		reportEvent(stepstatus, "Able to click the save button", "Unable to click the save button",driver);
	}
	///////////////////////////////////////////Education////////////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH,using="//input[@id='addEducation']")
	WebElement addEducat;
	public void ClicAddEducation()
	{
		stepstatus=clickElement(addEducat);
		reportEvent(stepstatus, "Able to click on Education add", "Able to click on Education add", driver);
	}
	public WebElement SelectLevel(String level1)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='education[code]']/option[text()='%s']", level1)));
	}
	public void ClickSelectLevel(String level)
	{
		stepstatus=clickElement(SelectLevel(level));
		reportEvent(stepstatus, "able to selec the level", "Unable to select the level", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='education[institute]']")
	WebElement Institute;
	public void SetInstute(String inst)
	{
		stepstatus=basepage.setText(Institute, inst);
		reportEvent(stepstatus, "Able to enter the Institute", "Unable to enter the Institute",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='education[major]']")
	WebElement majorSpe;
	public void SetMajorSpecialization(String majorspecialization)
	{
		stepstatus=basepage.setText(majorSpe, majorspecialization);
		reportEvent(stepstatus, "Able to enter the majorspecialization", "Unable to enter the majorspecialization",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='education[year]']")
	WebElement Educationyear;
	public void SetEducationYear(String year1)
	{
		stepstatus=basepage.setText(Educationyear, year1);
		reportEvent(stepstatus, "Able to enter the Educationyear", "Unable to enter the Educationyear",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='education[gpa]']")
	WebElement GPAscore;
	public void SetGPAScore(String score)
	{
		stepstatus=basepage.setText(GPAscore, score);
		reportEvent(stepstatus, "Able to enter the GPAscore", "Unable to enter the GPAscore",driver);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='education[start_date]']")
	WebElement Startdate1;
	public void SetEduStartDAte(String start)
	{
		stepstatus=basepage.setText(Startdate1, start);
		reportEvent(stepstatus, "Able to enter the EduStartDAte", "Unable to enter the EduStartDAte",driver);
	}
	@FindBy(how=How.XPATH,using="(//img[@class='ui-datepicker-trigger'])[3]")
	WebElement Startdateclick;
	public void ClickEduStartDate()
	{
		stepstatus=basepage.clickElement(Startdateclick);
		reportEvent(stepstatus, "Able to click the save Startdateclick", "Unable to click the save Startdateclick",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='education[end_date]']")
	WebElement Enddate1;
	public void SetEduEndDate(String end)
	{
		stepstatus=basepage.setText(Enddate1, end);
		reportEvent(stepstatus, "Able to enter the Enddate1", "Unable to enter the Enddate1",driver);
	}
	@FindBy(how=How.XPATH,using="(//img[@class='ui-datepicker-trigger'])[4]")
	WebElement Endclick;
	public void ClickEduEndDate()
	{
		stepstatus=basepage.clickElement(Endclick);
		reportEvent(stepstatus, "Able to click the save Endclick", "Unable to click the save Endclick",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnEducationSave']")
	WebElement Educationsavebutton;
	public void ClickEducationSavebtn()
	{
		stepstatus=basepage.clickElement(Educationsavebutton);
		reportEvent(stepstatus, "Able to click the save Educationsavebutton", "Unable to click the save Educationsavebutton",driver);
	}
	/////////////////////////////////Language/////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH,using="//input[@id='addLanguage']")
	WebElement addLanguage;
	public void ClicAddLanguage()
	{
		stepstatus=clickElement(addLanguage);
		reportEvent(stepstatus, "Able to click on Language add", "Able to click on Language add", driver);
	}
	
		public WebElement SelectLanguage(String selectnew)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='language[code]']/option[text()='%s']", selectnew)));
		
	}
	public void SetLanguage(String Language1)
	{
		stepstatus=clickElement(SelectLanguage(Language1));
		reportEvent(stepstatus, "Able to select the language", "Unale to select the Language", driver);
	}
	public WebElement SelectFlunce(String selectFlun)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='language[lang_type]']/option[text()='%s']", selectFlun)));
		
	}
	public void SetFlunce(String Language2)
	{
		stepstatus=clickElement(SelectFlunce(Language2));
		reportEvent(stepstatus, "Able to select the Flunce", "Unale to select the Flunce", driver);
	}
	public WebElement SelectCompentency(String Compentency1)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='language[competency]']/option[text()='%s']", Compentency1)));
		
	}
	public void SetCompentency(String Compentency)
	{
		stepstatus=clickElement(SelectCompentency(Compentency));
		reportEvent(stepstatus, "Able to select the Compentency", "Unale to select the Compentency", driver);
	}
	@FindBy(how=How.XPATH,using="//textarea[@name='language[comments]']")
	WebElement LangComments;
	public void SetLanguageComments(String comments)
	{
		stepstatus=basepage.setText(LangComments, comments);
		reportEvent(stepstatus, "Able to enter the Comments language", "Unable to enter the Comments language",driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnLanguageSave']")
	WebElement Languagesavebutton;
	public void ClickLanguageSavebtn()
	{
		stepstatus=basepage.clickElement(Languagesavebutton);
		reportEvent(stepstatus, "Able to click the save Languagesavebutton", "Unable to click the save Languagesavebutton",driver,true);
	}
	////////////////////////////////////////Licence///////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH,using="//input[@id='addLicense']")
	WebElement addLicence;
	public void ClicAddLicence()
	{
		stepstatus=clickElement(addLicence);
		reportEvent(stepstatus, "Able to click on Language Licence", "unable to click on Licence", driver);
	}
	public WebElement SelectLicenceType(String LicenceType)
	{
		return driver.findElement(By.xpath(String.format("//select[@name='license[code]']/option[text()='%s']", LicenceType)));
	}
	public void clickLicenceType(String licence)
	{
		stepstatus=clickElement(SelectLicenceType(licence));
		reportEvent(stepstatus, "Able to select the Licence Type", "Unable to select the Licence Type", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='license[license_no]']")
	WebElement licencenumber;
	public void SetLicencNumber(String Licence1)
	{
		stepstatus=setText(licencenumber, Licence1);
		reportEvent(stepstatus, "Able to enter the licence number", "Unablt to enter licence number", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='license[date]']")
	WebElement licenceIsseDate;
	public void SetLicenceIssueDate(String Licencedate)
	{
		stepstatus=setText(licenceIsseDate, Licencedate);
		reportEvent(stepstatus, "Able to enter the licence number", "Unablt to enter licence number", driver);
	}
	@FindBy(how=How.XPATH,using="(//img[@class='ui-datepicker-trigger'])[5]")
	WebElement Issuedate;
	public void ClicklicenceIssuedate()
	{
		stepstatus=clickElement(Issuedate);
		reportEvent(stepstatus, "Able to click on Language Issuedate", "unable to click on Issuedate", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@name='license[renewal_date]']")
	WebElement licenceExpireDate;
	public void SetLicenceExpDate(String Licenceexpdate)
	{
		stepstatus=setText(licenceExpireDate, Licenceexpdate);
		reportEvent(stepstatus, "Able to enter the licenceExpireDate", "Unablt to enter licenceExpireDate", driver);
	}
	@FindBy(how=How.XPATH,using="(//img[@class='ui-datepicker-trigger'])[6]")
	WebElement Expiredate;
	public void ClicklicenceExpiredate()
	{
		stepstatus=clickElement(Expiredate);
		reportEvent(stepstatus, "Able to click on Language Expiredate", "unable to click on Expiredate", driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='btnLicenseSave']")
	WebElement Licencesavebutton;
	public void ClickLicenceSavebtn()
	{
		stepstatus=basepage.clickElement(Licencesavebutton);
		reportEvent(stepstatus, "Able to click the save Licencesavebutton", "Unable to click the save Licencesavebutton",driver);
	}
	
	
}
