package pillars_of_OOPS;

	class Encapsulate 
		{
			private String Name; 
			private int Roll; 
			private int Age;
			public int getAge()  
				{ 
					return Age; 
				} 
			public String getName()  
				{ 
					return Name; 
				} 
			public int getRoll()  
				{ 
					return Roll; 
				} 
			public void setAge( int newAge) 
				{ 
					Age = newAge; 
				} 
			public void setName(String newName) 
				{ 
					Name = newName; 
				} 
			public void setRoll( int newRoll)  
				{ 
					Roll = newRoll; 
				} 
		}

public class EncapsulationDemo {

	public static void main(String[] args) 
		{	
			Encapsulate obj = new Encapsulate(); 
	        obj.setName("Harsh"); 
	        obj.setAge(19); 
	        obj.setRoll(51); 
	        System.out.println("I am: " + obj.getName()); 
	        System.out.println("My age is: " + obj.getAge()); 
	        System.out.println("My RollNo. is: " + obj.getRoll());
		}

}
