package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TFAddContact {

WebDriver driver;
	
	public TFAddContact(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='CRM']")
	WebElement crm;
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Add Contact']")
	WebElement addcontact;
	
	@FindBy(how=How.XPATH,using="//a[text()='List Contacts']")
	WebElement Listcontact;
	
	// username=Id= user_login
	@FindBy(how=How.ID,using="account")
	WebElement fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement companyname;
	
	@FindBy(how=How.ID, using="email")
	WebElement email1;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement cityname;
	
	@FindBy(how=How.ID,using="state")
	WebElement statename;
	
	@FindBy(how=How.ID,using="zip")
	WebElement zip ;
	
	//@FindBy(how=How.ID, using="select2-country-container")
	//WebElement country;

	//@FindBy(how=How.XPATH,using="//*[@id=\"rform\"]/div[10]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	//WebElement Tags ;
	
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit;
	

	
	
	public void AddContact_demo(){
		
		crm.click();
		addcontact.click();
		fullname.sendKeys("safala");
		companyname.sendKeys("abc");
		email1.sendKeys("safala08@gmail.com");
		phone.sendKeys("4056961285");
		cityname.sendKeys("Texas");
		address.sendKeys("Irving");
		statename.sendKeys("Texas");
		zip.sendKeys("73012");
		//country.findElement////("United States");
		//Tags.sendKeys("Techfios");
		submit.click();
		
		
		
		
		
	}
	
    
}

	
	
	


