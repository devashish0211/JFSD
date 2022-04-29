package extended_thread;

public class Extended_Thread extends Thread  {

	
	public void run() {
		System.out.println("Thread is running......");
	}

	public static void main(String[] args) {
		Extended_Thread t1= new Extended_Thread();
		t1.start();

	}

}
