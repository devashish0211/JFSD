package access_modifier2;
import access_modifier.D;

class Protect extends D
{
	void test() 
	{
		System.out.println(b);
	}
}
public class ProtectedDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Default access modifier operation done");
        Protect p = new Protect();
        p.test();
	}

}
