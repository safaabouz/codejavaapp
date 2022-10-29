package clinic;

public class Medicine {
	
	String med_name;
	String comp_name;
	String exp_date;
	
    String med_cost, count;

	
	public Medicine(String medname,String compname,String expdate,String medcost,String count){
		
		med_name=medname;
		comp_name=compname;
		exp_date=expdate;
		count=null;
		medcost=null;
	}
	public Medicine() {
		// TODO Auto-generated constructor stub
	}

}

