package clinic;

import java.time.LocalDate;
import java.time.LocalTime;


public class Appointment {
	LocalDate date ;
	LocalTime time;
	String note;
	Doctor doctor;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
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