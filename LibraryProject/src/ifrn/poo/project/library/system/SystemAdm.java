package ifrn.poo.project.library.system;

public interface SystemAdm extends System {
	
	void createLibrary(String name, String address);
	void createCategory(String name, int id);
	void saveCollection(String information);
	void modifyField(String type, String name, String field, String value);
}
