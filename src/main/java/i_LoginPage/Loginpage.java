package i_LoginPage;


//Page Object Model(POM):- package i,ii,iii,iv,v,vi


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page Object model
//webElement & it's methods

public class Loginpage {

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement loginbutton;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();

	}
}