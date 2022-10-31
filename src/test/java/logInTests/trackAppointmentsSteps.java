package logInTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import clinic.Admin;
import clinic.Appointment;
import clinic.MyClinic;
import clinic.Patient;
import clinic.PatientAppointment;
import clinic.PatientAppointmentState;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class trackAppointmentsSteps {
	Admin admin = new Admin();
	Patient patient  = new Patient();
	//public MyClinic c = new MyClinic();
	List <PatientAppointment> appointments  = new ArrayList<PatientAppointment>();
	List <PatientAppointment> bookedAppointments  = new ArrayList<PatientAppointment>();
	List <PatientAppointment> visitedAppointments  = new ArrayList<PatientAppointment>();


	
	   
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
    
       admin= MyClinic.getAdmin(string);
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
	  for(int i=0;i< appointments.size();i++) {
		  if(appointments.get(i).getState().equals(PatientAppointmentState.Booked)) {
			  
		  
			  bookedAppointments.add(appointments.get(i));
	  }
	  }
	}

	@Then("he will get a null value")
	public void he_will_get_a_null_value() {
		boolean isNull = false;
		System.out.println("No Booked Appointments for this patient");
		if(bookedAppointments.isEmpty()) isNull=true;
	    assertTrue(isNull);
	}
	@Then("he will get a record for the patient")
	public void he_will_get_a_record_for_the_patient() {
	    // Write code here that turns the phrase above into concrete actions
		boolean isNull = false;
		if(bookedAppointments.isEmpty()) isNull=true;
	    assertFalse(isNull);
		System.out.println("This is the Appointments List for this patient");
		for(int i=0;i<bookedAppointments.size();i++) {
			System.out.print(bookedAppointments.get(i).getLocalDate());
			System.out.print("          ");
			System.out.println(bookedAppointments.get(i).getLocalTime());
		}
		
		
	}
	
	
	@Given("that the admin with username {string} is logged in")
	public void that_the_admin_with_username_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		admin= MyClinic.getAdmin(string);
	       admin.setLogState(true);	}

	@Given("there is a registered patient with the username {string}")
	public void there_is_a_registered_patient_with_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
    	patient= MyClinic.getPatient(string);
	}

	
	@When("the admin tries to reache the patient visited appointments")
	public void the_admin_tries_to_reache_the_patient_visited_appointments() {
	    // Write code here that turns the phrase above into concrete actions
		appointments = patient.getAppointments();
		  for(int i=0;i< appointments.size();i++) {
			  if(appointments.get(i).getState().equals(PatientAppointmentState.Booked)) {
				  
			  
				  visitedAppointments.add(appointments.get(i));
		  }
		  }	}

	@Then("he will get a record for his visited appointments")
	public void he_will_get_a_record_for_his_visited_appointments() {
	    // Write code here that turns the phrase above into concrete actions
		boolean isNull = false;
		if(visitedAppointments.isEmpty()) isNull=true;
	    assertFalse(isNull);	}

}
