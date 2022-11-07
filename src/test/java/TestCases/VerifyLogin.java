package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseclass;

public class VerifyLogin extends baseclass {
	
	@Test
	public void login() throws IOException {
		
		
		LoginPageObject LPO=new LoginPageObject(driver);
		
		LPO.userNameEnter().sendKeys(Constant.username);
		
		//commonUtilities.handleExplicitwaitWebElement(10,LPO.passwordEnter());//Explicit wait using Webelement
	LPO.passwordEnter().sendKeys(Constant.password);
		
		//CommonUtilities.handleExplicitwaitBy(10,LPO.login);//Explicit wait using By,make by elelment as public	
		LPO.loginClick().click();
		
		//Assertion method
		CommonUtilities.handleAssertion(Constant.expected,LPO.acutalText().getText());
				
				
				
				
				
		
	}

}
