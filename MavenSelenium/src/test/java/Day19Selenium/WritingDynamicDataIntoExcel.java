package Day19Selenium;

import java.util.Scanner;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) {
		
		FileOutputStream file = new FileOutputStream(System.getProperties("user.dir")+"\\testData\\dynamicfile.xlsx");
		
		XSSFWrokbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		int noOfRow = sc.nextInt();
		
		System.out.println("Enter no of cols");
		int noOfCol = sc.nextInt();
		
		for(int r=0; r<=noOfRow; r++) {
			XSSFRow currentrow = sheet.createRow(r);
			{
				for(int c=0; c<noOfCol; c++) {
					XSSFCell cell = currentrow.createCell(c);
					cell.setCellValue(sc.next());
				}
			}
		}	
	}
}
