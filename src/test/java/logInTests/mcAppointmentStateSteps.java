package logInTests;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;

import clinic.Appointment;
import clinic.PatientAppointmentState;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class mcAppointmentStateSteps {
	
	PatientAppointmentState state;
	Appointment app;
	String myState;
	boolean stateCheck;

	LocalTime nowTime = LocalTime.now();
	LocalTime appTime = app.getLocalTime();
	LocalDate nowDate=LocalDate.now();
	LocalDate appDate = app.getLocalDate();
	Boolean timeIsLate = nowTime.isAfter( appTime );
	Boolean dateIsLate = nowTime.isAfter( appTime );
	
	@Given("the patient with username {string} booked an appointment")
	public void the_patient_with_username_booked_an_appointment(String string) {
      myState="Booked";
      if(myState.equals(state.toString())) {
    	  stateCheck=true;
      }
      else stateCheck=false;
	}
	

	@Given("the patient came to his appointment")
	public void the_patient_came_to_his_appointment() {
		

	}

	@Then("the visit state will be converted to visited")
	public void the_visit_state_will_be_converted_to_visited() {
		if(stateCheck)
	    assertTrue(myState.equals(state.toString()));
	}

	@Then("the visit notes will be added")
	public void the_visit_notes_will_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("the appointment out of date without visiting")
	public void the_appointment_out_of_date_without_visiting() {
	
	
		
		if(dateIsLate || (!dateIsLate && timeIsLate)) {
			myState="Missed";
		}

	
	}

	@Then("the visit state will be converted to missed")
	public void the_visit_state_will_be_converted_to_missed() {
	    // Write code here that turns the phrase above into concrete actions
		if(stateCheck)
	    assertTrue(myState.equals(state.toString()));

	}

}
;