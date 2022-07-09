package iii_UserPage;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userspage {


	@FindBy(xpath="//td[2]")
	public List<WebElement> users;
	 
	public Userspage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	public boolean VerifyUsers() {
		
		boolean flag = false;
		for(WebElement user : users) {
			flag = user.isDisplayed();
			
		}
		return flag;
	}	
}
