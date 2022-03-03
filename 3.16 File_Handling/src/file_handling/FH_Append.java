package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FH_Append {

	public static void main(String[] args) {
		
		// Append text to Existing File.
		 String path = "C:\\Users\\devas\\OneDrive\\Desktop\\File_Handling\\File_Handling.txt";
		 String text = " This text is added using Append ";
		 try
		 {
		 FileWriter f = new FileWriter(path,true);
		 f.write(text);
		 f.close();
		 System.out.println("Append done Successfully");
		 }
		 catch(IOException e){
		 System.out.println(e);
		 }
	}

}
