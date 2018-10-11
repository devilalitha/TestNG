package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practise2 {
	
	@Test
	public void homeloanweb(){
		
		System.out.println("iam homeloan web");
		
	}
	@BeforeMethod
	public void homeloanmobile(){
		
		System.out.println("iam homeloan mobile");
		
			}
	@Test
	public void homeloanexample(){
		
		System.out.println("iam homeloan example");
		
		
	}
	@AfterMethod
	public void homeloanios(){
		
		System.out.println("iam homeloan ios");
		
	}

}
