package clinic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Appointment {
	LocalDate date ;
	LocalTime time;
	String note;
	Doctor doctor;
	
	public Appointment(LocalDate date, LocalTime time, String note, Doctor doctor) {
		this.date = date;
		this.time = time;
		this.note = note;
		this.doctor = doctor;
	}
	

}
