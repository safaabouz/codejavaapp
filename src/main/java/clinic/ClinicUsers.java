package clinic;


import java.util.*;
//import java.util.ArrayList;

public class ClinicUsers {
	
 private List<User> users = new ArrayList();
 private List<Admin> admins=new ArrayList();
 private List<Doctor> doctors=new ArrayList();
 private List<Patient> patients=new ArrayList();
 
 public void addUser(User user) {
     users.add(user);
 }
 
 public void addAllUserss(Collection<User> userss) {
     this.users.addAll(userss);
 }	 
 
 public User findUser(String username,String pass) {
	 User u = null ;
	 
//		int available = -1;
	    for(int i=0;i<users.size(); i++) {
	    	if(users.get(i).pass.equals(pass) && users.get(i).username.equals(username) ) {
	    		System.out.println("The User is Found");
	    		u=users.get(i);  	   
	    		break;
	    		}
	    }
	    if(u== null) {
	    	System.out.println("User not Found");
	    }
	       return u;
	 }

public void addAdmin(Admin a) {
	this.admins.add(a);	
}

public void addDoctor(Doctor d) {
	this.doctors.add(d);
	
}

public void addPatient(Patient p) {
	this.patients.add(p);
	
}

public void genUsersTypes(int type,String string, String string2) {
	switch (type) {
	case 1:
		Admin a = new Admin(string, string2);
		this.addAdmin(a);
		break;
	case 2:
		Doctor d = new Doctor(string, string2);
		this.addDoctor(d);
		break;	
	case 3:
		Patient p = new Patient(string, string2);
		this.addPatient(p);
		break;				
		}
	
}
}
