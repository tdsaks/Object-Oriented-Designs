import java.util.List;
public class ShowExistingPost implements MenuState{
	
	List<Post> postings;
	
	public ShowExistingPost(List<Post> p) {
		this.postings = p;
	}
	
	public void displayPage() {
		for(int i = 0; i < postings.size(); i++) {
			System.out.println(postings.get(i));
			System.out.println();
		}
	}
}
