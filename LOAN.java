
public class LOAN {
	private String idLoan;
	private String dateBorrow;
	private int numberBorrow = 0;
	private Student information;
	private Library_book[] lib_book = new Library_book[3];

	public LOAN(String id, String date, int num) {
		this.idLoan = id;
		this.dateBorrow = date;
		this.numberBorrow = num;
	}
	public Student getInformation() {
		return this.information;
	}
	
	public void addStudent(Student information) {
		this.information = information;
	}
	public void addLibraryBook(Library_book lib_book) {
		this.lib_book[numberBorrow] = lib_book;
	}
	
	public String getIdLoan() {
		return this.idLoan;
	}

	public String getDateBorrow() {
		return this.dateBorrow;
	}

	public void setDateBorrow(String date) {
		this.dateBorrow = date;
	}

	public int getnumberBorrow() {
		return this.numberBorrow;
	}

	public void setNumberBorrow(int num) {
		this.numberBorrow = num;
	}

	public void displayLoanInfo() {
		System.out.println("Loan\nNgay muon: " + this.dateBorrow + "\nSo luong: " + this.numberBorrow);
	}
}
