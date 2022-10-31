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
	public LocalTime getLocalTime() {
		return time;
	}

	public LocalDate getLocalDate() {
		return date;
	}
	
	public Appointment() {
	
	}
	public Appointment(LocalDate date, LocalTime time, Doctor doctor) {
		this.date = date;
		this.time = time;
		this.doctor = doctor;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}