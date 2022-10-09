package logInTests;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import logIn.Data;

public class logInSteps {

	int availableId;
	boolean correctPass=false;
	

	
	
	int id;
	 String pass;

	@Given("that username is available")
	public void that_username_is_available() {
	 availableId=Data.checkIdIsAvailable( id);
	}

	@Given("passowrd is correct")
	public void passowrd_is_correct() {
     correctPass=Data.checkPassIsMatching( availableId,pass);

	}

	@Then("login succeeds")
	public void login_succeeds() {
	  
	}

	@Then("the user logged in")
	public void the_user_logged_in() {
	
	}
}
