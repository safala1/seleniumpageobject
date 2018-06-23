package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.Logintech;
import util.BrowserFactory;

public class LogintechTest {
	
	

		@Test
		public void loginTest() throws IOException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
						
				
		 Logintech login1 = PageFactory.initElements(driver, Logintech.class);
				
					
		login1.Loginfillup();

		driver.close();

		driver.quit();
					
			
		}
		}	
	


