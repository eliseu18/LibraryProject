package ifrn.poo.project.library.system;

public class LibraryImplementation implements Library{
	String name;
	String address;
	Category[] categories;
	
	LibraryImplementation(){
		this.name = null;
		this.address = null;
		this.categories = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCategory(Category category) {
		this.categories = null; // implement array add with it's organization type
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public Category getCategory() {
		return null; // Implement search;
	}
	
	public Category searchCategoryName(String name) {
		return null; // Implement search;
	}
	
	public Category searchCategoryId(int id) {
		return null; // Implement search
	}
}
