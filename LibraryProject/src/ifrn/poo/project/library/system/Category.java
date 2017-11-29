package ifrn.poo.project.library.system;

public interface Category {
	
	void setName(String name);
	void setId(int id);
	void setBooks(Collection book);
	String getName();
	int getId();
	Collection getBooks();
	int numCollection();
	int numBooks();
	int numMagazines();
	int numMovies();
	int numAudio();
	int numTheses();
	Collection searchId(int id);
	Collection searchName(String name);
	Collection searchYear(int year);
	Collection searchPublishCompany(String publish);
}
