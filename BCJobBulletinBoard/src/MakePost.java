import java.util.List;
import java.util.Scanner;

public class MakePost implements MenuState{
	
	List<Post> postings;
	
	public MakePost(List<Post> p) {
		this.postings = p;
	}
	
	public void displayPage() {
		String title,content,date;
		Scanner scanner = new Scanner(System.in);
		Post newPost;
		
		
		System.out.println("Enter the title of your posting.");
		title = scanner.nextLine();


		System.out.println("Type the content of your posting.");
		content = scanner.nextLine();
			

		System.out.println("Type the date of your posting.");
		date = scanner.nextLine();
		
		
		newPost = new Post(title,content,date);
		System.out.println(newPost);
		
		postings.add(newPost);

		
		
		//scanner.close();
	}
}
