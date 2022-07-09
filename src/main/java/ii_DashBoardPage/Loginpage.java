package ii_DashBoardPage;
// loginpage link in dashboardpage & logintest
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page Object model
//webElement & it's methods

public class Loginpage {
	
	WebDriver driver =null;   //

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement loginbutton;

	public Loginpage(WebDriver driver) {
		
		this.driver = driver;   //
		
		PageFactory.initElements(driver, this);

	}

	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
   }
	
	public DashBoardPage getdashboard() {    //
		
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbutton.click();
		
		return new DashBoardPage(driver);
		
		
	}
}