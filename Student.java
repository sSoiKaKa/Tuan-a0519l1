
public class Student {
	private String idStudent;
	private String nameStudent;
	private String dateStudent;
	private String classStudent;
	private String majorStudent;

	public Student(String id, String name, String birthday, String _class, String major) {
		this.idStudent = id;
		this.nameStudent = name;
		this.dateStudent = birthday;
		this.classStudent = _class;
		this.majorStudent = major;
	}

	public String getIdStudent() {
		return this.idStudent;
	}

	public String getNameStudent() {
		return this.nameStudent;
	}

	public void setNameStudent(String name) {
		this.nameStudent = name;
	}

	public String getDateStudent() {
		return this.dateStudent;
	}

	public void setDateStudent(String date) {
		this.dateStudent = date;
	}

	public String getClassStudent() {
		return this.classStudent;
	}

	public void setClassStudent(String _class) {
		this.classStudent = _class;
	}

	public String getMajorStudent() {
		return this.majorStudent;
	}

	public void setMajorStudent(String major) {
		this.majorStudent = major;
	}

	public void displayStudentInfo() {
		System.out.println("STUDENT\nName: " + this.nameStudent + "\nBirthday: " + this.dateStudent + "\nClass "
				+ this.classStudent + "\nMajor: " + this.majorStudent);
	}
}
