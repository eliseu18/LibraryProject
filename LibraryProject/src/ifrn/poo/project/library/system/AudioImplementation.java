package ifrn.poo.project.library.system;

public class AudioImplementation extends CollectionImplementation implements Audio{

	int duration;
	String type;
	String format;
	
	AudioImplementation(){
		super();
		this.duration = -1;
		this.type = null;
		this.format = null;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getFormat() {
		return this.format;
	}
}
