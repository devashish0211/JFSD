package EmailSearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailSearch 
{

		
	public static boolean isValidEmail(String email) 
		{
			 String regex = "^(.+)@(.+)$";
			///initialize the Pattern object
			 Pattern pattern = Pattern.compile(regex);
			 Matcher matcher = pattern.matcher(email);
			 return matcher.matches(); 
		}


	public static void main(String[] args) 
		{
		ArrayList<String> emailID= new ArrayList<String>();
		emailID.add("arti.mole@xyz.com");
		emailID.add("laxmi.rao@xyz.com");
		emailID.add("vinita.yadav@xyz.com");
		emailID.add("ram.chandra@xyz.com");
		emailID.add("anuj.das@xyz.com");
		emailID.add("kanak.rai@xyz.com");
		emailID.add("sapna.kahar@xyz.com");
		emailID.add("ravi.sharma@xyz.com");
		
		 for (String value : emailID) 
		 	{
			 System.out.println("The Email address " + value + " is:" + (isValidEmail(value) ? 
					 "valid" : "invalid"));
		 	} 
		 System.out.println("ENTER YOUR MAIL TO CHECK :");
		 
		 try (Scanner sc = new Scanner(System.in))
		 	{
			 String input = sc.nextLine(); 
			 System.out.println("The Email Address " + input + " is:" + (isValidEmail(input) ? "valid" : "invalid"));
		 	}
		}

}


