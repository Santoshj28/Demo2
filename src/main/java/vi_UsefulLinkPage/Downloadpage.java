package vi_UsefulLinkPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Downloadpage {

	@FindBy(xpath = "//td[01]")
	public List<WebElement> downloads;

	public Downloadpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean VerifyDownloads() {

		boolean flag = false;
		for (WebElement download : downloads) {
			flag = download.isDisplayed();
		}
		return flag;
	}

	public boolean VerifyUsefulLinks() {
		boolean flag = false;
		for (WebElement verifyusefullink :downloads ) {
			flag = verifyusefullink.isDisplayed();
		}
		return flag;
	}
}
