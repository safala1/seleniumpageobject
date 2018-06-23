package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Logintech;
import reader.ReadData;
import util.BrowserFactory;

public class AddContactPageTest {
ReadData readExcelData= new ReadData();
//	String Username;
	//String Password;
	String FullName;
	String Company;
	String Email;
	String Phone;
	String City;
	String Address;
	String State;
	String Zip;
	
	
	
	
	public AddContactPageTest() throws IOException{
		
	String userdata[][]=readExcelData.getLogInDataFromExcelFile();
	for(int j=1; j<userdata.length;j++)
	{
		//Username=userdata[j][0];
		//Password=userdata[j][1;
		//Name=userdata[j][5];
		// Price = userdata[j][6];
		//Itemnumber=userdata[j][7];
		//Description=userdata[j][8];	
		FullName=userdata[j][9];
		Company=userdata[j][10];
		Email=userdata[j][11];
		Phone=userdata[j][12];
		Address=userdata[j][13];
		City=userdata[j][14];
		State=userdata[j][15];	
		Zip=userdata[j][16];
			
	}		
	}
	
	@Test
	public void TechfiosTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		Logintech login1 = PageFactory.initElements(driver, Logintech.class);
		login1.Loginfillup();
		
		//Techfios_homepage home = PageFactory.initElements(driver, Techfios_homepage.class);		
		//home.ClickNewProducts();
	
		AddContactPageTest  account1 = PageFactory.initElements(driver, AddContactPage.class);	
		account1.
		
		driver.close();
		driver.quit();
	}




}


}
