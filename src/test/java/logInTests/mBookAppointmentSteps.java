package logInTests;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import clinic.MyClinic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mBookAppointmentSteps {
	@Given("I have these Doctors in my Clinic")
	public void i_have_these_doctors_in_my_clinic(io.cucumber.datatable.DataTable dataTable) {
		int doctorIndex;
		String usernameString;
		double startHour;
		double endHour;
		String days;
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
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("that the user with username {string} is logged in")
	public void that_the_user_with_username_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("there is an appintment for doctor {string} on {string} at {string}")
	public void there_is_an_appintment_for_doctor_on_at(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("the user tries to book this appointment")
	public void the_user_tries_to_book_this_appointment() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("error massage {string} should display")
	public void error_massage_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

}
