package clinic;

import java.time.LocalDate;
import java.time.LocalTime;
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

	public boolean checkConflictAppointments(LocalDate date, LocalTime time) {
		boolean canBook = true;
		for(int i=0;i< this.getAppointments().size();i++) {
			
			if(this.getAppointments().get(i).getLocalDate().equals(date) &&
					this.getAppointments().get(i).getLocalTime().equals(time) ) {
						canBook = false;
			}
		}
		return canBook;
	}

	public void bookAppointment(LocalDate date, LocalTime time, Doctor doctor) {
		 this.getAppointments().add (new PatientAppointment(date, time, doctor,PatientAppointmentState.Booked));
		
	}

	public int findAppoitment(String string, String string2) {
		int index = -1;
		
		for(int i=0;i<appointments.size();i++) {
			if(appointments.get(i).date.isEqual(LocalDate.parse(string))&&
					appointments.get(i).time.equals(LocalTime.parse(string2))) {
				index =i;
				break;
			}
		}
		return index;
	}

	public boolean updateAppointmentDate(String string, int pAppoitmentIndex) {
		boolean updated;
		Doctor doctor = appointments.get(pAppoitmentIndex).doctor;
		LocalDate date1 = LocalDate.parse(string);
		int dAppoitmentIndex =doctor.findAppointment(date1, appointments.get(pAppoitmentIndex).time);
		if(dAppoitmentIndex != -1 && !doctor.appointments.get(dAppoitmentIndex).state.equals(DoctorAppointmentState.Booked)&&
				this.findAppoitment(string,appointments.get(pAppoitmentIndex).time.toString()) == -1) {
			appointments.get(pAppoitmentIndex).date = date1;
			doctor.appointments.get(dAppoitmentIndex).state=DoctorAppointmentState.Booked;
			int oldApp =doctor.findAppointment(appointments.get(pAppoitmentIndex).date, appointments.get(pAppoitmentIndex).time);
			doctor.appointments.get(oldApp).state=DoctorAppointmentState.Avialable;
			System.out.println("Update successfully");
			updated= true;
		}
		else {
			
			System.out.println("Couldn't Update!");
			updated= false;
		}
		return updated;
		
	}

	public boolean updateAppointmentTime(String string, int pAppoitmentIndex) {
		boolean updated;
		Doctor doctor = appointments.get(pAppoitmentIndex).doctor;
		
		LocalTime time1 = LocalTime.parse(string);
		int dAppoitmentIndex =doctor.findAppointment(appointments.get(pAppoitmentIndex).date, time1);
		if(dAppoitmentIndex != -1 && !doctor.appointments.get(dAppoitmentIndex).state.equals(DoctorAppointmentState.Booked  )&&
				this.findAppoitment(appointments.get(pAppoitmentIndex).date.toString(), string) == -1) {
			
			appointments.get(pAppoitmentIndex).time = time1;
			doctor.appointments.get(dAppoitmentIndex).state=DoctorAppointmentState.Booked;
			int oldApp =doctor.findAppointment(appointments.get(pAppoitmentIndex).date, appointments.get(pAppoitmentIndex).time);
			doctor.appointments.get(oldApp).state=DoctorAppointmentState.Avialable;
			System.out.println("Update successfully");
			updated= true;
		}
		else {
			
			System.out.println("Couldn't Update!");
			updated= false;
		}
		return updated;
	}

}
