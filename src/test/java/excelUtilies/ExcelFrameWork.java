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

			sheet = workbook.getSheet("sheetName");

		} catch (Exception exp) {

			exp.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getcellDataString (1,1);
		getcellDataNumber (1,1);

	}

	public static void getRowCount() {

		try {


			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : " + rowCount);
			

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

	public static void getcellDataString (int rowNum , int colNum) {

		try {


			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		}catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}}

	public static void getcellDataNumber(int rowNum , int colNum) {

		try {


			double  cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue ();
			System.out.println(cellData);

		}catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}





	}
}

