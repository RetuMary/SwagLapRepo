package testCases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ExtentListener.class)
public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void VerifyApplicationUrl() {

        lp.verifyUrl();
    Sc.takeScreenshot("C:\\Users\\rodri\\eclipse-New-Workspace\\SwagLabs\\target\\url.png");
    }

    @Test(priority = 2)
    public void VerifyApplicationTitle() {
        lp.verifyTitle();
        Sc.takeScreenshot("C:\\Users\\rodri\\eclipse-New-Workspace\\SwagLabs\\target\\titel.png");
    }

    @Test(priority = 3)
    public void VerifyApplicationLogin() {
        lp.verifylogin("standard_user", "secret_sauce");
   Sc.takeScreenshot("C:\\Users\\rodri\\eclipse-New-Workspace\\SwagLabs\\target\\login.png\"");
    } }