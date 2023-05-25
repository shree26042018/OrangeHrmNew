package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{

	public static String ExcelReader(int row, int column) throws IOException   
	{
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"src\\test\\resources\\TestData\\hrmExcel.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sheet.getRow(row).getCell(column));
		return value;

	}

}
