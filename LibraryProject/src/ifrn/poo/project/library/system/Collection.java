package ifrn.poo.project.library.system;

abstract interface Collection {
	
	void setName(String name);
	void setId(int id);
	void setCategory(Category category);
	void setYear(int year);
	void setAuthor(String author);
	void setPublishCompany(String publish);
	void setNumCopies(int num);
	void setBorrowed(int borrowed);
	String getName();
	int getId();
	Category getCategory();
	int getYear();
	String getAuthor();
	String getPublishCompany();
	int getNumCopies();
	int getBorrowed();
	int availability();
}
