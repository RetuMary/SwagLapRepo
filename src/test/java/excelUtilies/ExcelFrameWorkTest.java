package excelUtilies;

public class ExcelFrameWorkTest {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");

		ExcelFrameWork excel = new ExcelFrameWork (projectPath+"/Excel/Data.xlsx","Sheet1");

		excel.getRowCount();
		excel.getcellDataString(1, 1);
	excel.getcellDataNumber(1, 1);
}}