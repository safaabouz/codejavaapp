package clinic;

import java.util.List;

public class Doctor extends User {

	public Contact contact;
	List<DoctorAppointment> appointments;
	public Doctor(String string, String string2) {
		super(string,string2);
	}

}
