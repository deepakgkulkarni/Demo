package stepDefinitations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitation {

    @Given("Navigate to facebook login page")
    public void navigate_to_facebook_login_page() throws Throwable {
    System.out.println("Login");
    }

    @When("Enter the user name and password and click on submit button")
    public void enter_the_user_name_and_password_and_click_on_submit_button() throws Throwable {
    	 System.out.println("Login_ submit");
    }

    @Then("User should be logged into the facebook account")
    public void user_should_be_logged_into_the_facebook_account() throws Throwable {
    	System.out.println("Login_ feedback");
    }

    @And("User should see the home page")
    public void user_should_see_the_home_page() throws Throwable {
    	System.out.println("Login_ home");
    }

}