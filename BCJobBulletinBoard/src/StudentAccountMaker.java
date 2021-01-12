
public class StudentAccountMaker implements UserAccountMaker{
	
	public UserAccount makeUserAccount(String fn, String ln) {
		UserAccount studentUser = new StudentAccount(fn,ln);
		return studentUser;
	}

}
