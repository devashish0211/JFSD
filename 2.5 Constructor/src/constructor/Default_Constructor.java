package constructor;


//Default constructor
	class cons
	{
		int id=1;
		String name="constructor";
	
		void display() //method to display the value of id and name 
		{
			System.out.println(id+" "+name);
		}
	}

public class Default_Constructor 
{

	public static void main(String[] args) 
		{
		//creating objects 
		cons em=new cons();
		cons em1=new cons();
		//displaying values of the object  
		em.display();
		em1.display();
			
		}

}


