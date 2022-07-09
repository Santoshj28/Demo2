package iii_UserPageTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import iii_UserPage.Userspage;
import iii_UserPage.loginPage;

public class LoginPageTest {


	WebDriver driver = null;
	loginPage lp = null;
	Userspage up = null;
	@Test
	public void test01() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		loginPage lp = new loginPage(driver);
		up= lp.getuser();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
		
	}
	
	@Test
	public void test02() {
	
		Assert.assertTrue(up.VerifyUsers());
	
	}
}
