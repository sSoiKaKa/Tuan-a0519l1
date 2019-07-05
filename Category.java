
public class Category {
	private String idCategory;
	private String nameCategory;
	private String Description;

	public Category(String id, String name, String des) {
		this.idCategory = id;
		this.nameCategory = name;
		this.Description = des;
	}
	public String getIdCategory() {
		return this.idCategory;
	}
	public String getNameCategory() {
		return this.nameCategory;
	}
	public void setNameCategory(String name) {
		this.nameCategory = name;
	}
	public String getDescription() {
		return this.Description;
	}
	public void setDescription(String des) {
		this.Description = des;
	}
	public void displayCategoryInfo() {
		System.out.println("\nMa Chuyen Muc: " + this.idCategory + "\nTen Chuyen Muc" + this.nameCategory
				+ "\nMo ta: " + this.Description);
	}
}
