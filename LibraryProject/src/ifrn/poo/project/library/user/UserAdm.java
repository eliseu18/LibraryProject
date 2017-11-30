package ifrn.poo.project.library.user;

public interface UserAdm extends User{

	void createLibrary(String name, String address);
	void createCategory(String name, int id);
	void saveCollection(String information);
	void modifyField(String type, String name, String field, String value);
}
