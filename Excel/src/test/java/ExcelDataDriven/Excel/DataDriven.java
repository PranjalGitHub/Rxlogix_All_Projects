package ExcelDataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriven {
public static void main (String[] args) throws IOException {

	
	FileInputStream fis = new FileInputStream("C:\\Users\\pranjal\\Downloads.TestData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	int sheets = workbook.getNumberOfSheets();
	
	for(int i=0;i<sheets;i++) {
		
		if(workbook.getSheetName(i).equalsIgnoreCase("Data"));
		XSSFSheet sheet = workbook.getSheetAt(i);
		
		
	}

}
}