package clinic;

import java.util.ArrayList;
import java.util.List;



public class Patient extends User {
	
	List<PatientAppointment> appointments = new ArrayList<PatientAppointment>();
	List<Appointment> visits;
	List<Medicine> medicines;

	public Contact contact;

	public Patient(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string,string2);
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public List<PatientAppointment> getAppointments() {
		// TODO Auto-generated method stub
		return this.appointments;
	}
	public List<Appointment> getVisites() {
		// TODO Auto-generated method stub
		return this.visits;
	}

}
