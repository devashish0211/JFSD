package thread;

public class Thread_Demo implements Runnable {

	public void run() {
		System.out.println("Thread is running........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_Demo t1=  new Thread_Demo();
		Thread t2= new Thread(t1);
		t2.start();

	}

}
