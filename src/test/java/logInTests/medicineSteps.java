package logInTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.*;
import clinic.Medicine;
import clinic.Admin;
import clinic.Appointment;
import clinic.MyClinic;
import clinic.Doctor;
import clinic.Patient;
import clinic.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class medicineSteps {
	
	public Medicine medicine;
	public String med_cost;
	public String med_name;
	public String comp_name;
	public String exp_date;
	public String pass;
	public String username;
	
	List<Patient> Patients;
	List<medicine> medicines;
	 private List<Patient> getmedicine;

	 @Before
	    public void Getme() {
	    	
		 getmedicine = new ArrayList();
	    	patient = new Patient();
	    }

	Patient patient  = new Patient();;

	
	public medicineSteps() {
		// TODO Auto-generated constructor stub
	}
	public List<Patient> getpatient() {
		// TODO Auto-generated method stub
		return this.Patients;
	}



@Given("I have the following medicine in my clinic by list")
public void i_have_the_following_medicine_in_my_clinic_by_list(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List<List<String>> rows = dataTable.asLists(String.class);
    
    
    for (List<String> columns : rows) {
    	Patient P =new Patient(columns.get(0), columns.get(1));
    	MyClinic.patients.add(P);
    	int type = P.getType();
    throw new io.cucumber.java.PendingException();}
}

@Given("that the patient is logged in")
public void that_the_patient_is_logged_in() {
	assertTrue(patient.getLogState());

    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the id is {string} and password is {string}")
public void the_id_is_and_password_is(String string, String string2) {
String	pass=string2;
String	 username=string;
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the patient get medicine succeeds")
public void the_patient_get_medicine_succeeds() {
	Patient p = MyClinic.getmedicine(med_name,med_cost, username,pass,exp_date,comp_name );
	boolean succeeds;
	if(p !=null) {
    patient =p;
    patient.login();
	succeeds=true;	
	}
	else {
		succeeds=false;
	}

	

	
	

    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("that the patient is not logged in")
public void that_the_patient_is_not_logged_in() {
	assertFalse(patient.getLogState());
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the patient don't get medicine succeeds and return null")
public void the_patient_don_t_get_medicine_succeeds_and_return_null() {
	System.out.println("No get medicine for this patient");
	   assertNull(medicines);
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}}
