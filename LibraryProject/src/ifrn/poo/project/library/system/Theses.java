package ifrn.poo.project.library.system;

public interface Theses extends Collection{
	
	void setAbstract(String abs);
	void setPagesNum(int num);
	void setKeywords(String word);
	String getAbstract();
	int getPagesNum();
	String getKeywords();

}
