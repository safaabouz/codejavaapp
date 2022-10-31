package logInTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import clinic.Admin;
import clinic.Appointment;
import clinic.Doctor;
import clinic.DoctorAppointment;
import clinic.DoctorAppointmentState;
import clinic.MyClinic;
import clinic.PatientAppointment;
import clinic.PatientAppointmentState;
import io.cucumber.java.bs.I.Is;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mBookAppointmentSteps {
	int patientIndex;
	int doctorIndex;
	int appointmentIndex;
	String userName;
	Admin admin = new Admin();
	boolean isPast =false;
	boolean isBooked;
	boolean canBook = true;
	LocalTime time;
	LocalDate date;
	@Given("I have these Doctors in my Clinic")
	public void i_have_these_doctors_in_my_clinic(io.cucumber.datatable.DataTable dataTable) {
		
		admin.addDoctorsInformation(dataTable);
		
	}

	@Given("these already booked appointments")
	public void these_already_booked_appointments(io.cucumber.datatable.DataTable dataTable) {
		
		admin.setSomeAppointmentsAsBooked(dataTable);
		
	}

	@Given("that the user with username {string} is logged in")
	public void that_the_user_with_username_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		patientIndex =MyClinic.findPatientIndex(string);
		MyClinic.patients.get(patientIndex).setLogState(true);
	}

	@Given("there is an appintment for doctor {string} on {string} at {string}")
	public void there_is_an_appintment_for_doctor_on_at(String userString, String dateString, String timeString) {
	    userName = userString;
		time = LocalTime.parse(timeString);
		date = LocalDate.parse(dateString);
		doctorIndex = MyClinic.findDoctorIndex(userString);
		appointmentIndex=	MyClinic.doctors.get(doctorIndex).findAppointment(date,time);	
		
		if(LocalDate.now().isBefore(date) ) {
			isPast = false;
		}
		else if(LocalDate.now().isAfter(date)){
			isPast=true;
		}
		else if(LocalTime.now().isAfter(time)){
			isPast=true;
		}
		//isPast= 
			//	LocalTime.now().isAfter(LocalTime.parse(timeString));
		if(appointmentIndex != -1) {
			if(MyClinic.doctors.get(doctorIndex).appointments.get(appointmentIndex).getState() == DoctorAppointmentState.Booked)
			isBooked= true;
		}
	}

	@When("the user tries to book this appointment")
	public void the_user_tries_to_book_this_appointment() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Trying to book this appontment");
	}

	@Then("error massage {string} should display")
	public void error_massage_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	 try {
		 assertEquals(-1, appointmentIndex);
	} catch (AssertionError e) {
		try {
			assertTrue(isPast);
		} catch (AssertionError e2) {
			assertTrue(isBooked);
		}
	}
	 System.out.println(string);
	}
	@When("the user dosen't have any appointments at the same time")
	public void the_user_dosen_t_have_any_appointments_at_the_same_time() {
	    // Write code here that turns the phrase above into concrete actions
		
		canBook=MyClinic.patients.get(patientIndex).checkConflictAppointments(date,time);
		
	}
	@Then("this appointment will booked successfully")
	public void this_appointment_will_booked_successfully() {
		
		 assertNotEquals(-1, appointmentIndex);
		 assertFalse(isPast);
		 assertFalse(isBooked);
		 assertTrue(canBook);
		 MyClinic.patients.get(patientIndex).bookAppointment(date,time,MyClinic.doctors.get(doctorIndex));
		 admin.setDoctorAppointmentAsBooked(userName,appointmentIndex);
		 System.out.println("Booked successfully");
	}
	
	@Then("conflict in appointments will occurs")
	public void conflict_in_appointments_will_occurs() {
	    // Write code here that turns the phrase above into concrete actions
		 assertFalse(canBook);
		 System.out.println("You have an already booked appointment at this time");
	}
}
