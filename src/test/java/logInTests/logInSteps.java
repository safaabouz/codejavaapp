package logInTests;

import static org.junit.Assert.assertTrue;

import java.util.*;

import clinic.ClinicUsers;
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
	/*@Given("the User is on loginPage")
	public void theUserIsOnLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the User enters {int} and {String} ")
	public void theUserEntersAndA2d1m4in3(Integer id1,String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the User should land on Admin Page")
	public void theUserShouldLandOnAdminPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


*/
	/*@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		user.setLogState(false);
	}
	@Given("the id is {int} and password is {string}")
	public void theUsernameIsAndPasswordIs(int i, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    id = i;
	    pass = string;
	}
	@Then("the admin logs in to Admin Page")
	public void theAdminLogsInToAdminPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

*/
	 private ClinicUsers clinic;
	    private List<User> foundUsers;
	    
	    @Before
	    public void setUp() {
	    	clinic = new ClinicUsers();
	    	foundUsers = new ArrayList();
	    }

	@Given("I have the following users in my clinic by list")
	public void iHaveTheFollowingUsersInMyClinicByList(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> rows = dataTable.asLists(String.class);
	    
	    
	    for (List<String> columns : rows) {
	    	clinic.addUser(new User(columns.get(0), columns.get(1),Integer.parseInt(columns.get(2))));
	    }
	}
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		user.setLogState(false);
	}
	@Given("the username is {string} and password is {string}")
	public void theIdIsAndPasswordIs(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   pass=string2;
	   username=string1;
	}
	@Then("the admin login succeeds")
	public void theAdminLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
