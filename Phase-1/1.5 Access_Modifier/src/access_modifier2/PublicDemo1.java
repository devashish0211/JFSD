package access_modifier2;
import access_modifier.PublicDemo;

class Public extends PublicDemo {
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class PublicDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Public access modifier operation done");
		Public p = new Public();
		p.display();
	}

}
