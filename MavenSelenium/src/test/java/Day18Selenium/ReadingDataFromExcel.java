package Day18Selenium;

public class ReadingDataFromExcel {

	public static void main(String[] args) {
		
		FileInputStream file = new FileInputStream("Paste the location of execl file");
		
		XSSWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = new XSSFSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows :" + rows);
		System.out.println("Number of cells : " + col);
		
		for(int r=0 ; r<=row ; r++) {
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0; c<col; c++) {
				XSSFCell cell = currentrow.getCell(c);
			}
		}
		
		
	}

}
