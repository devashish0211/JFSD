package keyword_CustomException;

class InvalidAgeException extends Exception  
	{  
	
		private static final long serialVersionUID = 1L;
		public InvalidAgeException (String str)  
    		{  
    			// calling the constructor of parent Exception  
    			super(str);  
    		}  
	} 


public class Custom_Exception 
{
	 static void validate (int age) throws InvalidAgeException
	 	{    
	       if(age < 18)
	       		{  
	    	   	throw new InvalidAgeException("Candidate not Eligible for voting(due to age<18)");    
	       		}  
	       else 
	       	{   
	    	   System.out.println("Cast your Vote here");   
	        }   
	     }    

	public static void main(String[] args) 
		{
		
			try  
				{  
					validate(13);  
				}  
			catch (InvalidAgeException ex)  
				{  
					System.out.println("Caught the exception");  
					System.out.println("Exception occured: " + ex);  
				}  
  
			System.out.println("rest of the code here");    
		}  

}
