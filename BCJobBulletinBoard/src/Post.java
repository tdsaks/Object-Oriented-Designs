
public class Post {
	
	String title, content, date;
	
	public Post(String title, String content, String date) {
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setContent(String c) {
		this.content = c;
	}
	
	public void setDate(String d) {
		this.date = d;
	}
	
	public String toString() {
		return this.title + "\n" + this.content + "\n" + this.date;
	}
}
