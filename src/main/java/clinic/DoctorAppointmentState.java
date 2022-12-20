package clinic;

public enum DoctorAppointmentState {
	BookedUp,
	Avialable;


   
	 public String toString(){
        switch(this){
        case BookedUp:
            return "Booked";
        case Avialable :
            return "Avialable";
        }
        return "";
    }
	 
	 
	 
	    public static DoctorAppointmentState valueOf(Class<DoctorAppointmentState> enumType, String value){
	        if(value.equalsIgnoreCase(Avialable.toString()))
	            return DoctorAppointmentState.Avialable;
	        else if(value.equalsIgnoreCase(BookedUp.toString()))
	            return DoctorAppointmentState.BookedUp;
	   
	        else
	            return null;
	    
}

}
