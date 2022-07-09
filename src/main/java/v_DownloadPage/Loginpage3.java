package v_DownloadPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage3 {


	WebDriver driver = null;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement loginBtn;

	@FindBy(xpath = "//span[text()='Downloads']")
	WebElement downloadBtn;

	public Loginpage3(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String uname, String pass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		downloadBtn.click();

	}

	public Downloadpage getUsefulLink() {

		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		downloadBtn.click();

		return new Downloadpage(driver);
	}
}
