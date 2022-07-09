package v_DownloadPageTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import v_DownloadPage.Downloadpage;
import v_DownloadPage.Loginpage3;


public class LoginTest3 {

	WebDriver driver = null;
	Loginpage3 la = null;
	Downloadpage dp = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		la = new Loginpage3(driver);
		dp = la.getUsefulLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Downloads");

	}

	@Test
	public void test02() {

		Assert.assertTrue(dp.VerifyDownloads());

	}
}
