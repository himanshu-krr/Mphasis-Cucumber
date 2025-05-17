package orangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public void getNames() throws IOException 
	{
		
		// Excel -> WorkBook -> Sheet -> Row -> Cell
		
		XSSFWorkbook fw = null;
		XSSFSheet fs;
		
		// Create an object of File class to open
		File ef = new File("./TestData/TestData.xlsx");
		
		// Create an object of FileInputStream to read data from file
		
		FileInputStream is = new FileInputStream(ef);
		
		// Create object of XSSFWorkbook to handle xlsx file
		
		fw = new XSSFWorkbook(is);
		fs = fw.getSheetAt(0); // Bcz sheet is first
		
		// get total row count
		
		int r = fs.getLastRowNum()+1;
		int c = fs.getRow(0).getLastCellNum();
		
	
		
		for(int cr = 1; cr<r; cr++)
		{
			String username = fs.getRow(cr).getCell(0).getStringCellValue();
			String password = fs.getRow(cr).getCell(1).getStringCellValue();
			
			System.out.println(username);
			System.out.println(password);
		}
		
	}


}
