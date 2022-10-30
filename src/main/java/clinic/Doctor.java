package clinic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Doctor extends User {

	public Contact contact;
	public List<DoctorAppointment> appointments =new ArrayList<DoctorAppointment>();
	public LocalTime startHour;
	public LocalTime endHour;
	List<DayOfWeek> offDays =new ArrayList<DayOfWeek>();
	public Doctor(String string, String string2) {
		super(string,string2);
	}
	public void setOffDays(String cell) {
	String dayString[] =cell.split(",");
	 for(int i=0;i<dayString.length;i++) {
		 offDays.add(DayOfWeek.valueOf(dayString[i].toUpperCase()));
	 }
		
		
	}
	public void createAppointmentList() {
	int hour=Math.abs(endHour.getHour() - startHour.getHour());
	int min = Math.abs(endHour.getMinute() - startHour.getMinute());
	int numOfApp; 
	
	//System.out.println("hiiiiiiiiiiiiiiiiiiiiii");
	LocalTime timeofAppointmen = startHour;
			if(min > 30 ||min == 30 ) {
				numOfApp=hour*2 +1;
			}
			else numOfApp=(hour*2);
	LocalDate dateOfAppointment = LocalDate.now();	
	
	for(int i =0;i<7;i++) { // appointments for a week
		if(isOffDay(dateOfAppointment)) {
			dateOfAppointment = dateOfAppointment.plusDays(1);
			continue;
		}
		timeofAppointmen = startHour;
		for(int j=0 ;j<numOfApp ;j++)	{
			
			this.appointments.add(new DoctorAppointment(dateOfAppointment,timeofAppointmen,this,DoctorAppointmentState.Avialable));
			timeofAppointmen = timeofAppointmen.plusMinutes(30);
		}
		dateOfAppointment = dateOfAppointment.plusDays(1);
	}
	/*	System.out.println(numOfApp);
		for(int i =0;i<this.appointments.size();i++) {
			System.out.println( "time  " + this.appointments.get(i).time);
			System.out.println( "date " + this.appointments.get(i).date);
		}*/
	}
	private boolean isOffDay(LocalDate dateOfAppointment) {
		boolean isOff = false;
		for(int i=0;i<offDays.size();i++) {
			//System.out.println("date of app"+dateOfAppointment.getDayOfWeek());
			//System.out.println("off days"+offDays.get(i));
			if(dateOfAppointment.getDayOfWeek().equals(offDays.get(i))) {
				isOff = true;
				break;
			}
		}
		return isOff;
	}
	public int findAppointment(LocalDate date, LocalTime time) {
	 int appIndex=-1;
	 for(int i =0;i< this.appointments.size();i++) {
		 if(appointments.get(i).getLocalDate().equals(date) && appointments.get(i).getLocalTime().equals(time)) {
			 appIndex = i;
			 break;
		 }
	 }
		return appIndex;
	}
	

}
