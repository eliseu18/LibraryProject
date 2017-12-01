package ifrn.poo.project.library.system;

final class BookImplementation extends CollectionImplementation implements Book {

		int pages_num;
		String preface;
		
		BookImplementation(){
			super();
			this.pages_num = -1;
			this.preface = "";
		}
		
		public void setPagesNum(int num) {
			this.pages_num = num;
		}
		
		public void setPreface(String preface) {
			this.preface = preface;
		}
		
		public int getPagesNum() {
			return this.pages_num;
		}
		
		public String getPreface() {
			return this.preface;
		}
}
