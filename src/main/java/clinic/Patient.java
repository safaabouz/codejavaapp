package clinic;

import java.util.List;

public class Patient extends User {
	List<Appointment> appointments;
	List<Appointment> visits;
	public Contact contact;

	public Patient(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string,string2);
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public List<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return this.appointments;
	}
	public List<Appointment> getVisites() {
		// TODO Auto-generated method stub
		return this.visits;
	}

}
