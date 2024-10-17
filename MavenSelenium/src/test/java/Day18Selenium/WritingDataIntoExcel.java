package Day18Selenium;

import java.io.FileOutputStream;

public class WritingDataIntoExcel {

	public static void main(String[] args) {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperties("user.dir")+"\\testData\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Selenium");
			row1.createCell(1).setCellValue("Cypress");
			row1.createCell(2).setCellValue("Playwright");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Java");
			row2.createCell(1).setCellValue("JS");
			row2.createCell(2).setCellValue("PHP");
			
		XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("Postman");
			row3.createCell(1).setCellValue("RestAssured");
			row3.createCell(2).setCellValue("SOUPAPI");
			
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("TestNG");
			row4.createCell(1).setCellValue("Cucumber");
			row4.createCell(2).setCellValue("Robot");
			
		workbook.write(file);
		workbook.close();
		file.close();
		
	}

}
