package exponential_search;
import java.util.Arrays;

public class Exponential_Search {
		
	// Returns position of
    // first occurrence of
    // x in array
	static int exponentialSearch(int arr[], int n, int x)
    {
        // If x is present at first location itself
        if (arr[0] == x)
            return 0;

        // Find range for binary search by
        // repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;

        // Call binary search for the found range.
        return Arrays.binarySearch(arr, i/2,
                Math.min(i, n-1), x);
    }

    // Driver code
	public static void main(String[] args) {
		
		System.out.println("Elements in array are:-");
		int arr[] = {10,20,30,40,50};
		for (int element: arr) {
            System.out.println(element);
        }
        int x = 40;
        System.out.println("And selected element is:- '40'");
        int result = exponentialSearch(arr, arr.length, x);

        System.out.println((result < 0) ? "Element is not present in array" :
                "Element is present at index " + result);
    }

}
