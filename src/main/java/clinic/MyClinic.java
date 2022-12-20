package clinic;


import java.util.*;
//import java.util.ArrayList;

public class MyClinic {
	
 public static List<User> users = new ArrayList();
 public static List<Admin> admins=new ArrayList();
 public static List<Doctor> doctors=new ArrayList();
 public static List<Patient> patients=new ArrayList();
 public static  List<Contact> contacts=new ArrayList();
 
 public static void addUser(User user) {
     users.add(user);
 }
 
 public static void addAllUserss(Collection<User> userss) {
     users.addAll(userss);
 }	 
 
 public static User findUser(String username,String pass) {
	 User u = null ;
	 
	    for(int i=0;i<users.size(); i++) {
	    	if(users.get(i).pass.equals(pass) && users.get(i).username.equals(username) ) {
	    		System.err.println("The User is Found");
	    		u=users.get(i);  	   
	    		break;
	    		}
	    }
	    if(u== null) {
	    	System.err.println("User not Found");
	    }
	       return u;
	 }

public static void addAdmin(Admin a) {
	admins.add(a);	
}

public static void addDoctor(Doctor d) {
	doctors.add(d);
	
}

public static void addPatient(Patient p) {
	patients.add(p);}




public static void genUsersTypes(int type,String string, String string2) {
	switch (type) {
	case 1:
		Admin a = new Admin(string, string2);
		addAdmin(a);
		break;
	case 2:
		Doctor d = new Doctor(string, string2);
		addDoctor(d);
		break;	
	case 3:
		Patient p = new Patient(string, string2);
		addPatient(p);
		break;			
		
		}
	
}

public static Admin getAdmin(String string) {
	for(int i=0;i<admins.size();i++) {
		if(admins.get(i).username.equals(string)) {
			return admins.get(i);
		}
	}
	return null;
}

public static Patient getPatient(String string) {
	// TODO Auto-generated method stub
	for(int i=0;i<patients.size();i++) {
		if(patients.get(i).username.equals(string)) {
			return patients.get(i);
		}
	}
	return null;
}

public static int findPatientIndex(String username) {
	int index=-1;
	for(int i= 0;i<patients.size();i++) {
		if(patients.get(i).username.equals(username)) {
			index = i;
		}
	}
	return index;
}

public static int findDoctorIndex(String username) {
	int index=-1;
	for(int i= 0;i<doctors.size();i++) {
		if(doctors.get(i).username.equals(username)) {
			index = i;
		}
	}
	return index;
}


}
