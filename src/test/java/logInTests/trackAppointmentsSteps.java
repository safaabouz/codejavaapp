package logInTests;

import static org.junit.Assert.assertNull;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import clinic.Admin;
import clinic.Appointment;
import clinic.MyClinic;
import clinic.Patient;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class trackAppointmentsSteps {
	Admin admin = new Admin();;
	Patient patient  = new Patient();;
	//public MyClinic c = new MyClinic();
	List <Appointment> appointments  = new ArrayList<Appointment>();;
	
	   
	   /* public void trackAppointmentsSteps() {
	    
		    //ClinicUsers c = logInSteps.clinic;
		    System.out.println("Hello this is c.toString "+c.toString());
	    	admin = new Admin();
	    	patient = new Patient();
	    	appointments = new ArrayList<Appointment>();
	    }

	*/
    @Given("that the administrator with username {string} is logged in")
    public void that_the_administrator_with_username_is_logged_in(String string) {
    	System.out.println("Hello");
       admin= MyClinic.getAdmin(string);
       System.out.println("admin"+admin.getLogState());
       admin.setLogState(true);
    }


    @Given("there is a registered patient with username {string}")
    public void there_is_a_registered_patient_with_username(String string) {
        // Write code here that turns the phrase above into concrete actions
    	patient= MyClinic.getPatient(string);
    }

	@When("the admin tries to reache the patient appointments")
	public void the_admin_tries_to_reache_the_patient_appointments() {
	    // Write code here that turns the phrase above into concrete actions
	  appointments = patient.getAppointments();
	}

	@Then("he will get a null value")
	public void he_will_get_a_null_value() {
		
	   assertNull(appointments);
	}

}
