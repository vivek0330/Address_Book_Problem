/*
 * Purpose :: Create a contact in address book
 * @author Vivek Varshney
 */

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
				+ "City : " + city + '\n' + "State :: " + state + '\n' + "pinCode :: " + pinCode + '\n'
				+ "Phone Number :: " + mobNumber + '\n' + "Email Id :: " + email + '\n';

	}

}

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Person> personDetailsList = new ArrayList<Person>();

	public void addDetails() {

		// taking value from user
		Person details = new Person();
		System.out.println("Add person Deatils");
		System.out.print("Enter First Name :: ");
		details.setFirstName(sc.next());
		System.out.print("Enter Last Name :: ");
		details.setLastName(sc.next());
		System.out.print("Enter City :: ");
		details.setCity(sc.next());
		System.out.print("Enter State :: ");
		details.setState(sc.next());
		System.out.print("Enter pinCode :: ");
		details.setPinCode(sc.nextLong());
		System.out.print("Enter mobNumber :: ");
		details.setMobNumber(sc.nextLong());
		System.out.print("Enter Email ID :: ");
		details.setEmail(sc.next());

		personDetailsList.add(details);
	}

	public void editDetails() {
		System.out.println("Confirm your first name to edit details: ");
		String confirm_name = sc.next();

		for (int i = 0; i < personDetailsList.size(); i++) {
			if (personDetailsList.get(i).getFirstName().equals(confirm_name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter new first name");
					personDetailsList.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new Last name");
					personDetailsList.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					personDetailsList.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new City");
					personDetailsList.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new State");
					personDetailsList.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new Zip");
					personDetailsList.get(i).setPinCode(sc.nextLong());
					break;
				case 7:
					System.out.println("Enter new Mobile number");
					personDetailsList.get(i).setMobNumber(sc.nextLong());
					break;
				case 8:
					System.out.println("Enter new E-mail");
					personDetailsList.get(i).setEmail(sc.next());
					break;
				}
				System.out.println("Edited list is: ");
				System.out.println(personDetailsList);

			} else
				System.out.println("Enter valid First name");
		}

	}

	public void Display_All(ArrayList<Person> arr) {
		boolean is_Empty = arr.isEmpty();
		if (is_Empty == true)
			System.out.println("Array List is Empty");
		else
			System.out.println(arr);
	}

	public boolean deleteContact(String name) {
		int flag = 0;
		for (Person contact : personDetailsList) {
			if (contact.getFirstName().equals(name)) {
				personDetailsList.remove(contact);
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		AddressBookMain editDetail = new AddressBookMain();
		boolean flag = true;

		while (flag) {
			System.out.println("Choose what you want to do: ");
			System.out.println("1 Add details.\n2 Edit details. \n3 display all. \n4 Delete person details. \n5 Exit.");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				editDetail.addDetails();
				break;
			case 2:
				editDetail.editDetails();
				break;
			case 3:
				editDetail.Display_All(personDetailsList);
				break;
			case 4:
				System.out.println("Enter the Contact to be deleted:");
				String confirm_name = sc.next();
				boolean listDeleted = editDetail.deleteContact(confirm_name);
				if (listDeleted) {
					System.out.println("Deleted Contact from the List");
				} else {
					System.out.println("List Cannot be Deleted");
				}
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Choose valid option");
				break;
			}
		}
	}
}
