package linear_search;

import java.util.Scanner;

public class Linear_Search 
{

	public static void main(String[] args) {
		
		int[] arr = {40,60,18,34,28};
		
		System.out.println("Elements in the array are:- ");
        Scanner sc = new Scanner(System.in);
        for (int element: arr) {
            System.out.println(element);
        }
        System.out.println("\nEnter the element to be searched");
        int Value = sc.nextInt();
        
        int temp=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]== Value) {
        		System.out.println("Item is Present at index position :"+i);
        		temp=temp + 1;
        	}
        }
        if(temp==0) {
        	System.out.println("Item is not found in list");
        }


	}

}

