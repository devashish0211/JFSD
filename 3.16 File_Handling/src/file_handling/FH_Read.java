package file_handling;

import java.io.FileReader;
import java.io.IOException;

public class FH_Read {

	public static void main(String[] args) {

		//Reading an Existing file
		 try
		 {
		 FileReader r = new FileReader("C:\\\\Users\\\\devas\\\\OneDrive\\\\Desktop\\\\File_Handling\\\\File_Handling.txt");
		 try
		 {
		 int i;
		 while((i=r.read())!=-1)
		 {
		 System.out.print((char)i);
		 }
		 }
		 finally
		 {
		 r.close();
		 System.out.print("\n");
		 System.out.print("File Closed successfully.");
		 }
		 }
		 catch(IOException e)
		 {
		 System.out.println("Exception handled..");
		 }
	}

}
