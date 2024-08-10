package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.Inventorypage;
import pages.LoginPage;

public class BaseTest {

	public WebDriver driver;
    public LoginPage lp;
    public Inventorypage ip;
    public ScreenShot Sc;
    

    @BeforeMethod
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        lp = new LoginPage(driver);
        ip = new Inventorypage(driver);
        Sc = new ScreenShot(driver);
    }
    
    @AfterMethod
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    
    

}





