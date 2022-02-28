package method;

public class Method 
	{

	    public  static void multiplication (int a, int b)// Static method demo
	    	{
	    		int res= a*b;
	    		System.out.println("product of two numbers(i.e. 8 and 9) is:  " +res);
	    	}
	    
		public static void main(String[] args) 
			{
				int a=8;
				int b=9;
				multiplication(a,b);
			}

	}


