import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainMenu {
	
	static Post defaultPost1 = new Post("Looking for TA","Our department is looking for a TA for this semester.","Dec. 11th 2020");
	static Post defaultPost2 = new Post("Looking for assistant at the dining hall","The dining hall is looking for a new dining hall assistant.","Jun. 17th 2020");
	static Post defaultPost3 = new Post("Looking for a new librarian at O'Neil","The O'Neil library is looking for a new assistant for the night shift.","Oct. 11th 2020");
	
	static List<Post> postings = new ArrayList<Post>();
	
	


	public static void main(String[] args) {
		
		System.out.println(defaultPost1);
		
		Scanner scanner = new Scanner(System.in);
		
		UserAccountMaker staffMaker;
		UserAccountMaker studentMaker;
		String firstName,lastName;
		boolean isStudent = true;
		StudentAccount student = null;
		StaffAccount staff = null;
		
		postings.add(defaultPost1);
		postings.add(defaultPost2);
		postings.add(defaultPost3);
		
		System.out.println();
		while(true) {
			System.out.println("Welcome to BC Bulletin Board!");
			System.out.println("Enter '1' if you're a student or enter '2' if you're a staff.");
			
			String input = scanner.nextLine();
			if(input.equals("1")) { //student
				isStudent = true;
				
				System.out.println("What is your first name?");
				firstName = scanner.nextLine();
				System.out.println("What is your last name?");
				lastName = scanner.nextLine();
						
				studentMaker = new StudentAccountMaker();
				student = (StudentAccount) studentMaker.makeUserAccount(firstName, lastName);
				
				System.out.println("What is your major?");
				student.setMajor(scanner.nextLine());
				
				System.out.println("What is your school year?");
				student.setSchoolYear(scanner.nextInt());
								
			} else if(input.equals("2")) { //staff
				isStudent = false;
				
				System.out.println("What is your first name?");
				firstName = scanner.nextLine();
				System.out.println("What is your last name?");
				lastName = scanner.nextLine();
				
				staffMaker = new StaffAccountMaker();
				staff = (StaffAccount) staffMaker.makeUserAccount(firstName, lastName);
				
				System.out.println("Which department are you from?");
				staff.setDepartment(scanner.nextLine());
				
			}
			
			MenuState showMenu = new ShowMenu();
			
			MenuContext context = new MenuContext(showMenu);
			//System.out.println(scanner.nextLine());
			while(true) {
				context.displayPage();
				input = scanner.nextLine();
				
				if(input.equals("1")) {
					MenuState existingPost = new ShowExistingPost(postings);
					context.changeState(existingPost);
					context.displayPage();
										
					context.changeState(showMenu);
					
					
				} else if(input.equals("2")) {
					MenuState makePost = new MakePost(postings);
					context.changeState(makePost);
					context.displayPage();
					
					System.out.println("Press any button to return to main menu.");
					if(scanner.hasNextLine()) {
						context.changeState(showMenu);
					}
					
				} else if(input.equals("3")) {
					if(isStudent) {
						System.out.println(student);
						context.changeState(showMenu);
						
					} else {
						System.out.println(staff);
						context.changeState(showMenu);
					
					}
				} else if(input.equals("4")) {
					System.out.println("Thank you for using our system.");
					break;
				} else {
					System.out.println("Invalid input. Please try again.");
					context.changeState(showMenu);

				}
			}
			
			scanner.close();
			break;
			
			
			

		}

	}
}
	