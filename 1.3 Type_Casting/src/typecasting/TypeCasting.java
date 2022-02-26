package typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit Conversion
				System.out.println("implicit conversion");
				char a= 'a';
				int b= a;
				long lo= b;
				float f= b;
				double d= b;
				System.out.println("Value of a:"+a);
				System.out.println("Value of b:"+b);
				System.out.println("Value of c:"+lo);
				System.out.println("Value of d:"+f);
				System.out.println("Value of e:"+d);
				//Explicit conversion
				System.out.println("explicit convertion");
				double h=75.6;
				float i=(float)h;
				long j=(long)i;
				int k=(int)j;
				char l=(char)k;
				short m=(short)l;
				byte n=(byte)m;
				System.out.println("Value of h:"+h);
				System.out.println("Value of i:"+i);
				System.out.println("Value of j:"+j);
				System.out.println("Value of k:"+k);
				System.out.println("Value of l:"+l);
				System.out.println("Value of m:"+m);
				System.out.println("Value of n:"+n);
	}

}
