package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseclass;

public class VerifyLogin extends baseclass {
	
	@Test
	public void login() throws IOException {
		
		intializeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
	}

}
