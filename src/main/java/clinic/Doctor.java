package clinic;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Doctor extends User {

	public Contact contact;
	List<DoctorAppointment> appointments;
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
	LocalTime addedTime = LocalTime.parse("00:30");
	//addedTime.plusMinutes(30);
			if(min > 30 ||min == 30 ) {
				numOfApp=hour*2 +1;
			}
			else numOfApp=(hour*2);
			
	for(int i =0;i<7;i++) { // appointments for a week
		for(int j=0 ;j<numOfApp ;j++)	{
			
		}
		
	}
		System.out.print(numOfApp);
	}
	

}
