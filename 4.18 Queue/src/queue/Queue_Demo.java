package queue;
import java.util.LinkedList;
import java.util.Queue;


public class Queue_Demo 
{

	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();//Defining/Creating Queue
        
        for (int i = 1; i <= 9; i++)
            q.add(i);
 
        System.out.println("Elements of queue " + q);
                          
        int removedele = q.remove();//remove() is used to remove element from queue
        System.out.println("removed element: " + removedele);
                           
        System.out.println(q);
 
        int head = q.peek();//peek() is used to get 1st element of queue
        System.out.println("head of queue- "+ head);
                         
        int size = q.size();//size() is used to get size of queue
        System.out.println("Size of queue- " + size);
                          

	}

}
