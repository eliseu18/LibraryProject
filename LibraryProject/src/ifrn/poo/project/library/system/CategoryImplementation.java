package ifrn.poo.project.library.system;

public class CategoryImplementation implements Category {
	
	int id;	// ID of each category
	int num_collection; // Total of collections on this category
	int num_books;	// Total of books..
	int num_magazines;
	int num_movies;
	int num_audios;
	int num_theses;
	String name; // Category name.
	Collection[] books;
	
	CategoryImplementation(){
		this.id = -1;
		this.num_collection = 0;
		this.num_books = 0;
		this.num_magazines = 0;
		this.num_movies = 0;
		this.num_audios = 0;
		this.num_theses = 0;
		this.name = null;
		this.books = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// Must check the object type and add plus 1 to it's type variable
	public void setBooks(Collection book) {
		// Array implementation
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public Collection getCollection(){
		return null;// Search collection on array and return it.
	}
	
	public int getNumCollection() {
		return this.num_collection;
	}
	
	public int getNumBooks(){
		return this.num_books;
	}
	
	public int getNumMagazines(){
		return this.num_magazines;
	}
	
	public int getNumMovies() {
		return this.num_movies;
	}
	
	public int getNumAudio() {
		return this.num_audios;
	}
	
	public int getNumTheses() {
		return this.num_theses;
	}

	public Collection searchId(int id) {
		return null; //Implement search method by ID.
	}
	
	public Collection searchName(String name) {
		return null;// Implement search method by name.
	}
	
	public Collection searchYear(int year) {
		return null;// Implement search method by year;
	}
	
	public Collection searchPublishCompany(String publish) {
		return null;// Implement search method by publish
	}
	
}
