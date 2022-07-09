package iv_OperatorPage;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operatorpage {

	@FindBy(xpath = "//td[01]")
	public List<WebElement> operators;// 4

	public Operatorpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean VerifyOperatos() {

		boolean flag = false;
		for (WebElement operator : operators) {
			flag = operator.isDisplayed();
			// String nameCourse=course.getText();
			// System.out.println("Name of course: "+nameCourse);

		}
		return flag;
	}
}
