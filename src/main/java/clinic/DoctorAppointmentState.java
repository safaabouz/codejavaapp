package clinic;

public enum DoctorAppointmentState {
	BookedUp,
	Avialable;


	@Override
	 public String toString(){
        switch(this){
        case BookedUp:
            return "Booked";
        case Avialable :
            return "Avialable";
        }
        return "";
    }
	 
	 
	 
	    public static DoctorAppointmentState doctorAppointmentState1 (String value){
	        if(value.equalsIgnoreCase(Avialable.toString()))
	            return DoctorAppointmentState.Avialable;
	        else if(value.equalsIgnoreCase(BookedUp.toString()))
	            return DoctorAppointmentState.BookedUp;
	   
	        else
	            return null;
	    
}

}
