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
 
 public boolean findUser(String username,String pass) {
	 User u = new User(username,pass);
	 boolean available = false;
    for(int i=0;i<users.size(); i++) {
    	if(users.get(i).equals(u))
    		available = true;
    		break;
    }
       return available;
 }
}
