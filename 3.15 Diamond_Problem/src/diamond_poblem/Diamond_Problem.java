package diamond_poblem;


interface Interface1
	{
	   
	   public default void display() 
	   		{
		   		System.out.println("This is 1st Interface");
	   		}
	}
interface Interface2
	{
	  
	   public default void display() 
	   		{
		   		System.out.println("This is 2nd Interface");
	   		}
	}

public class Diamond_Problem implements Interface1, Interface2 {

	public void display() 
		{
	      Interface1.super.display();
	      Interface2.super.display();
		}

	
	public static void main(String[] args) 
	{
		Diamond_Problem obj = new Diamond_Problem();
	      obj.display();
	}

}
