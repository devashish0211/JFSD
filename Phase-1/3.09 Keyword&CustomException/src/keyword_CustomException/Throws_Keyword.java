package keyword_CustomException;

import java.io.IOException;

public class Throws_Keyword {
	
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

	public static void main(String[] args) {
		
		Throws_Keyword obj=new Throws_Keyword();  
		   obj.p();  

	}

}
