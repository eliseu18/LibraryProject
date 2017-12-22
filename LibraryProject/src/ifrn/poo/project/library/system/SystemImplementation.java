package ifrn.poo.project.library.system;
import java.util.*;
import java.util.ArrayList;

public class SystemImplementation implements System{
	
	static private Library libraries;
	
	SystemImplementation(){
		libraries = new LibraryImplementation();
	}
	
	//public ArrayList<Category> getCategories() {
		//return libraries.categories;
	//}
	
	public String returnFields(String type, String name) {
		return null; // Implement this method.
	}

}
