package ifrn.poo.project.library.system;
import java.util.ArrayList;

public class LibraryImplementation implements Library{
	String name;
	String address;
	ArrayList<Category> categories;
	
	public LibraryImplementation(){
		this.name = null;
		this.address = null;
		this.categories = new ArrayList<Category>();
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
	
	public ArrayList<Category> getCategories() {
		return this.categories;
	}
	
	public Category searchCategoryName(String name) {
		for(int i = 0; i < categories.size(); i++) {
			if(categories.get(i).getName().equals(name))
				return categories.get(i);
		}
		return null; // Implement search;
	}
	
	public Category searchCategoryId(int id) {
		for(int i = 0; i < categories.size(); i++) {
			if(categories.get(i).getId() == id)
				return categories.get(i);
		}
		return null; // Implement search;
	}
}
