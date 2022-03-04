package string;

public class Strings 
{

		public static void main (String args[]) 
		{
			System.out.println("Various Methods of String");
			String s1= "Hello String";// String literal
			System.out.println(s1);
			
			String s2=new String("this is using length method");// new keyword
			System.out.println("\nLength of 'Various Methods of String' is:-");
			System.out.println(s2.length());

			//Using SubString
			String s3=new String("usingsubstring");
			System.out.println("\nThw string passed here is 'usingsubstring' with 5 as substring length\n");
			System.out.println(s3.substring(5));
			
			//Using LowerCase
			String s4=new String("USING LOWERCASE");
			System.out.println(s4.toLowerCase());
			
			//Using UpperCase
			String s5=new String("using uppercase");
			System.out.println(s5.toUpperCase());
			
			//Using charAt
			String s6= "CharaT";
			char ch=s6.charAt(5);
			System.out.println("\nHere we are using ChatAT string");
			System.out.println(ch);
			
			//Using Concat String 
			String s7="\nThis ";
			String s8="Is ";
			String s9="Concatenated ";
			String s10="String\n";
			System.out.println(s7.concat(s8).concat(s9).concat(s10));
			
			//Using contains
			String s11 = "Here i am testing contains in string";
			System.out.println(s11.contains("testing contains"));	
			System.out.println(s11.contains("here"));
			System.out.println(s11.contains("string"));	
			
			//Using endWith
			System.out.println("\n");
			System.out.println(s11.endsWith("string"));
			System.out.println(s11.endsWith(" Here"));
			System.out.println(s11.endsWith("contains in string"));
			
			//Using String Buffer
			System.out.println("\nHere we are Testing String Buffer");
			StringBuffer buffer =new StringBuffer("String");
			buffer.append("Buffer");
			System.out.println(buffer);
			buffer.delete(1,4);
			System.out.println(buffer);
			buffer.reverse();
			System.out.println(buffer);
			
			//Using String Builder
			System.out.println("\nHere we are Testing String Buider");
			StringBuilder builder =new StringBuilder("String");
			builder.append("Buider");
			System.out.println(builder);
			builder.delete(1,4);
			System.out.println(builder);
			builder.reverse();
			System.out.println(builder);
		}

}
