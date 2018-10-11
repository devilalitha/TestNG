package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Test(groups= {"smoke"})
	public void carloneweb() {
		System.out.println("carloneweb");
		}
	@Parameters({"URL"})
		@Test
		public void carlonemobile(String urlname)
		{
			System.out.println("carlonemobile");
		}
		@Test
		public void loneAPI()
		{
			System.out.println("loneAPI");
		}
		@BeforeTest
		public void cleaning()
		{
			System.out.println("I will excutre before any test");
		}
	
		@AfterTest
		public void complete()
		{
			System.out.println("I will excutre after any test");
		}
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("I will excutre before any method");
		}
	
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("I will excutre after any method");
		}
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("I will excutre before any class");
		}
	
		@AfterClass
		public void afterclass()
		{
			System.out.println("I will excutre after any class");
		}
		 
	}


