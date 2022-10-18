package clinic;

public class User {
	
	String username;
	String pass;
	boolean logState;
	int type;
	
public User(String username1,String pass1,int type1){
	
	username=username1;
	pass=pass1;
	logState=false;
	type =type1;
}
public User(String username1,String pass1){
	
	username=username1;
	pass=pass1;
	logState=false;
	type =-1;
}
public User() {
	// TODO Auto-generated constructor stub
}
public void setLogState(boolean b) {
	this.logState = b;
	
}
public void login() {
if(this.getLogState())	{
	System.out.println("You are already Loged in");
}
else {	
	this.setLogState(true);
	switch(this.type) {
	case 1:
		System.out.println("logging in into Admin Page");
		break;
	case 2:
		System.out.println("logging in into Doctor Page");
		break;	
	case 3:
		System.out.println("logging in into Patient Page");
		break;
	}
	}
	
}
public boolean getLogState() {
	return this.logState;
}



}
