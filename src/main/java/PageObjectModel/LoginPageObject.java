package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	    public   By password=By.xpath("//input[@id='password']");
	     public  By login=By.xpath("//input[@id='Login']");
	     By acutal=By.xpath("(//div[@class='loginError'])[2]");
	     
	     public LoginPageObject(WebDriver driver2) {
	    	 this.driver=driver2;
	     }
	
	public WebElement userNameEnter()
	{
return driver.findElement(username);
	}
	public WebElement passwordEnter()
	{
		return driver.findElement(password);
		
	}
	public WebElement loginClick()
	{
		return driver.findElement(login);
	}
	public WebElement acutalText()
	{
		return driver.findElement(acutal);
	}
	

}
