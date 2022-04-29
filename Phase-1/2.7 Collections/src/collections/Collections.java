package collections;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		//creating Arraylist
	    System.out.println("Arraylist");
		ArrayList<String> tens = new ArrayList<>();
		//add elements using add() method
		tens.add("10");// Adding ELement
		tens.add("20");// Adding ELement
		tens.add("30");// Adding ELement
		tens.add("40");// Adding ELement
		System.out.println("Arraylist: " +tens);
		
		//creating Vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<String> vec = new Vector<>();
		//adding elements using add() method
		vec.add("London");
		vec.add("New-york");
		vec.add("Manchester");
		//adding element using addelement() method
		vec.addElement("Birmingham");
		vec.addElement("Bristol");
		//check size and  capacity
		System.out.println("Size is: " +vec.size());
		System.out.println("Capacity is" +vec.capacity());
		System.out.println("Vector: " +vec);
		
		
		//creating Linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> country = new LinkedList<String>();
		//add elements
		country.add("Ukrain");
		country.add("Russia");
		country.add("Poland");
		country.add("Slovakia");
		Iterator<String> itr= country.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		//Creating hashset
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer> poulation=new HashSet<Integer>();
		poulation.add(4000000);
		poulation.add(14000000);
		poulation.add(3800000);
		poulation.add(540000);
		System.out.println(poulation);
		
		//Creating Linkedhashset
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> num=new LinkedHashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		System.out.println(num);
		
		
		
		
	}

	}

}
