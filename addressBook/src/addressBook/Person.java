package addressBook;

public class Person
{
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private long zip;
  private long mobileNumber;
  private String email;

  //------------First Name--------------------
  public String getFirstName()
  {
      return firstName;
  }

  public void setFirstName(String firstName)
  {
      this.firstName = firstName;
  }
  //---------- Last Name----------------
  public String getLastName()
  {
      return lastName;
  }

  public void setLastName(String lastName)
  {
      this.lastName = lastName;
  }
  //----------------address------------------
  public String getAddress()
  {
      return address;
  }
  public void setAddress(String address)
  {
      this.address = address;
  }
  //----------------City-------------------------
  public String getCity()
  {
      return city;
  }

  public void setCity(String city)
  {
      this.city = city;
  }
  //--------------State------------------------
  public String getState()
  {
      return state;
  }
  public void setState(String state)
  {
      this.state = state;
  }
  //-------------ZipCode-------------------------------
  public long getZip()
  {
      return zip;
  }
  public void setZip(long zip)
  {
      this.zip = zip;
  }
  //----------------- MObilr Number-------------------------
  public long getmobileNumber()
  {
      return mobileNumber;
  }
  public void setmobileNumber(long mobileNumber)
  {
      this.mobileNumber = mobileNumber;
  }
  //---------------Email---------------------------------
  public String getEmail()
  {
      return email;
  }
  public void setEmail(String email)
  {
      this.email = email;
  }
  

  @Override
	public String toString() {
		return '\n' + "Details is " + '\n' + "First Name :: " + firstName + '\n' + "Last  Name :: " + lastName + '\n'
				+ "City : " + city + '\n' + "State :: " + state + '\n' + "pinCode :: " + zip + '\n'
				+ "Phone Number :: " + mobileNumber + '\n' + "Email Id :: " + email + '\n';

	}
	
}