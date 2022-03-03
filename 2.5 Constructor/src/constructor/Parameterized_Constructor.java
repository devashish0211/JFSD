package constructor;


//parameterized constructor
class p_cons{
	int id;
	String name;
	p_cons(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}


public class Parameterized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p_cons em=new p_cons(1,"parameterized constructor1");
		p_cons em1=new p_cons(2,"parameterized constructor1");
		
		em.display();
		em1.display();

	}

}
