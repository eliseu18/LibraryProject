package ifrn.poo.project.library.system;

public interface Library {
	
	void setName(String name);
	void setAddress(String address);
	void setCategories(Category category);
	String getName();
	String getAddress();
	Category getCategory();
	Category searchCategoryName(String name);
	Category searchCategoryId(int id);
}
