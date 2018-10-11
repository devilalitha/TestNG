package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Login {
	
public WebDriver driver=null;// webdriver is defined globally

	@Test
	public void Demo() throws IOException {
	Properties prop= new Properties();
	FileInputStream fil=new FileInputStream("I:\\eclipse orginal\\TestNG\\src\\test\\datadriven.properties");
	prop.load(fil);
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	if(prop.getProperty("browser").contains("firefox")){
		
		 driver = new FirefoxDriver();//when webdriver is defined here the control lies only in this loop
	}
	
	else if(prop.getProperty("browser").contains("Chrome")){
		
		 driver = new ChromeDriver();
		 
	}
	else {
		
		 driver = new InternetExplorerDriver();
		
		
	}
	driver.get(prop.getProperty("URL"));
	
	}
}

