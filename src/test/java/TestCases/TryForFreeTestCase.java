package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.TryForFreePageObject;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseclass;

public class TryForFreeTestCase extends baseclass {
	
	@Test
	public void verifyTryForFree() throws IOException, InterruptedException
	{
		
		TryForFreePageObject TPO=new TryForFreePageObject(driver);
		TPO.tryForFreeClick().click();
		Thread.sleep(2000);
		TPO.firstNameEnter().sendKeys(Constant.firstname);
		TPO.lastNameEnter().sendKeys(Constant.lastname);
		TPO.jobTitleEnter().sendKeys(Constant.jobtitle);
		TPO.emailEnter().sendKeys(Constant.email);
		TPO.phoneEnter().sendKeys(Constant.phoneNo);
		
		//DropDown Employee
		CommonUtilities.handleDropDown(TPO.employeeSelected(),3);
		
		TPO.companyNameEnter().sendKeys(Constant.companyName);
		
		//DropDown Country
		CommonUtilities.handleDropDown(TPO.companyCountrySelected(), 4);
		
		TPO.iAgreeChecked().click();
		//Thread.sleep(2000);
		//TPO.yesIwouldChecked().click();
		
		
		
		
	
	}
}


