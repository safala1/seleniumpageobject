package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.Logintech;
import page.TFAddContact;
import util.BrowserFactory;

public class TFAddContactTest {
	@Test
	public void TFAddTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
	 Logintech login1 = PageFactory.initElements(driver, Logintech.class);
		
		
		login1.Loginfillup();

	TFAddContact Login = PageFactory.initElements(driver, TFAddContact.class);
	Login.AddContact_demo();
    
	
	driver.close();

	driver.quit();
				
		
	

	
		
	}
	
	

}
