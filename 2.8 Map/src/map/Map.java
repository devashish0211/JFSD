package map;

import java.util.TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class Map 
{

	
	public static void main(String[] args) 
		{
			//Map
			// HashMap
			System.out.println("\nThe elements of HashMap are:");
			HashMap<Integer, String> cityinUK= new HashMap<Integer, String>();
			cityinUK.put(01," London");
			cityinUK.put(02," Bristol");
			for(Entry<Integer, String> a:cityinUK.entrySet()) 
				{
					System.out.println(a.getKey()+""+a.getValue());
				}
			
			//Hashtable
			System.out.println("\nThe elements of HashTable are:");
			Hashtable<Integer, String> cityinUS= new Hashtable<Integer, String>();
			cityinUS.put(3," NewYork");
			cityinUS.put(4," Los Angeles");
			cityinUS.put(5," Seattle");
			for(Entry<Integer, String> b:cityinUS.entrySet()) 
				{
					System.out.println(b.getKey()+""+b.getValue());
				}
			
			//TreeMap
			System.out.println("\nThe elements of TreeMap are:");
			TreeMap<Integer, String> cityinInd= new TreeMap<Integer, String>();
			cityinInd.put(6," Raipur");
			cityinInd.put(7," Mumbai");
			cityinInd.put(8," Banglore");
			
			for(Entry<Integer, String> c:cityinInd.entrySet()) 
				{
					System.out.println(c.getKey()+""+c.getValue());
				}
			
		}

}


