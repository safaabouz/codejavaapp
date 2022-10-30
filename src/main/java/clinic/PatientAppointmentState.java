package clinic;

public enum PatientAppointmentState {
	Visited,
	Booked,
	Missed;
	
	 public String toString(){
        switch(this){
        case Visited :
            return "Visited";
        case Booked :
            return "Booked";
        case Missed :
            return "Missed";
        }
        return null;
    }
	 
	    public static PatientAppointmentState valueOf(Class<PatientAppointmentState> enumType, String value){
	        if(value.equalsIgnoreCase(Visited.toString()))
	            return PatientAppointmentState.Visited;
	        else if(value.equalsIgnoreCase(Booked.toString()))
	            return PatientAppointmentState.Booked;
	        else if(value.equalsIgnoreCase(Missed.toString()))
	            return PatientAppointmentState.Missed;
	        else
	            return null;
	    }

}

