public class person {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private int phoneNum;
	
	public person(String firstName, String lastName, String address, String city, String state, int zipCode, int phoneNum ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
	}
	public String getfirstName() {
		return this.firstName;
	}
	public String getlastName() {
		return this.lastName;
	}
	public String getaddress() {
		return this.address;
	}
	public String getcity() {
		return city;
	}
	public String setcity(String city) {
		this.city = city;
	}
	public String getstate() {
		return this.state;
	}
	public String setstate(String state) {
		this.state = state;
	}
		
	public int getzipCode() {
		return this.zipCode;
	}
	public int getphoneNum() {
		return this.phoneNum;
	}
	public void readEntry() {
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);		
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("state: "+state);
		System.out.println("Phone Number: "+phoneNum);
		System.out.println("ZipCode: "+zipCode);
	}
}
