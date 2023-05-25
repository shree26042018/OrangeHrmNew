package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PageClasses.login;
import Utility.PropData;

public class BaseClass 
{
	public static WebDriver driver;
	login lg;
	@BeforeSuite
	public  void launchChrome() throws IOException 
	{
		//ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(PropData.readpropdata("url"));

	}
	
	@BeforeClass
	public void createobject()
	{
		 lg=new login(driver);
	}

}
