
public class person {
	private String name;
	private String email;
	private char gender;
	
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	

	@Override
	public String toString() {
		return "" + name + "("+gender+") at " + email + "";
	}

	public person(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
}

