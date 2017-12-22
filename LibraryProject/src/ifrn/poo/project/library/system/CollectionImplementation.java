package ifrn.poo.project.library.system;

   public class CollectionImplementation implements Collection{
	protected int id;
	protected int year;
	protected int num_copies;
	protected int borrowed;
	protected String author;
	protected String publish_company;
	protected String name;
	protected Category category;
	protected Collection next;
	
	CollectionImplementation(){
		this.id = -1;
		this.year = -1;
		this.num_copies = 0;
		this.borrowed = 0;
		this.author = "";
		this.publish_company = "";
		this.name = "";
		this.category = null;
	}
	
    public void setName(String name) {
		this.name = name;
	}
	
    public void setId(int id) {
		this.id = id;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublishCompany(String publish) {
		this.publish_company = publish;
	}
	
	public void setNumCopies(int num) {
		this.num_copies = num;
	}
	
	public void setBorrowed(int borrowed) {
		this.borrowed = borrowed;
	}
	
	public void setNext(Collection book){
		next = book;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getPublishCompany() {
		return this.publish_company;
	}
	
	public int getNumCopies() {
		return this.num_copies;
	}
	
	public int getBorrowed() {
		return this.borrowed;
	}
	
	public Collection getNext() {
		return next;
	}
	public int availability() {
		return (this.num_copies - this.borrowed);
	}
}
