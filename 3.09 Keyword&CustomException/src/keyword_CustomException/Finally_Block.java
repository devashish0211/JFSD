package keyword_CustomException;

public class Finally_Block 
{

	public static void main(String[] args) 
		{
		
			try
			   {    
				  int data=36/6;    
				  System.out.println(data);    
			   }    
			
			catch(NullPointerException e)
				{  
					System.out.println(e);  
				}    
			
			finally 
				{  
					System.out.println("finally block is always executed");  
				}    
			  System.out.println("rest of the code...");    
		} 

}
