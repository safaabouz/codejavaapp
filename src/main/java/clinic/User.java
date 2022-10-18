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
public void setLogState(boolean b) {
	this.logState = b;
	
}


}
