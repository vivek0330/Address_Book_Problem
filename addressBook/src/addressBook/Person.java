package addressBook;

class Person {
	
	// Declare variables
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long pinCode;
	private String email;
	private long mobNumber;

	// use getters and setters for class variables
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	@Override
	public String toString() {
		return '\n' + "Contact is" + '\n' + "First Name :: " + firstName + '\n' + "Last  Name :: " + lastName + '\n'
				+ "City : " + city + '\n' + "State :: " + state + '\n' + "pinCode :: " + pinCode + '\n'
				+ "Phone Number :: " + mobNumber + '\n' + "Email Id :: " + email + '\n';

	}
}
