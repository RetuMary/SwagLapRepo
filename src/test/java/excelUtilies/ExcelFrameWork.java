package excelUtilies;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFrameWork {

	static   String projectPath ;
	 static  XSSFWorkbook workbook;
	 static  XSSFSheet sheet;

	public ExcelFrameWork (String excelpath, String sheetName) {

		try {

			workbook = new XSSFWorkbook(excelpath);

			sheet = workbook.getSheet("sheet1");

		} catch (Exception exp) {

			exp.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getcellDataString (0,0);
		getcellDataNumber (1,1);

	}

	public static int getRowCount() {
		int rowCount = 0;
		try {
			 rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : " + rowCount);
			

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return rowCount;
	
	}
	public static int  getColCount() {

		int colCount = 0;
		
		try {
			 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of colum : " + colCount);
			

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return colCount;
	
	}
	public static String  getcellDataString (int rowNum , int colNum) {

		String cellData =null;
		try {
			 cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		}catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return cellData;
	}	
	

	public static void getcellDataNumber(int rowNum , int colNum) {

		try {


			double  cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue ();
			//System.out.println(cellData);

		}catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}





	}
}

