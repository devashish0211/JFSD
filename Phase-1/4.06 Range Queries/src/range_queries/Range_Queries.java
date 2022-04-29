package range_queries;

import java.util.Scanner;


public class Range_Queries {

	public static int sumRange(int[] arr, int l, int j) {
		int sum=0;
		for(int i= l; i<= j; i++) {
			
			sum += arr[i];
		}
			return sum;	 
	}

	public static void main(String[] args) 
	{
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		try {
		while(true) 
		{
			System.out.println("Please enter value of l:");
			int l = sc.nextInt();
			
			System.out.println("Please enter value of r:");
			int r = sc.nextInt();
			
			System.out.println("Result:"+Range_Queries.sumRange(arr, l, r)+"\n");
		}}
		finally {
	        sc.close();
	        System.out.println("Invalid Entry of value!");
	        System.out.println("please give value between 0 & 9");
	        
	    }
	}

}
