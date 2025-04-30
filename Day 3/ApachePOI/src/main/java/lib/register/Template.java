package lib.register;
 
import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
public class Template {
	
	// Global File Path
	String filePath = "./TestData/TestData.xlsx";
	
	public String ReadFirstName() throws IOException
	{
		// Opens the file and prepares it for reading.
		FileInputStream fis = new FileInputStream(filePath);
		
		// Create a workbook instance
		//Uses Apache POI to read .xlsx files (Excel format).
		Workbook wb = new XSSFWorkbook(fis);
		
		// Get the first sheet from the workbook
		Sheet sh = wb.getSheetAt(0);
		
		//Specify the row  and cell you want to read
		int rowIndex = 1; //Row index 1 (second row since indexing starts at 0).
		int cellIndex = 0; //Cell index 0 (first column in the row).
		
		Row row = sh.getRow(rowIndex);
		
		Cell cell = row.getCell(cellIndex);
		
		String fnm = cell.getStringCellValue(); //Reads and stores the text value from the cell.
		
		return fnm;
	}
	
	public static void main(String[] args) throws IOException {
        Template registerDemo = new Template();
        String firstName = registerDemo.ReadFirstName();
        System.out.println("Extracted First Name: " + firstName);
    }
}
 
 