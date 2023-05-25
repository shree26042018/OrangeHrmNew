package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropData 
{

	public static String readpropdata (String key) throws IOException
	{
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\hrm.properties";
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;

	}

}
