package vi_UsefulLinkPageTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import vi_UsefulLinkPage.Downloadpage;
import vi_UsefulLinkPage.Loginpage3;
import vi_UsefulLinkPage.UsefulLinkpage;
public class LoginTest2 {

	WebDriver driver = null;
	Loginpage3 la = null;
	Downloadpage up = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		la = new Loginpage3(driver);
		up = la.getUsefulLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Useful Links");

	}

	@Test
	public void test02() {

		Assert.assertTrue(up.VerifyUsefulLinks());

	}
}
