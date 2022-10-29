package clinic;

import java.time.LocalDate;
import java.time.LocalTime;

public class PatientAppointment extends Appointment{
	PatientAppointmentState state;

	public PatientAppointment(LocalDate date, LocalTime time, String note, Doctor doctor,
			PatientAppointmentState state) {
		super(date, time, note, doctor);
		this.state = state;
	}
	
}
