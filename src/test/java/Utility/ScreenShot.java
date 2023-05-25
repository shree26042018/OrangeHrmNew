package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static String getScreenShot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot cs=(TakesScreenshot)driver;
		File source=cs.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"Reports\\Screenshot"+filename+".jpg";
		File file =new File(path);
		FileHandler.copy(source, file);
		return path;
		
	}
}
