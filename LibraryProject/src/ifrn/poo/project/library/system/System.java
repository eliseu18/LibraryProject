package ifrn.poo.project.library.system;

public interface System {
	Library libraries = null;
	
	void SearchValue(String value, int option);
	String returnFields(String type, String name);
	
	
}
