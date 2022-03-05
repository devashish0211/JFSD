package order_statistics;
import java.util.Arrays;

public class Order_Statistics {

	public static void main(String[] args) 
		{
			int[] arr= {33,5,7,78,55,2,1};
			System.out.println("Elements in Array are:- ");
			for (int element: arr) 
				{
					System.out.println(element);
				}
			int result= Order_Statistics.kthSmallestElement(arr,4);
			System.out.println("\nSelected Position from Array is:- '4th'");
			System.out.println("Element at 4th Position is:\n"+result);
		 }
	
     static int kthSmallestElement(int[] arr, int k) 
     	{
    	 	Arrays.sort(arr);
    	 	return arr[k-1];
     	}

}
