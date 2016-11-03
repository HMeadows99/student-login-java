import java.util.Scanner;

/**
 * 
 */

/**
 * @author haidan.meadows
 *Mr.Hardman
 *java assignment#1, program 2
 * 11/2/2016
 */
public class studentlogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = userInput.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = userInput.nextLine();
		
		String userName = (firstName + lastName);
		
		System.out.println("what grade are you in?");
		int grade = userInput.nextInt();
		
		System.out.println("What is your grade average?");
		double average = userInput.nextDouble();
		
		System.out.println("What is your student ID?");
		int studentID = userInput.nextInt();
		
		System.out.println("What is your Student login?");
		String login = userInput.next();
		
		System.out.println(String.format("%-20s" + login, "Login:"));
		System.out.println(String.format("%-20s" + studentID, "ID:"));
		System.out.println(String.format("%-20s" + lastName + "," + firstName, "Name::"));
		System.out.println(String.format("%-20s" + average, "Average:"));
		System.out.println(String.format("%-20s" + grade, "Grade:"));
		
		userInput.close();
		
		
	}

}
