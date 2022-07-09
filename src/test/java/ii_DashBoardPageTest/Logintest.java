package ii_DashBoardPageTest;
//dasboardpage link or connect to loginpage in login test
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ii_DashBoardPage.DashBoardPage;
import ii_DashBoardPage.Loginpage;



public class Logintest {
	WebDriver driver = null;
	DashBoardPage dp= null;  //
//loginpage
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		Loginpage lp = new Loginpage(driver);
	//	lp.loginToApplication("kiran@gmail","123456");  //no need this line

		dp = lp.getdashboard();  //

		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard" );
	
}
//Dashboard
	@Test
	public void test02() {
	//	DashBoardPage dp = new DashBoardPage(driver);    //no need this line
		
		Assert.assertTrue(dp.verifyCourses());
	}
}