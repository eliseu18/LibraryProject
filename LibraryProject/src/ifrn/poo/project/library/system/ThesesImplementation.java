package ifrn.poo.project.library.system;

public class ThesesImplementation extends CollectionImplementation implements Theses{

	int num_pages;
	String abs;
	String keyword;
	
	ThesesImplementation(){
		super();
		this.num_pages = -1;
		this.abs = null;
		this.keyword = null;
	}
	
	public void setAbstract(String abs) {
		this.abs = abs;
	}
	
	public void setPagesNum(int num) {
		this.num_pages = num;
	}
	
	public void setKeywords(String word) {
		this.keyword = word;
	}
	
	public String getAbstract() {
		return this.abs;
	}
	
	public int getPagesNum() {
		return this.num_pages;
	}
	
	public String getKeywords() {
		return this.keyword;
	}
}
