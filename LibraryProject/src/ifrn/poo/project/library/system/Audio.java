package ifrn.poo.project.library.system;

public interface Audio extends Collection{
	
	void setDuration(int duration);
	void setType(String type);
	void setFormat(String format);
	int getDuration();
	String getType();
	String getFormat();
}
