package stack;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		
        Stack<Integer> stack = new Stack<Integer>();//Defining/Creating Stack
        
        stack.add(75);//adding Element in Stack
        stack.add(34);//adding Element in Stack
        stack.add(45);//adding Element in Stack
        stack.add(83);//adding Element in Stack
        stack.add(90);//adding Element in Stack
        
        System.out.println("Stack: " + stack);//Printing Elements in Stack
        int rem_ele = stack.remove(1);//Removing Element in 1st position from Stack
  
        System.out.println("\nRemoved element: " + rem_ele); // Printing Removed Stack     
        System.out.println("\nFinal Stack: " + stack);//Printing Stack after removing element
                           
    }
}
