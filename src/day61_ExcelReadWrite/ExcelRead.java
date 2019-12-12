package day61_ExcelReadWrite;


	
	import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.*;
	public class ExcelRead {
	    public static void main(String[] args) throws Exception {
	        
	        String filePath ="/Users/cybertekstudios/Desktop/TestData.xlsx";  // path of excel file
	        
	        String sheetname = "Sheet1";  // Name of the sheet
	        
	        FileInputStream file = new FileInputStream(filePath); // reads a file
	        
	        Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
	        
	        Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
	        
	        Cell cell = sheet.getRow(1).getCell(1); // retrives specific cell from the speardsheet
	        
	        String cellData = cell.getStringCellValue();  // converts the cell' value to STring data type
	        
	        System.out.println(cellData);
	        
	        
	        
	    }
	

}
