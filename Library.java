
public class Library {
	private String id_lib;
	private String address;
	private Library_book[] lib_book = new Library_book[10000];
	private int numberBook = 0;

	public Library(String id, String address) {
		this.id_lib = id;
		this.address = address;
	}
	
	public void addLibraryBook(Library_book lib_book) {
		this.lib_book[numberBook]= lib_book;
		numberBook++;
	}

	public void displayLibraryInfo() {
		System.out.println("id Library: " + this.id_lib + "\nAddress: " + this.address);
	}
}
