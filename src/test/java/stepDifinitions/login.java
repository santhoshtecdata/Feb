package stepDifinitions;

import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

import POM.logInPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.util;

public class login extends Base {
	

@Given("open a chrome browser")
public void open_a_chrome_browser() {
	logInPom lp= PageFactory.initElements(driver,logInPom.class);
	lp.getUserName().sendKeys("TESTING2");
   
}
@Given("go to vizza poral")
public void go_to_vizza_poral() {
	System.out.println("2");
}
@When("provide valid username")
public void provide_valid_username() {
	System.out.println("3");
   
}
@When("provide valid password")
public void provide_valid_password() {
	System.out.println("4");
   
}
@When("click the submit button")
public void click_the_submit_button() {
	System.out.println("5");
}
@Then("user can see a home page")
public void user_can_see_a_home_page() {
	System.out.println("6");
}


}



