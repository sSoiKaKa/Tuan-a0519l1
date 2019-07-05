
public class Test {

	public static void main(String[] args) {
		// Thong tin cua sach
		Book book1 = new Book("8935086828502", "The Law Of The Garbage Truck", "NXB Tong Hop TP.HCM", "2018", 22000);
		// a. Them thong tin tac gia cho sach
		Author author1 = new Author("David J. Pollay", "M", "I don't know", "It's a secret");
		book1.addAuthor(author1);
		// b. Them chuyen muc vao cho sach
		Category category = new Category("11223", "Self Help", "Improve your soft skill... Hmmm... Perhaps that ^^");
		book1.addCategory(category);
		// c. Them sach vao thu vien
		Library_book lib_book1 = new Library_book("8936049524905", "5 Centimeters Per Second", "NXB Hong Duc", "2018",
				50000, "000001", "Ke 2 tang 3", "5-7-2019", 1);

		// d. Giai quyet viec muon sach trong thu vien
		Student student1 = new Student("012345678", "Lo Thi Loan", "31-2-2000", "18H3344", "Chemistry");
		LOAN loan = new LOAN("0012345", "5/7/2019", 2);
		loan.addStudent(student1);
		loan.addLibraryBook(lib_book1);
	}

}
