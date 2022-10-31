package clinic;

import java.time.LocalDate;
import java.time.LocalTime;

public class PatientAppointment extends Appointment{
	PatientAppointmentState state;

	public PatientAppointment(LocalDate date, LocalTime time, Doctor doctor,
			PatientAppointmentState state) {
		super(date, time, doctor);
		this.state = state;
	}

	public PatientAppointmentState getState() {
		return state;
	}

	public void setState(PatientAppointmentState state) {
		this.state = state;
	}
	
}
