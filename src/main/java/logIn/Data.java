package logIn;

import java.util.ArrayList;

public class Data {
	
	
	public static ArrayList <User> user = new ArrayList<User>();
	static int idIndex=-1;
	
	

	public static boolean checkIdIsAvailable(int id) {
		for(int i=0;i<user.size();i++) {
			if(user.get(i).id==id) {
				return true;
				
			}
		}
		return false;
	}

	public static boolean checkPassIsMatching(int id, String pass1) {
		for(int i=0;i<user.size();i++) {
			if(user.get(i).pass.equals(pass1)) {
				return true;
				
			}
		}
		return false;
	}

}
