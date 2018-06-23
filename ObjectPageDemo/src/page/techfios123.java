package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techfios123 {


@Test
public void Login(){
	
	
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
    WebDriver driver = new ChromeDriver();
   //driver object reference access all the built in function in selenium.
		
    driver.manage().window().maximize(); // maximizes window
	
   driver.get("http://techfios.com/test/billing/?ng=login/");	
    
    driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
    
    driver.findElement(By.id("password")).sendKeys("abc123");
    
    driver.findElement(By.name("login")).click();	
	
	driver.close();
	driver.quit();
	 
	
}
	
	
	
	
}
