package loopExcel;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
public class LoopExcel {
	
	static String filePath = "./TestData/TestData2.xlsx";
	
	public static int[] ReadFirstName() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sh = wb.getSheetAt(0);
		
		int cellIndex = 0;
		
		int[] cn = new int[2];
		
		for(int i=1;i<=2;i++) {
			Row r = sh.getRow(i);
			Cell c = r.getCell(cellIndex);
			cn[i-1]=((int)c.getNumericCellValue());
		}
		
		return cn;
	}
	
	public static void main(String[] args) throws IOException {
        int arr[]=ReadFirstName();
        System.out.println(Arrays.toString(arr));
    }
}
 