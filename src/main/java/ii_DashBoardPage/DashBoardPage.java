package ii_DashBoardPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	//check multiple docs page
@FindBy(xpath="//h3")
List<WebElement> courses;

public DashBoardPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public boolean verifyCourses() {
	boolean flag = false;
	for(WebElement course : courses) {
		flag = course.isDisplayed();
	}
	return flag;

}
}
