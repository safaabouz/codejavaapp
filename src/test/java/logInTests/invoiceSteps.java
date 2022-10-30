package logInTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.*;
import clinic.Invoice;

import clinic.Medicine;
import clinic.Admin;
import clinic.MyClinic;
import clinic.Doctor;
import clinic.Patient;
import clinic.PatientAppointment;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invoiceSteps {
	
	Admin admin = new Admin();;
	Doctor doctor = new Doctor(null, null);;
	Patient patient  = new Patient();;
	//public MyClinic c = new MyClinic();
	List <Invoice> invoices  = new ArrayList<Invoice>();;
	
	
	@Given("that the User have an appointment on {string}")
	public void that_the_user_have_an_appointment_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the appointment has {string} service")
	public void the_appointment_has_service(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the invoice value is the sum of doctorcost and medcost")
	public void the_invoice_value_is_the_sum_of_doctorcost_and_medcost() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the invoice generated successfully")
	public void the_invoice_generated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the invoice value is the doctorcost {string}")
	public void the_invoice_value_is_the_doctorcost(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the invoice value is {string}")
	public void the_invoice_value_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	



/*@Given("that the administrator with username {string} is logged in")
public void that_the_administrator_with_username_is_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
	
	 admin= MyClinic.getAdmin(string);
     admin.setLogState(true);
     
    throw new io.cucumber.java.PendingException();
}*/

/*@Given("there is a registered patient with username {string}")
public void there_is_a_registered_patient_with_username(String string) {
    // Write code here that turns the phrase above into concrete actions
	
	patient= MyClinic.getPatient(string);
	patient.setLogState(true);
    throw new io.cucumber.java.PendingException();
}
*/
/*@When("the patient did not visit the doctor on time")
public void the_patient_did_not_visit_the_doctor_on_time() {
    // Write code here that turns the phrase above into concrete actions
	
    throw new io.cucumber.java.PendingException();
}

/*@Then("he will get a null value")
public void he_will_get_a_null_value() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("No invoice for this patient");
	   assertNull(invoices);
   // throw new io.cucumber.java.PendingException();
}*/

/*@Given("there is registered patient with username {string}")
public void there_is_registered_patient_with_username(String string) {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}*/

/*@When("the patient visits the doctor at the appointed time")
public void the_patient_visits_the_doctor_at_the_appointed_time() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("get the medicine with mid-name {string}")
public void get_the_medicine_with_mid_name(String string) {
	

    // Write code here that turns the phrase above into concrete actions
 //   throw new io.cucumber.java.PendingException();
}

@Then("he will get a invoice for the patient")
public void he_will_get_a_invoice_for_the_patient() {
	int med_cost=0;
	int doctor_cost=0;
	int count = doctor_cost+med_cost;
	System.out.println(count);

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("do not get the medicine")
public void do_not_get_the_medicine() {
    // Write code here that turns the phrase above into concrete actions
	Object doctor_cost=0;
	Object count = doctor_cost;
	System.out.println("logging in into Invoice Page");
	System.out.println(count);

   // throw new io.cucumber.java.PendingException();
}}*/