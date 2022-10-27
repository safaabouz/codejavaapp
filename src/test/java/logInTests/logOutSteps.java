package logInTests;

import static org.junit.Assert.assertFalse;

import clinic.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logOutSteps {
	public User u = new User();
	
	/*public logOutSteps(User uu) {
		System.out.println("logout feature");
		u=uu;
	}*/
	@Given("that the User is logged in")
	public void that_the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		
	   u.setLogState(true);
	}

	@When("the User logs out")
	public void the_user_logs_out() {
	    // Write code here that turns the phrase above into concrete actions
	   u.logout();
	}

	@Then("the User is not logged in")
	public void the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   u.setLogState(false);
	   assertFalse( u.getLogState());
	   System.out.println("Logged out");
	}
}
