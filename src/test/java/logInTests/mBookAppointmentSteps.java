package logInTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
	boolean isPast;
	boolean isBooked;
	boolean canBook = true;
	LocalTime time;
	LocalDate date;
	@Given("I have these Doctors in my Clinic")
	public void i_have_these_doctors_in_my_clinic(io.cucumber.datatable.DataTable dataTable) {
		int doctorIndex;
	    for(int i=0;i<dataTable.height();i++) {
	    	
	    	doctorIndex =MyClinic.findDoctorIndex(dataTable.cell(i,0));
	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	    	MyClinic.doctors.get(doctorIndex).startHour = LocalTime.parse(dataTable.cell(i,1));
	    	MyClinic.doctors.get(doctorIndex).endHour = LocalTime.parse(dataTable.cell(i,2));
	    	MyClinic.doctors.get(doctorIndex).setOffDays(dataTable.cell(i,3));
	    	MyClinic.doctors.get(doctorIndex).createAppointmentList();
	    }
	   
	}

	@Given("these already booked appointments")
	public void these_already_booked_appointments(io.cucumber.datatable.DataTable dataTable) {
		//= MyClinic.findDoctorIndex(dataTable.cell(i,0));
		
		int doctorIndex;
		for(int i=0;i<dataTable.height();i++) {
			DoctorAppointment  appointment = new DoctorAppointment();
			
				doctorIndex =MyClinic.findDoctorIndex(dataTable.cell(i,0));
				
				//System.out.println("doctor index "+doctorIndex);
				LocalDate date = LocalDate.parse(dataTable.cell(i,1));
				LocalTime time = LocalTime.parse(dataTable.cell(i,2));
				int appIndex =MyClinic.doctors.get(doctorIndex).findAppointment(date,time);		
				//System.out.println("app index "+appIndex);
				MyClinic.doctors.get(doctorIndex).appointments.get(appIndex).setState(DoctorAppointmentState.Booked);
				
		}
		//DoctorAppointment appointment = new DoctorAppointment(dateOfAppointment,timeofAppointmen,this,DoctorAppointmentState.Avialable)
		
	}

	@Given("that the user with username {string} is logged in")
	public void that_the_user_with_username_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		patientIndex =MyClinic.findPatientIndex(string);
		MyClinic.patients.get(patientIndex).setLogState(true);
	}

	@Given("there is an appintment for doctor {string} on {string} at {string}")
	public void there_is_an_appintment_for_doctor_on_at(String userString, String dateString, String timeString) {
	    // Write code here that turns the phrase above into concrete actions
		time = LocalTime.parse(timeString);
		date = LocalDate.parse(dateString);
		doctorIndex = MyClinic.findDoctorIndex(userString);
		appointmentIndex=	MyClinic.doctors.get(doctorIndex).findAppointment(date,time);	
		isPast= LocalTime.now().isAfter(LocalTime.parse(timeString));
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
		for(int i=0;i< MyClinic.patients.get(patientIndex).getAppointments().size();i++) {
		
			if(MyClinic.patients.get(patientIndex).getAppointments().get(i).getLocalDate().equals(date) &&
					MyClinic.patients.get(patientIndex).getAppointments().get(i).getLocalTime().equals(time) ) {
						canBook = false;
			}
		}
	  // MyClinic.patients.get(patientIndex).getAppointments()
	}
	@Then("this appointment will booked successfully")
	public void this_appointment_will_booked_successfully() {
		
		 assertNotEquals(-1, appointmentIndex);
		 assertFalse(isPast);
		 assertFalse(isBooked);
		 assertTrue(canBook);
		 MyClinic.patients.get(patientIndex).getAppointments()
		 .add (new PatientAppointment(date, time, MyClinic.doctors.get(doctorIndex),PatientAppointmentState.Booked));
		 MyClinic.doctors.get(doctorIndex).appointments.get(appointmentIndex).setState(DoctorAppointmentState.Booked);
		 System.out.println("Booked successfully");
	}
	
	@Then("conflict in appointments will occurs")
	public void conflict_in_appointments_will_occurs() {
	    // Write code here that turns the phrase above into concrete actions
		 assertFalse(canBook);
		 System.out.println("You have an already booked appointment at this time");
	}
}
