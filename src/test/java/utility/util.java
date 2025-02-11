package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

import POM.logInPom;

public class util extends Base {

	private static util Instance ;

	private util() {

	}
	public static util getInstance () {
		if(	Instance==null) {
			Instance = new util();
		}
		return Instance;

	}
	public void takeScreenShot () {


	}

	public void initElement () {
                PageFactory.initElements(driver,logInPom.getIn());
	}
	public void highlighert(WebElement element) {
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].setAttribute('style','border: 3px solid red');", element);
	}
}
