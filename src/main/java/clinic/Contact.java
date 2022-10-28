package clinic;

public class Contact {
	
	String phoneNumber;
	String email;
	String address;

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public Contact(String email,String phoneNumber,String address) {
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;

	}


	public void updateAddress(String newdata) {
		// TODO Auto-generated method stub
		this.address = newdata;
	}
		
}
