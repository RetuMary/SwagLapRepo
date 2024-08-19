package excelUtilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelFrameWork1 {

	//for driver
	public WebDriver driver;
	@BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username,String password) throws Exception {

		System.out.println(username + " |" +password);
	
		//for login with multiple data 
		
		driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
	}

	@DataProvider(name = "test1data")
	public Object [][] getData() {
		String excelpath = "C:\\Users\\rodri\\eclipse-New-Workspace\\SwagLabs\\Excel\\Data.xlsx";
		Object data [][]= testData (excelpath, "Sheet1");
		return data;
	}

	public Object [][]testData (String excelpath, String sheetName) {
		ExcelFrameWork excel = new ExcelFrameWork (excelpath,sheetName );

		int rowCount= excel.getRowCount();

		int colCount = excel.getColCount();

		Object data [][] = new Object[rowCount -1][colCount];

		for (int i = 1; i <rowCount; i++) {


			for (int j =0; j<colCount; j++) {
				String cellData = excel.getcellDataString(i, j);
				System.out.print(cellData + " | ");
				data [i -1][j] = cellData;

			}
			System.out.println();
		}
		return data;
	}



}
