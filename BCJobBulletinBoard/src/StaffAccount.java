
public class StaffAccount extends UserAccount{
	
	String department;
	
	public StaffAccount(String fn, String ln) {
		super(fn,ln);
	}
	
	public void setDepartment(String d) {
		this.department = d;
	}

	public String getDepartment() {
		return this.department;
	}
	
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName + " Department: " + getDepartment();
	}

}
