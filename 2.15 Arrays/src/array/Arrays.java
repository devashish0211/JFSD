package array;

public class Arrays 
{

	public static void main(String[] args) 
	{
		  int a[]= {10,20,30,40,50};//Array
		  System.out.println("Elements of array are:-");
		  for(int i=0;i<5;i++) 
		    {
		    System.out.println( a[i]);
		    }	
		    
		     
	       int b[][]={ {20,40,60,80,100},{1,2,3,4,5,} };//2D Array
	       System.out.println("Element of 2D array are:-");
	       for(int i=0;i<5;i++) 
	       	{
	    	   for(int j=0;j<5;j++) 
	    	   	{
	    		   System.out.println(b[i][j]+ " ");
	    	   	}
	       	}
	}

}
