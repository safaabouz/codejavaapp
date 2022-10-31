package logInTests;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import clinic.Appointment;
import clinic.PatientAppointment;

import clinic.MyClinic;
import clinic.PatientAppointmentState;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class mcAppointmentStateSteps {
	
	//Appointment app;
	String myState;
	boolean stateCheck;
	boolean hasAppointments;
	boolean appointmentIsToday=false;
	LocalTime nowTime = LocalTime.now();
	//LocalTime appTime = app.getLocalTime();
	LocalDate nowDate=LocalDate.now();
	//LocalDate appDate = app.getLocalDate();
	//Boolean timeIsLate = nowTime.isAfter( appTime );
	//Boolean dateIsLate = nowTime.isAfter( appTime );
	List <PatientAppointment> patientAppointments = new ArrayList <PatientAppointment>();
	
	public int patientIndex;
	int appointmentIndex;
	
	@Given("the patient with username {string} booked an appointment")
	public void the_patient_with_username_booked_an_appointment(String string) {
		patientIndex = MyClinic.findPatientIndex(string);
		hasAppointments= MyClinic.patients.get(patientIndex).getAppointments().isEmpty();
		assertFalse(hasAppointments);
		System.out.println("he has booked appointments");
		
		
	}
	
	

@Given("the appointment is today")
public void the_appointment_is_today() {
    // Write code here that turns the phrase above into concrete actions
	patientAppointments= MyClinic.patients.get(patientIndex).getAppointments();
	for(int i=0;i<patientAppointments.size();i++)
	 {  
		
		if(MyClinic.patients.get(patientIndex).getAppointments().get(i).getLocalDate().equals(nowDate)) {
			appointmentIsToday=true;
			appointmentIndex=i;
			System.out.println("he has appointment Today");

			break;
			
		}
		
	}
}

	@Given("the patient came to his appointment")
	public void the_patient_came_to_his_appointment() {
		
        assertTrue(appointmentIsToday);	
        stateCheck=true;
		System.out.println("he came to the appointment");

	}

	@Then("the visit state will be converted to visited")
	public void the_visit_state_will_be_converted_to_visited() {
		MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).setState(PatientAppointmentState.Visited);
		System.out.println(" convert to Visited ");

	}

	@Then("the visit notes {string} will be added")
	public void the_visit_notes_will_be_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
		MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).setNote(string);
		System.out.println("note added");

	}

	@Given("the appointment out of date without visiting")
	public void the_appointment_out_of_date_without_visiting() {
	
	if(appointmentIsToday && nowTime.isAfter(MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).getLocalTime())  ) {
		stateCheck=false;
		System.out.println("he missed an appointment");

	}
		

	
	}

	@Then("the visit state will be converted to missed")
	public void the_visit_state_will_be_converted_to_missed() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(stateCheck);
		MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).setState(PatientAppointmentState.Missed);
		System.out.println("converted to missed");

	}

}
