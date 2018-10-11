package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise1 {
	
	@AfterTest
	public void carloneweb() {
		System.out.println("iam car lone web");
	}
	@BeforeTest
	public void carlonemobile() {
		System.out.println("iam car lone mobile");
	}
	@Test
	public void carloneios() {
		System.out.println("iam car lone ios");
	}

}
