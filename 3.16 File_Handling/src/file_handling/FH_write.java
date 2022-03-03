package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FH_write 
{

	public static void main(String[] args) 
	{
		//Writing in the file 
		 try
		 {
			 FileWriter f = new FileWriter("C:\\Users\\devas\\OneDrive\\Desktop\\File_Handling\\File_Handling.txt");
		 try
		 {
		 f.write("This is a paragraph is written using write  operation");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("File Written Successfully ");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }
		 
		 
	}

}
