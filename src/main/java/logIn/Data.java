package logIn;

import java.util.ArrayList;

public class Data {
	
	
	public static ArrayList <User> user = new ArrayList<User>();
	static int idIndex=-1;
	
	

	public static int checkIdIsAvailable(int id) {
		for(int i=0;i<user.size();i++) {
			if(user.get(i).id==id) {
				idIndex=i;
				break;
				
			}
		}
		return idIndex;
	}

	public static boolean checkPassIsMatching(int availableId1, String pass1) {
		if(user.get(availableId1).pass.equals(pass1)) 
		return true;
		else return false;
		
	}

}
