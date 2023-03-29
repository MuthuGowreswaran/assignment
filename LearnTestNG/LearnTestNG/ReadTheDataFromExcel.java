package LearnTestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadTheDataFromExcel {
	
//	@Test
//	public void excelData() throws IOException {
//		// identify WorkBook & class
//		XSSFWorkbook wb = new XSSFWorkbook("./data/LoginPage.xlsx");
//		
//		//identify WorkSheet & Class
//		XSSFSheet ws = wb.getSheet("Sheet1");
//		
//		//identify WorkRow & class  
//		XSSFRow row = ws.getRow(1);          //Anther method
//                                             // String cellValue = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
//                                             //System.out.println(cellValue);
//		                                  
//		//identify WorkCell & Class
//		XSSFCell cell = row.getCell(0);
//		
//		//identify cell
//		String cellValue = cell.getStringCellValue();	
//		
//		//print the value
//		System.out.println(cellValue);
//		
//       //close workbook
//		wb.close();
//		
//		
//	}
	

	public static String[][] readData() throws IOException {
	
	
		
	
		XSSFWorkbook wb = new XSSFWorkbook("./data/input.xlsx");
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		int allrow = sheet.getLastRowNum();
		int allCell = sheet.getRow(0).getLastCellNum();
		String[][] value = new String[allrow][allCell];
		for (int i = 1; i <=allrow; i++) {
			
			for(int j = 0; j < allCell; j++) {
			
			String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
	        
	       
	        value[i-1][j]=cellValue;
	        
	        System.out.println(cellValue);
			}
		}
	
		
		wb.close();
		return value;
	}
	
	

}