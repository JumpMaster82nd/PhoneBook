package phonebookproject;

public class Person {
	private String fullName;
	private String street;
	private String city;
	private String zipCode;
	private String state;
	private String phoneNumber;

	public Person(String fullName, String street, String city, String state, String zipCode, String phoneNumber) {
		super();
		this.fullName = fullName;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return fullName + ", " + street + ", " + city + ", " + state + ", " + zipCode + ", " + phoneNumber;
	}

}