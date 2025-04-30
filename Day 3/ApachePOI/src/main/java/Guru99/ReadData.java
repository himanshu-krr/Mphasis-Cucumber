package Guru99;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
public class ReadData {
	
	String filePath = "./TestData/Credentials.xlsx";
	FileInputStream f;
	Workbook wb;
	Sheet sh;
	public ReadData() throws IOException {
		f = new FileInputStream(filePath);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheetAt(0);
	}
	
	public String ReadFirstName() {
		
		int cell = 0; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return c.getStringCellValue();
	}
	
	public long ReadPinCode() {
		
		int cell = 1; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return (long) c.getNumericCellValue();
		
	}
	
	public String ReadCountry() {
		
		int cell = 2; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return c.getStringCellValue();
		
	}
	
	public String ReadUserName() {
		int cell = 3; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return c.getStringCellValue();
	}
	
	public String ReadPassword() {
		int cell = 4; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return c.getStringCellValue();
	}
	
}