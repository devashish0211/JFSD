package binary_search;
import java.util.Scanner;


public class Binary_Search 
{

	public static void main(String[] args) 
		{
		
				System.out.println("Elements in the array are:- ");
				int[] a= {22,34,54,67,70,73,80,85,90};
				
				Scanner s= new Scanner(System.in);
				for (int element: a) 
				{
		            System.out.println(element);
		        }
				System.out.println("\nEnter the number to search");
				int srch=s.nextInt();
				int li=0;
				int hi= a.length-1;
				int mi=(li+hi)/2;
			    
				while(li<= hi) 
				{
					if(a[mi]== srch) 
						{
							System.out.println("element is at "+mi+" index position");
							break;
						}
					else if(a[mi]<srch) 
						{
							li=mi+1;
						}
					
					else {
							hi=mi-1;
						 }
					mi=(li+hi)/2;
				}
				if(li>hi) 
				{
					System.out.println("element not found");
				}
						

		}

}
