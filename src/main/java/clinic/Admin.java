package clinic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

import io.cucumber.datatable.DataTable;

public class Admin extends User {

	public Admin(String string, String string2) {
	super(string,string2);
	}

	public Admin() {
		// TODO Auto-generated constructor stub
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
				MyClinic.doctors.get(doctorIndex).appointments.get(appIndex).setState(DoctorAppointmentState.Booked);
				
		}
		
	}

	public void setDoctorAppointmentAsBooked(String userName1, int appointmentIndex) {
		int doctorIndex = MyClinic.findDoctorIndex(userName1);
		MyClinic.doctors.get(doctorIndex).appointments.get(appointmentIndex).setState(DoctorAppointmentState.Booked);
		
	}

	public int checkPatiantTodaysAppointments(String userName) {
		int appointmentIndex =-1;
		int patientIndex =MyClinic.findPatientIndex(userName);
		for(int i=0;i<MyClinic.patients.get(patientIndex).getAppointments().size();i++)
		 {  
			
			if(MyClinic.patients.get(patientIndex).getAppointments().get(i).getLocalDate().equals(LocalDate.now())) {
				appointmentIndex = i;	
				System.out.println("he has appointment Today");
				break;
				
			}
			
		}
		return appointmentIndex;
		
	}

	public void setAppointmentState(int appointmentIndex, String userName) {
		int patientIndex =MyClinic.findPatientIndex(userName);
		MyClinic.patients.get(patientIndex).getAppointments().get(appointmentIndex).setState(PatientAppointmentState.Visited);
		System.out.println(" convert to Visited ");
		
	}

	public void displayAllDoctors() {
		System.out.println("\n************************ Doctors List ************************");
		System.out.println("Doctor UserName|Start Hour|End Hour| Off Days         |");
		for(int i=0;i<MyClinic.doctors.size();i++) {
		//	MyClinic.doctors.
			
			
			StringBuilder str = new StringBuilder(MyClinic.doctors.get(i).username);
			str.setLength(15);
			System.out.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).startHour.toString());
			str.setLength(10);
			System.out.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).endHour.toString());
			str.setLength(8);
			System.out.print(str + "|");
			str = new StringBuilder(MyClinic.doctors.get(i).offDays.toString());
			str.setLength(17);
			System.out.println(str + "]|");
			
		}
		
	}

	public void displayAllPatients() {
		System.out.println("\n************************ Patients List ************************");
		System.out.println("Patient UserName");
		for(int i=0;i<MyClinic.patients.size();i++) {
		//	MyClinic.doctors.
			
			
			StringBuilder str = new StringBuilder(MyClinic.patients.get(i).username);
			str.setLength(16);
			System.out.println(str);
			
			
		}
		
	}

}
