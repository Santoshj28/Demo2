package iv_OperatorPageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import iv_OperatorPage.Loginpage1;
import iv_OperatorPage.Operatorpage;

public class LoginTest1 {

	WebDriver driver = null;
	Loginpage1 la = null;
	Operatorpage op = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		la = new Loginpage1(driver);
		op = la.getoperator();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Operators");

	}

	@Test
	public void test02() {

		Assert.assertTrue(op.VerifyOperatos());

	}
}
