package ifrn.poo.project.library.system;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CategoryImplementation implements Category {
	
	private int id;	// ID of each category
	private int num_collection; // Total of collections on this category
	private int num_books;	// Total of books..
	private int num_magazines;
	private int num_movies;
	private int num_audios;
	private int num_theses;
	private String name; // Category name.
	private HashMap<Integer,Collection> books;
	
	CategoryImplementation(){
		this.id = -1;
		this.num_collection = 0;
		this.num_books = 0;
		this.num_magazines = 0;
		this.num_movies = 0;
		this.num_audios = 0;
		this.num_theses = 0;
		this.name = null;
		this.books = new HashMap<Integer,Collection>();
		initializeBooks();
	}
	
	 public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// Must check the object type and add plus 1 to it's type variable
	/*
	 * (non-Javadoc)
	 * @see ifrn.poo.project.library.system.Category#setCollection(ifrn.poo.project.library.system.Collection)
	 * In this method i will use HashMap to Index the Collection first letter and i will use ordered list chain to
	 * create a group of objects with that letter.
	 */
	public void setCollection(Collection book){
		try {
			int firstletter = book.getName().charAt(0); // firstletter is a int that represents a ansi char
			if(firstletter < 65 || firstletter > 90) { // Checking if it between A to Z
				firstletter = 64;						// If not, put in the first position @ for all special char.
			}
			Collection item = this.books.get(firstletter);
			Collection previous = null;
			if(item == null) { 
				item = book;
				countType(book);
			}
			else{
				if (isItHere(item.getName(), book.getName())) {
					book.setNext(item);
					this.books.put(firstletter, book);
					countType(book);
				}else {
					do{
						previous = item;
						item = item.getNext();
						if(item == null) {
							previous.setNext(book);
							countType(book);
						}else {
							if(isItHere(item.getName(), book.getName())) {
								previous.setNext(book);
								book.setNext(item);
								countType(book);
								item = null;
							}
						}
					}while(item != null);
				}
			}
		}catch (Throwable exc){
			throw exc;
		}
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
		int firstletter = id/100000;
		if(firstletter < 65 || firstletter > 90) {
			firstletter = 64;
		}
		Collection current = books.get(firstletter);
		while(current != null) {
			if(current.getId() == id) {
				return current;
			}else
				current = current.getNext();
		}
		return null; 
	}
	
	public ArrayList<Collection> searchName(String name) {
		ArrayList<Collection> list = new ArrayList<Collection>();
		Collection current = null;
		for (int i = 64; i < 91; i++) {
			current = books.get(i);
			while(current != null) {
				if(current.getName().contains(name))
					list.add(current);
				current = current.getNext();
			}
		}
		return list;
	}
	
	public ArrayList<Collection> searchYear(int year) {
		ArrayList<Collection> list = new ArrayList<Collection>();
		Collection current = null;
		for (int i = 64; i < 91; i++) {
			current = books.get(i);
			while(current != null) {
				if(current.getYear() == year)
					list.add(current);
				current = current.getNext();
			}
		}
		return list;// Implement search method by year;
	}
	
	public ArrayList<Collection> searchPublishCompany(String publish) {
		ArrayList<Collection> list = new ArrayList<Collection>();
		Collection current = null;
		for (int i = 64; i < 91; i++) {
			current = books.get(i);
			while(current != null) {
				if(current.getPublishCompany().contains(publish))
					list.add(current);
				current = current.getNext();
			}
		}
		return list;
	}
	
	/*
	 * In this implementation book is a hashmap and has two values, a integer that is a char Ansi value. We also have a collection object.
	 * The integer represents a number, after it will be converted to a char. It will represent a char between A to ]
	 */
	
	private void initializeBooks() {
		Integer letter = 64;
		//Search about char math methods.
		for(int i = 0; i <= 24; i++) {
			books.put(letter, null);
			letter++;
		}
	}
	
	/*
	 * It compares two strings alphabetically, if the first one comes first it will return true, if the second one comes first it will
	 * return false  
	 */
	private boolean isItHere(String first, String second) {
		if(first.compareToIgnoreCase(second) >= 0)
			return true;
		else
			return false;
	}
	
	private void countType(Collection book){
		if(book instanceof Audio)
			this.num_audios++;
		else {
			if(book instanceof Book) {
				this.num_books++;
			}
			else {
				if(book instanceof Movie) {
					this.num_movies++;
				}else {
					if(book instanceof Theses)
						this.num_theses++;
				}
			}
		}
		this.num_collection++;
	}
}
