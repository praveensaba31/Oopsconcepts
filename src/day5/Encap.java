package day5;

public class Encap {

	private String DBUserName="Bala";
	private String dBPasswordString="password123";
	
	public String nameString ="Bala";

	public String getDBUserName() {
		return DBUserName;
	}

	public void setDBUserName(String dBUserName) {
		DBUserName = dBUserName;
	}

	public String getdBPasswordString() {
		return dBPasswordString;
	}

	public void setdBPasswordString(String dBPasswordString) {
		this.dBPasswordString = dBPasswordString;
	}
	
	
}
