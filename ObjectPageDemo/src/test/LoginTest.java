package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

@Test
public void loginTest() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
				
		
LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
			
login.login_info();

driver.close();

driver.quit();
			
	
}
}
