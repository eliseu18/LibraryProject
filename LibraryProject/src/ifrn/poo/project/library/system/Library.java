package ifrn.poo.project.library.system;
import java.util.ArrayList;

public interface Library {
	
	void setName(String name);
	void setAddress(String address);
	void setCategory(Category category);
	String getName();
	String getAddress();
	ArrayList<Category> getCategories();
	Category searchCategoryName(String name);
	Category searchCategoryId(int id);
}
