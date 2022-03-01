package innerClass;

class OuterClass
	{
	
		private String msg = "This message is printing through InnerClass";
		
		void display() {
			
			class InnerClass {
				void msg() {
					System.out.println(msg);
				}
			}
			
			InnerClass innerObj = new InnerClass();
			innerObj.msg();
		}
	}


	public class Inner_Class {

		public static void main(String[] args) {
			OuterClass outer = new OuterClass();
			outer.display();

		}

}
