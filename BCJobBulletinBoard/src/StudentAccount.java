
public class StudentAccount extends UserAccount{
	int schoolYear;
	String major;
	
	public StudentAccount(String fn, String ln) {
		super(fn,ln);
	}
	
	public int getSchoolYear() {
		return this.schoolYear;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setSchoolYear(int sy) {
		this.schoolYear = sy;
	}
	
	public void setMajor(String m) {
		this.major = m;
	}
	
	public String toString(String m) {
		return "Name: " + this.firstName + " " + this.lastName + " Major: " + getMajor() + " School Year: " + getSchoolYear();
	}

}
