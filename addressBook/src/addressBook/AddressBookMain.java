package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

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
				+ "City : " + city + '\n' + "State :: " + state + "zip :: " + pinCode + '\n' + "Phone Number :: "
				+ mobNumber + '\n' + "Email Id :: " + email + '\n';

	}

	public void addDetails() {

		// taking value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Add person Deatils");
		System.out.print("Enter First Name :: ");
		this.firstName = sc.nextLine();
		System.out.print("Enter Last Name :: ");
		this.lastName = sc.nextLine();
		System.out.print("Enter City :: ");
		this.city = sc.nextLine();
		System.out.print("Enter State :: ");
		this.state = sc.nextLine();
		System.out.print("Enter pinCode :: ");
		this.pinCode = sc.nextLong();
		System.out.print("Enter mobNumber :: ");
		this.mobNumber = sc.nextLong();
		System.out.print("Enter Email ID :: ");
		this.email = sc.next();
	}

	public void Display_All(ArrayList<Person> arr) {
		boolean is_Empty = arr.isEmpty();
		if (is_Empty == true)
			System.out.println("Array List is Empty");
		else
			System.out.println(arr);
	}

}

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<Person>();
		int option;
		do {
			Person personDetails = new Person();
			System.out.println("Enter your option");
			System.out.println("1 Add contact  ");
			System.out.println("2 Display all contact ");

			option = sc.nextInt();

			switch (option) {
			case 1:
				personDetails.addDetails();
				list.add(personDetails);
				break;
			case 2:
				personDetails.Display_All(list);
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to continue (1 Continue \n 0 Exit)");
			option = sc.nextInt();
		} while (option != 0);
	}
}