package TestClasses;

import org.testng.annotations.Test;

public class loginpage extends BaseClass
{
	@Test(priority=1)
	public void Username1()
	{
		lg.userName("Admin");
		
	}
	
	@Test(priority=2)
	public void Password1()
	{
		
		lg.passWord("admin123");
	}
	

	@Test(priority=3)
	public void login1()
	{
		
		lg.logIn();
	}
}
