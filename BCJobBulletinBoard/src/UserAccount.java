
public abstract class UserAccount {
	
	String firstName, lastName;
	
	public UserAccount(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String fn) {
		this.firstName = fn;
	}
	
	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	public String toString() {
		return this.firstName + ' ' + this.lastName;
	}
	

}
