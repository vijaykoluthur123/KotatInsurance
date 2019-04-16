package kotatInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import applicationPages.HRMBasePage;

public class CalculatePremium extends HRMBasePage
{
	HRMBasePage basepage = new HRMBasePage();
	WebDriver driver;
	boolean stepstatus;
	
	public CalculatePremium(WebDriver driverInstance)
	{
		this.driver= driverInstance;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Calculate premium']")
	WebElement calprem;
	
	public void CalculatePremium1()
	{
		stepstatus=clickElement(calprem);
		reportEvent(stepstatus, "Able to click the Calculate Premium", "Unable to click the Premium", driver);
	}
	public WebElement SelectValueforProduct(String product)
	{
		return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_Productcategory']/option[text()='%s']", product)));
	}
	
	public void ClickValueforProduct(String str)
	{
		stepstatus=clickElement(SelectValueforProduct(str));
		reportEvent(stepstatus, "Able to selec the value", "Unable to selec the value", driver);
	}
	public WebElement SelectProduct(String product1)
	{
		return driver.findElement(By.xpath(String.format("//select[@id='ContentPlaceHolder1_ddl_Product']/option[text()='%s']", product1)));
	}
   public void ClickProduct(String str1)
   {
	   stepstatus=clickElement(SelectProduct(str1));
	   reportEvent(stepstatus, "Able to select the product", "Unble to select the product", driver);
   }
   @FindBy(how=How.XPATH,using="//input[@id='ContentPlaceHolder1_btn_Proceed']")
   WebElement proceed;
   public void clickProceed()
   {
	   stepstatus=clickElement(proceed);
	   reportEvent(stepstatus, "Able to click the proceed button", "Unablt to click the Proceed", driver);
   }
   
}
