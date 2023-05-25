package PageClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login 
{
	WebDriver driver;
	WebDriverWait wait;
	 JavascriptExecutor js;
	@FindBy(xpath="//*[@name='username']")WebElement username;
	@FindBy(xpath="//*[@name='password']")WebElement password;
	@FindBy(xpath="//*[@type='submit']")WebElement login;
	
	
	public login(WebDriver driver)
	{
		this.driver=driver;
		 wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		 PageFactory.initElements(driver, this);
		 js=(JavascriptExecutor)driver;
		  
	}
	
	public void userName(String uname) 
	{
	wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(uname);
	}
	
	public void passWord(String pword) 
	{
		password.sendKeys(pword);
	}
	
	public void logIn() 
	{
		login.click();
	}
	
	public void popup() 
	{
		driver.switchTo().alert().accept();
	}
	
	
}


