package orangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
    public List<String[]> getUsernameAndPassword() throws IOException 
    {
        List<String[]> data = new ArrayList<>();

        // Create an object of File class to open
        File ef = new File("./TestData/TestData.xlsx");

        // Create an object of FileInputStream to read data from file
        try (FileInputStream is = new FileInputStream(ef);
             XSSFWorkbook fw = new XSSFWorkbook(is)) 
        {
            XSSFSheet fs = fw.getSheetAt(0); // First sheet
            int r = fs.getLastRowNum() + 1;

            for (int cr = 1; cr < r; cr++)
            {
                String username = fs.getRow(cr).getCell(0) != null ? fs.getRow(cr).getCell(0).getStringCellValue() : "";
                String password = fs.getRow(cr).getCell(1) != null ? fs.getRow(cr).getCell(1).getStringCellValue() : "";

                data.add(new String[]{username, password});
            }
        }
        return data;
    }
}
