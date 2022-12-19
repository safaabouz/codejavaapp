package clinic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public class Patient extends User {
	
	public List<PatientAppointment> appointments = new ArrayList<PatientAppointment>();
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
				//System.out.println("found");
				index =i;
				break;
			}
		}
		//if(index ==-1 ) System.out.println(" not found");
		return index;
	}


	public boolean avilableAppointment(String dateApp, String timeApp) {
		// TODO Auto-generated method stub
		int pAppoitmentIndex =this.findAppoitment(dateApp,timeApp);
		//System.out.println("pAppoitmentIndex in pavilableAppointment " +pAppoitmentIndex);
		if(pAppoitmentIndex != -1){
		//	System.out.println("patiaian not ava");
			return false;
		}
	//	System.out.println("patiaian ava");
		return true;
		
	}

	public void updateAppointment(String newDateApp, String timeApp, int pAppoitmentIndex) {
		LocalDate date1 = LocalDate.parse(newDateApp);
		LocalTime time1 = LocalTime.parse(timeApp);
	    appointments.get(pAppoitmentIndex).date = date1;
	    appointments.get(pAppoitmentIndex).time= time1;
		System.out.println("Successfully updated");
	}

}
