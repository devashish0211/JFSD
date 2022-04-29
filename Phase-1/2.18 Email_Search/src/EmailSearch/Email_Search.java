package EmailSearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email_Search {
	 public static boolean isValidEmail(String email) {
			 String regex = "^(.+)@(.+)$";
			///initialize the Pattern object
			 Pattern pattern = Pattern.compile(regex);
			 Matcher matcher = pattern.matcher(email);
			 return matcher.matches(); 
			 }


	public static void main(String[] args) {
		ArrayList<String> emailID= new ArrayList<String>();
		
		System.out.println("Below EmailID's are the list of valid mailID also any mailID which matches this pattern is also valid:- ");
		emailID.add("abc.pqr@bcd.com");
		emailID.add("dev.sinha@gmail.com");
		emailID.add("shubham.mishra@yahoo.com");
		
		 for (String value : emailID) {
		 System.out.println("Email ID: " + value + " is:" + (isValidEmail(value) ? 
		"valid" : "invalid"));
		 } 
		 System.out.println("ENTER YOUR MAIL TO CHECK :");
		 try (Scanner sc = new Scanner(System.in)) {
		String input = sc.nextLine(); 
		System.out.println("The Email Address " + input + " is:" + (isValidEmail(input) ? "valid" : "invalid"));
		}

		
	}

}
