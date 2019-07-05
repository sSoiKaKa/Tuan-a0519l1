
public class Book {
	private String isbn;
	private String title;
	private String Company_Publishing;
	private String Year_Publishing;
	private int price;
	private Author[] authors = new Author[2];
	private int numberAuthor = 0;
	private Category category;

	public Book(String isbn, String title, String pub, String year, int price) {
		this.isbn = isbn;
		this.title = title;
		this.Company_Publishing = pub;
		this.Year_Publishing = year;
		this.price = price;
	}

	public Category getCategory() {
		return this.category;
	}

	public void addCategory(Category category) {
		this.category = category;
	}

	public void addAuthor(Author author) {
		authors[numberAuthor] = author;
		numberAuthor++;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public String getCompanyPublishing() {
		return this.Company_Publishing;
	}

	public String getYearPublishing() {
		return this.Year_Publishing;
	}

	public int getPrice() {
		return this.price;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookTitle(String Title) {
		this.title = Title;
	}

	public void setCompanyPublishing(String pub) {
		this.Company_Publishing = pub;
	}

	public void setYearPublishing(String yearPublish) {
		this.Year_Publishing = yearPublish;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void displayBookInfo() {
		System.out.println("\nisbn: " + isbn + "/nTitle: " + title + "\nPublishing Company: " + Company_Publishing
				+ "\nYear: " + Year_Publishing + "\nPrice: " + price);
		for (int i = 0; i <= this.numberAuthor; i++) {
			System.out.println("\nTac gia " + (i + 1) + ": ");
			this.authors[i].displayAuthorInfo();
		}
	}
}
