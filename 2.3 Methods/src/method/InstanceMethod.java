package method;

public class InstanceMethod //Creating Instance Method
{

		public int addnumber(int a, int b)// Creating Method
			{
				int c=a+b;
				return c;
			}
		public static void main(String[] args) 
			{
				 
				InstanceMethod m = new InstanceMethod();//Creating  Scanner class
				int res= m.addnumber(78,4);//call by value
		        System.out.println("Addition of two numbers(78 and 4) is: "+res);
			}

}


