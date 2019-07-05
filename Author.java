
public class Author {
	private String nameAuthor;
	private String gender;
	private String dateAuthor;
	private String Address;

	public Author(String name, String gender, String birthday, String address) {
		this.nameAuthor = name;
		this.gender = gender;
		this.dateAuthor = birthday;
		this.Address = address;
	}

	public String getNameAuthor() {
		return this.nameAuthor;
	}

	public void setNameAuthor(String name) {
		this.nameAuthor = name;
	}

	public String getDateAuthor() {
		return this.dateAuthor;
	}

	public void setDateAuthor(String birthday) {
		this.dateAuthor = birthday;
	}

	public String getAddressAuthor() {
		return this.Address;
	}

	public void setaddressAuthor(String address) {
		this.Address = address;
	}

	public void displayAuthorInfo() {
		System.out.println("\nName: " + this.nameAuthor + "\nBirthday: " + this.dateAuthor + "\nGender: " + this.gender
				+ "\nAddress: " + this.Address);
	}
}
