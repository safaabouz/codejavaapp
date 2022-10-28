package logInTests;

import static org.junit.Assert.assertNotNull;

import clinic.Contact;
import clinic.MyClinic;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mcontactsSteps {
	String username="";
	int userIndex;
	Contact contact= null;
	String newdata="";
	

	@Given("that the patient has a username {string}")
	public void that_the_patient_has_a_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    username = string;
	}

	@Given("the patient contects is null")
	public void the_patient_contects_is_null() {
	    // Write code here that turns the phrase above into concrete actions
	   userIndex = MyClinic.findPatientIndex(username); // finds the patient index in the arraylist of the system
	   System.out.print("The patient with username = " + username);
	   MyClinic.patients.get(userIndex).contact = null;
	   
	}
	@When("the patient enter {string} , {string} and {string} as contact information")
	public void the_patient_enter_and_as_contact_information(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		contact= new Contact(string, string2, string3);
	}


	@Then("add this patient as contact to the system")
	public void add_this_patient_as_contact_to_the_system() {
		
	    MyClinic.contacts.add(contact);
	    MyClinic.patients.get(userIndex).contact =contact;
	    System.out.println(" from now has a contact record in the system! ");
	    
	}
	
	//******************************************************************************************
	@Given("that the doctor has a username {string}")
	public void that_the_doctor_has_a_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		username = string;
	}

	@Given("the doctor contects is null")
	public void the_doctor_contects_is_null() {
	    // Write code here that turns the phrase above into concrete actions
		 userIndex = MyClinic.findDoctorIndex(username); // finds the patient index in the arraylist of the system
	     System.out.print("The doctor with username = " + username);
		 MyClinic.doctors.get(userIndex).contact = null;
	}

	@When("the doctor enter {string} , {string} and {string} as contact information")
	public void the_doctor_enter_and_as_contact_information(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		contact= new Contact(string, string2, string3);
	}

	@Then("add this doctor as contact to the system")
	public void add_this_doctor_as_contact_to_the_system() {
	    // Write code here that turns the phrase above into concrete actions
		 MyClinic.contacts.add(contact);
		 MyClinic.doctors.get(userIndex).contact =contact;
		 System.out.println(" from now has a contact record in the system! ");
	}
	
	//******************************************************************************************
	@Given("the doctor contects is not null")
	public void the_doctor_contects_is_not_null() {
		userIndex = MyClinic.findDoctorIndex(username);
		//System.out.print(username);
	    // Write code here that turns the phrase above into concrete actions
	     assertNotNull(MyClinic.doctors.get(userIndex).contact);
	}

	@When("the doctor enter {string} as the new address")
	public void the_doctor_enter_as_the_new_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    newdata = string;
	}

	@Then("the doctor contact will updated to hold the new address")
	public void the_doctor_contact_will_updated_to_hold_the_new_address() {
	    // Write code here that turns the phrase above into concrete actions
		
		int indexContact= MyClinic.contacts.indexOf(MyClinic.doctors.get(userIndex).contact);
		MyClinic.contacts.get(indexContact).setAddress(newdata);
		MyClinic.doctors.get(userIndex).contact.updateAddress(newdata);
		System.out.println("The doctor new contact is "+MyClinic.contacts.get(indexContact).getEmail()+"  " +MyClinic.contacts.get(indexContact).getAddress());
	}
	//******************************************************************************************
	@Given("the patient contects is not null")
	public void the_patient_contects_is_not_null() {
	    // Write code here that turns the phrase above into concrete actions
		userIndex = MyClinic.findPatientIndex(username);
	    assertNotNull(MyClinic.patients.get(userIndex).contact);
	}

	@When("the Admin tries to delete the pation contact record")
	public void the_admin_tries_to_delete_the_pation_contact_record() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Trying to delete patient contact record from the system");
	}

	@Then("delete this contact from the system")
	public void delete_this_contact_from_the_system() {
	    // Write code here that turns the phrase above into concrete actions	
		int indexContact= MyClinic.contacts.indexOf(MyClinic.patients.get(userIndex).contact);
		MyClinic.contacts.remove(indexContact);
		MyClinic.patients.get(userIndex).contact = null;
		System.out.println("The record was deleted successfully");
	}
}
