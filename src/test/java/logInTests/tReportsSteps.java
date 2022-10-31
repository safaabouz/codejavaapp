package logInTests;

import static org.junit.Assert.assertTrue;

import clinic.Admin;
import clinic.MyClinic;
import clinic.Patient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class tReportsSteps {
	
	Admin admin = new Admin();
	Patient patient  = new Patient();
	boolean usernamesReport=false;
	String username;
	int patientIndex;
	boolean appointmentsReport=false;
	String patientAppointments=" ";
	String appointmentInfo;
	
	
	
	
@Given("the admin requests a report for all usernames")
public void the_admin_requests_a_report_for_all_usernames() {
    // Write code here that turns the phrase above into concrete actions
	
   for(int i=0;i< MyClinic.patients.size();i++) {
	   username =  MyClinic.patients.get(i).getUsername() + " , ";
	    System.out.println(username);

	   username.concat(username);
   }
    System.out.println(username);
    if(!username.equals(null)) usernamesReport=true;
    
}

@Then("the report will be generated successfully")
public void the_report_will_be_generated_successfully() {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(usernamesReport);
}


@Given("that the administrator with username {string} is logged in1")
public void that_the_administratoe_with_username_is_logged_in1(String string) {
    // Write code here that turns the phrase above into concrete actions
	admin= MyClinic.getAdmin(string);
       admin.setLogState(true);	
       }

@Given("the admin requests a report for patient {string} appointments")
public void the_admin_requests_a_report_for_user_appointments(String string) {
    // Write code here that turns the phrase above into concrete actions

		patient=MyClinic.getPatient(string);
		for(int i=0;i<patient.getAppointments().size();i++) {
			appointmentInfo= patient.getAppointments().get(i).getDate() + " ," + patient.getAppointments().get(i).getTime()+" ," + patient.getAppointments().get(i).getDoctor() + "\n";
			patientAppointments.concat(appointmentInfo);
		}
	System.out.println(patientAppointments);
	if(!patientAppointments.equals(null))
		appointmentsReport = true;
}

@Then("the appointments report will be generated successfully")
public void the_appointments_report_will_be_generated_successfully() {
    // Write code here that turns the phrase above into concrete actions
  assertTrue(appointmentsReport);

}
}
