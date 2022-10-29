package logInTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.*;

import clinic.Admin;
import clinic.MyClinic;
import clinic.Doctor;
import clinic.Patient;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class medicine {
	String med_name;
	String comp_name;
	String exp_date;
	
    int med_cost, count;

	
	public medicine(String medname,String compname,String expdate,int medcost ,int Count){
		
		med_name=medname;
		comp_name=compname;
		exp_date=expdate;
		med_cost=medcost;
	    count=Count;
	}
	public medicine() {
		// TODO Auto-generated constructor stub
	}

}




@Given("that the administrator with username {string} is logged in")
public void that_the_administrator_with_username_is_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("there is a registered patient with username {string}")
public void there_is_a_registered_patient_with_username(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the patient did not visit the doctor on time")
public void the_patient_did_not_visit_the_doctor_on_time() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("he will get a null value")
public void he_will_get_a_null_value() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("there is registered patient with username {string}")
public void there_is_registered_patient_with_username(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the patient visits the doctor at the appointed time")
public void the_patient_visits_the_doctor_at_the_appointed_time() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("get the medicine with mid-name {string}")
public void get_the_medicine_with_mid_name(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("he will get a invoice for the patient")
public void he_will_get_a_invoice_for_the_patient() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("do not get the medicine")
public void do_not_get_the_medicine() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}