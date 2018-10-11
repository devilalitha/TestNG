package test;

import org.testng.annotations.Test;

public class day2 {
	@Test
	public void homeloanweb(){
		System.out.println("homeloanweb");
	}
	@Test(groups= {"smoke"})
	public void homeloanmobile(){
		System.out.println("homeloanmobile");
	}

}
