package clinic;

import java.time.LocalDate;
import java.time.LocalTime;


public class Admin extends User {

	public Admin(String string, String string2) {
	super(string,string2);
	}

	public Admin() {
	}

	public void addDoctorsInformation(io.cucumber.datatable.DataTable dataTable) {
		int doctorIndex;
	    for(int i=0;i<dataTable.height();i++) {	
	    	doctorIndex =MyClinic.findDoctorIndex(dataTable.cell(i,0));	
	    	MyClinic.doctors.get(doctorIndex).setData(dataTable.cell(i,1),dataTable.cell(i,2),dataTable.cell(i,3));
	    	
	    }
		
	}

	public void setSomeAppointmentsAsBooked(io.cucumber.datatable.DataTable dataTable) {
		int doctorIndex;
		for(int i=0;i<dataTable.height();i++) {
			
				doctorIndex =MyClinic.findDoctorIndex(dataTable.cell(i,0));
				LocalDate date = LocalDate.parse(dataTable.cell(i,1));
				LocalTime time = LocalTime.parse(dataTable.cell(i,2));
				int appIndex =MyClinic.doctors.get(doctorIndex).findAppointment(date,time);		
				MyClinic.doctors.get(doctorIndex).appointments.get(appIndex).setState(DoctorAppointmentState.BookedUp);
				
		}
		
	}

	public void setDoctorAppointmentAsBooked(String userName1, int appointmentIndex) {
		int doctorIndex = MyClinic.findDoctorIndex(userName1);
		MyClinic.doctors.get(doctorIndex).appointments.get(appointmentIndex).setState(DoctorAppointmentState.BookedUp);
		
	}

	public int checkPatiantTodaysAppointments(String userName) {
		int appointmentIndex =-1;
		int patientIndex =MyClinic.findPatientIndex(userName);
		for(int i=0;i<MyClinic.patients.get(patientIndex).getAppointments().size();i++)
		 {  
			
			if(MyClinic.patients.get(patientIndex).getAppointments().get(i).getLocalDate().equals(LocalDate.now())) {
				appointmentIndex = i;	
				System.err.println("he has appointment Today");
				break;
				
			}
			
		}
		return appointmentIndex;
		
	}

	public void setAppointmentState(int appointmentIndex, String userName) {
		int patientIndex =MyClinic.findPatientIndex(userName);
		MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).setState(PatientAppointmentState.Visited);
		System.err.println(" convert to Visited ");
		
	}

	public void displayAllDoctors() {
		System.err.println("\n************************ Doctors List ************************");
		System.err.println("Doctor UserName|Start Hour|End Hour| Off Days         |");
		for(int i=0;i<MyClinic.doctors.size();i++) {
		//	MyClinic.doctors.
			
			
			StringBuilder str = new StringBuilder(MyClinic.doctors.get(i).username);
			str.setLength(15);
			System.err.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).startHour.toString());
			str.setLength(10);
			System.err.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).endHour.toString());
			str.setLength(8);
			System.err.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).offDays.toString());
			str.setLength(17);
			System.err.println(str + "]|");
			
		}
		
	}

	public void displayAllPatients() {
		System.err.println("\n************************ Patients List ************************");
		System.err.println("Patient UserName");
		for(int i=0;i<MyClinic.patients.size();i++) {
		//	MyClinic.doctors.
			
			
			StringBuilder str = new StringBuilder(MyClinic.patients.get(i).username);
			str.setLength(16);
			System.err.println(str);
			
			
		}
		
	}

}
