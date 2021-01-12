
public class StaffAccountMaker implements UserAccountMaker{

	public UserAccount makeUserAccount(String fn, String ln) {
		StaffAccount StaffAccount = new StaffAccount(fn,ln);
		return StaffAccount;
	}

}
