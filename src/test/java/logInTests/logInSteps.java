package logInTests;

import static org.junit.Assert.assertTrue;


import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import logIn.Data;

public class logInSteps {

	boolean availableId;
	boolean correctPass;
	


	int id;
	 String pass;

	@Given("that username is available")
	public void that_username_is_available() {
	 availableId=Data.checkIdIsAvailable( id);
	}

	@Given("passowrd is correct")
	public void passowrd_is_correct() {
     correctPass=Data.checkPassIsMatching( id,pass);

	}

	@Then("login succeeds")
	public void login_succeeds() {
	  assertTrue(correctPass && correctPass);
	}
	
	//2
	
	@Given("that username is correct")
	public void that_username_is_correct() {
	 availableId=Data.checkIdIsAvailable( id);
	}

	@Given("passowrd is not correct")
	public void passowrd_not_is_correct() {
     correctPass=Data.checkPassIsMatching( id ,pass);

	}

	@Then("login fails wrong password")
	public void login_fails_wrong_password() {
	  assertTrue(!correctPass && availableId );
	}
	
	//3
	
	@Given("that username is not correct")
	public void that_username_is_not_correct() {
	 availableId=Data.checkIdIsAvailable( id);
	}

	@Given("passowrd is correct")
	public void passowrd_is_correctt() {
     correctPass=Data.checkPassIsMatching( id ,pass);

	} 
	
	@Then("login fails no user")
	public void login_fails_no_user() {
	  assertTrue(correctPass && !availableId );
	}
	
	//4
	
	@Given("that username is not correct")
	public void that_username_is_not_correctt() {
	 availableId=Data.checkIdIsAvailable( id);
	}

	@Given("passowrd is not correct")
	public void passowrd_is_not_correctt() {
     correctPass=Data.checkPassIsMatching( id ,pass);

	} 
	
	@Then("login fails")
	public void login_fails() {
	  assertTrue(!correctPass && !availableId );
	}
}
