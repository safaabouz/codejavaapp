package clinic;

public class User {
	
	String username;
	String pass;
	boolean logState;

	
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
public User(String username1,String pass1){
	
	username=username1;
	pass=pass1;
	logState=false;
}
public User() {
	// TODO Auto-generated constructor stub
}
public void setLogState(boolean b) {
	this.logState = b;
	
}
public void login() {
if(this.getLogState())	{
	System.err.println("You are already Loged in");
}
else {	
	this.setLogState(true);
	int type =this.getType();
	switch(type) {
	case 1:
		System.err.println("logging in into Admin Page");
		break;
	case 2:
		System.err.println("logging in into Doctor Page");
		break;	
	case 3:
		System.err.println("logging in into Patient Page");
		break;
	}
	}
	
}
public boolean getLogState() {
	return this.logState;
}

public int getType() {
if(this.isPatientFormate()) {
	return 3;
}
else if(this.isDoctorFormate()) {
	return 2;
}
else if(this.isAdminFormate()) {
	return 1;
}
return -1;
}


private boolean isAdminFormate() {
	if(username.length()==1) {
		return true;
	}
	else return false;
}
private boolean isDoctorFormate() {
	if(username.length()==4) {
		return true;
	}
	else return false;
}

private boolean isPatientFormate() {
		char [] chars = username.toCharArray();
		for(int i=0;i<chars.length;i++) {
			
		if(	Character.isAlphabetic(chars[i])) {
			return true;
		}
			
		}
		return false;
		}
public void logout() {
	// TODO Auto-generated method stub
	System.err.println("This User is logging out");	
}

}





