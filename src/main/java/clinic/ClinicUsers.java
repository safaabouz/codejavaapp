package clinic;


import java.util.*;
//import java.util.ArrayList;

public class ClinicUsers {
	
 private List<User> users = new ArrayList();
 
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
}
