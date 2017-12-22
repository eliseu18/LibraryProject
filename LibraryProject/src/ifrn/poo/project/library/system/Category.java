package ifrn.poo.project.library.system;
import java.util.ArrayList;

public interface Category {
	
    void setName(String name);
	void setId(int id);
	void setCollection(Collection book);
	String getName();
	int getId();
	Collection getCollection();
	int getNumCollection();
	int getNumBooks();
	int getNumMovies();
	int getNumAudio();
	int getNumTheses();
	Collection searchId(int id);
	ArrayList<Collection> searchName(String name);
	ArrayList<Collection> searchYear(int year);
	ArrayList<Collection> searchPublishCompany(String publish);
}
