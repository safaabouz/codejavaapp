package clinic;

public enum DoctorAppointmentState {
	Booked,
	Avialable;


   
	 public String toString(){
        switch(this){
        case Booked :
            return "Booked";
        case Avialable :
            return "Avialable";
        }
        return "";
    }
	 
	 
	 
	    public static DoctorAppointmentState valueOf(Class<DoctorAppointmentState> enumType, String value){
	        if(value.equalsIgnoreCase(Avialable.toString()))
	            return DoctorAppointmentState.Avialable;
	        else if(value.equalsIgnoreCase(Booked.toString()))
	            return DoctorAppointmentState.Booked;
	   
	        else
	            return null;
	    
}

}
