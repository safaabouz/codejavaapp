package logInTests;

import clinic.Admin;
import clinic.MyClinic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class zDisplaySteps {
	Admin admin;
	@Given("that an admin with username {string} is logged in")
	public void that_an_admin_with_username_is_logged_in(String string) {
		 admin= MyClinic.getAdmin(string);
	      admin.setLogState(true);
	}

	@When("the admin tries to display the clinic doctors")
	public void the_admin_tries_to_display_the_clinic_doctors() {
	   System.out.println("\n"+"Tring to Display all Doctors in the Clinic");
	}

	@Then("a list of Doctors will be prented")
	public void a_list_of_doctors_will_be_prented() {
	   admin.displayAllDoctors();
	}
	
	@When("the admin tries to display the clinic patients")
	public void the_admin_tries_to_display_the_clinic_patients() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\n"+"Tring to Display all Patients in the Clinic");
	}

	@Then("a list of patients will be prented")
	public void a_list_of_patients_will_be_prented() {
	    // Write code here that turns the phrase above into concrete actions
		admin.displayAllPatients();
	}

}
