package ifrn.poo.project.library.system;

public interface Category {
	
	void setName(String name);
	void setId(int id);
	void setBooks(Collection book);
	String getName();
	int getId();
	Collection getCollection();
	int getNumCollection();
	int getNumBooks();
	int getNumMagazines();
	int getNumMovies();
	int getNumAudio();
	int getNumTheses();
	Collection searchId(int id);
	Collection searchName(String name);
	Collection searchYear(int year);
	Collection searchPublishCompany(String publish);
}
