package vi_UsefulLinkPage;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class UsefulLinkpage {

	@FindBy(xpath = "//td[01]")
	public List<WebElement> usefullinks;// 4

	public UsefulLinkpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean VerifyUsefulLinks() {

		boolean flag = false;
		for (WebElement usefullink : usefullinks) {
			flag = usefullink.isDisplayed();
		}
		return flag;
	}
}
