package clinic;

import java.time.LocalDate;
import java.time.LocalTime;

public class DoctorAppointment extends Appointment {
 DoctorAppointmentState state;

public DoctorAppointment(LocalDate date, LocalTime time, Doctor doctor,DoctorAppointmentState state) {
	super(date,time,doctor);
	this.state = state;
}

public DoctorAppointment() {
	// TODO Auto-generated constructor stub
}

public DoctorAppointmentState getState() {
	return state;
}

public void setState(DoctorAppointmentState state) {
	this.state = state;
}
 
}
