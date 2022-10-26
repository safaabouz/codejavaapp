package logInTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.*;

import clinic.Admin;
import clinic.ClinicUsers;
import clinic.Doctor;
import clinic.Patient;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class logInSteps {
		
	public User user;
	public String pass;
	public String username;
	void logInSteps(User user1) {
		this.user = user1;
	}
	
	 private ClinicUsers clinic;
	 private List<User> foundUsers;
	    
	    @Before
	    public void setUp() {
	    	//System.out.println("setup");
	    	clinic = new ClinicUsers();
	    	foundUsers = new ArrayList();
	    	user = new User();
	    }

	@Given("I have the following users in my clinic by list")
	public void iHaveTheFollowingUsersInMyClinicByList(io.cucumber.datatable.DataTable dataTable) {
		//System.out.println("hi");
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> rows = dataTable.asLists(String.class);
	    
	    
	    for (List<String> columns : rows) {
	    	User u =new User(columns.get(0), columns.get(1));
	    	clinic.addUser(u);
	    	int type = u.getType();
	    	clinic.genUsersTypes(type,columns.get(0), columns.get(1));
	    }
	}
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		user.setLogState(false);
	}


	@Given("the id is {string} and password is {string}")
	public void theIdIsAndPasswordIs(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 pass=string2;
		 username=string;
	}



	/*@Given("the username is {string} and password is {string}")
	public void theIdIsAndPasswordIs(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		  
	}
*/



	@Then("the admin login succeeds")
	public void theAdminLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		User u = clinic.findUser(username, pass);
		boolean succeeds;
		if(u !=null) {
		user = u;
		user.login();
		succeeds=true;	
		}
		else {
			succeeds=false;
		}

		assertTrue(succeeds);
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(user.getLogState());
	}

	@Then("the user login fails")
	public void theUserLoginFails() {
	    // Write code here that turns the phrase above into concrete actions
		User u = clinic.findUser(username, pass);
		boolean succeeds;
		if(u !=null) {
		user = u;
		user.login();
		succeeds=true;	
		}
		else {
			succeeds=false;
		}
		assertFalse(succeeds);
	}
	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(user.getLogState());
	}





}
