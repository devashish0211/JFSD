package regular_exp;
import java.util.regex.*;

public class Regular_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern is: [a-zA-Z0-9]{8} and the entered string is : dev@1102");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","dev@1102"));
		System.out.println("Pattern is: [a-zA-Z0-9]{8} and the entered string is : devAshis");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","devashis"));
		System.out.println("Pattern is: [a-zA-Z0-9]{8} and the entered string is : devAshi1");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","devAshi1"));
		System.out.println("Pattern is: [a-zA-Z0-9]{8} and the entered string is : deVa1102");
    	System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","deVa1102"));
    	System.out.println("Pattern is: [^a-zA-Z0-9]{8} and the entered string is : DeV110224");
    	System.out.println(Pattern.matches("[^a-zA-Z0-9]{8}","DeV110224"));
    	
    	System.out.println("Pattern is: any Alphabet Between A to Z");
    	System.out.println("Input Is:- 'REGular EXPression' \nAnd Output for it is:-");    	
    	String pattern="[A-Z]+";
    	String check= "REGular EXPression";
    	Pattern p=Pattern.compile(pattern);
    	Matcher c=p.matcher(check);
    	
    	while(c.find()) {
    		System.out.println(check.substring(c.start(),c.end()));
    	}

	}

}
