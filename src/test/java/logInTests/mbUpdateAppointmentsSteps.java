package logInTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import clinic.MyClinic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mbUpdateAppointmentsSteps {
String userName;
int patientIndex;
int pAppoitmentIndex;
int dAppoitmentIndex;
boolean updated;
@Given("that the patient with username {string} is logged in")
public void that_the_patient_with_username_is_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
	patientIndex =MyClinic.findPatientIndex(string);
	MyClinic.patients.get(patientIndex).setLogState(true);
}

@Given("there is a booked appintment for this patient on {string} at {string}")
public void there_is_a_booked_appintment_for_this_patient_on_at(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	pAppoitmentIndex = MyClinic.patients.get(patientIndex).findAppoitment(string,string2);
	//System.out.println("hii");
}

@When("the user tries to update this appoitment")
public void the_user_tries_to_update_this_appoitment() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("\nTrying to Update ... ");
}
@Then("error massage {string} will display")
public void error_massage_will_display(String string) {
    // Write code here that turns the phrase above into concrete actions
   assertEquals(-1, pAppoitmentIndex);
   System.out.println(string+"\n");
}

@When("set the date on {string} and the same time")
public void set_the_date_on_and_the_same_time(String string) {
    // Write code here that turns the phrase above into concrete actions
 updated=  MyClinic.patients.get(patientIndex).updateAppointmentDate(string , pAppoitmentIndex);
}

@Then("the appoitment will updated")
public void the_appoitment_will_updated() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	assertTrue(updated);
}
@When("set the time at {string} and on the same date")
public void set_the_time_at_and_on_the_same_date(String string) {
    // Write code here that turns the phrase above into concrete actions
	 updated=  MyClinic.patients.get(patientIndex).updateAppointmentTime(string , pAppoitmentIndex);
}
}
