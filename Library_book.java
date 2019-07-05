
public class Library_book extends Book {
	private String id_lib_book;
	private String Position;
	private String DatePutOn;
	private int Number;

	public Library_book(String isbn, String title, String pub, String year, int price, String id, String position,
			String datePutOn, int num) {
		super(isbn, title, pub, year, price);
		this.Position = position;
		this.DatePutOn = datePutOn;
		this.Number = num;
		this.id_lib_book = id;
	}

	public String getPosition() {
		return this.Position;
	}

	public void setPosition(String position) {
		this.Position = position;
	}

	public int getNumber() {
		return this.Number;
	}

	public void setNumber(int num) {
		this.Number = num;
	}

	public String getBookId() {
		return this.id_lib_book;
	}

	public void displayLib_BookInfo() {
		System.out.println("\nisbn: " + super.getIsbn() + "/nTitle: " + super.getTitle() + "\nPublishing Company: "
				+ super.getCompanyPublishing() + "\nYear: " + super.getYearPublishing() + "\nPrice: " + super.getPrice()
				+ "\n Position: " + this.Position + "\nNgay them vao: " + this.DatePutOn + "\nSo luong: "
				+ this.Number);
	}
}
