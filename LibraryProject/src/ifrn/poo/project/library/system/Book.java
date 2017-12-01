package ifrn.poo.project.library.system;

public interface Book extends Collection {

	void setPagesNum(int num);
	void setPreface(String preface);
	int getPagesNum();
	String getPreface();
}
