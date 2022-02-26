import java.util.Scanner;
public class ArithmeticCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char operator;
			Double number1, number2, result;
			Scanner input=new Scanner(System.in);
			System.out.println("Please Select Operation to Perform:\n1-Addition,\n2-Subtraction,\n3-Division,\n4-Multiplication");
			operator=input.next().charAt(0);
			
			System.out.println("Enter First Number: ");
			number1=input.nextDouble();
			
			System.out.println("Enter Second Number");
		    number2=input.nextDouble();
		    
		    switch(operator) {
		    case '1':
		    	result= number1+number2;
		    	System.out.println(number1 +"+"+number2+"="+ result);
		    	break;
		    	
		    case '2':
		    	result= number1-number2;
		    	System.out.println(number1 +"-"+number2+"="+ result);
		    	break;
		    	
		    case '4':
		    	result= number1*number2;
		    	System.out.println(number1 +"*"+number2+"="+ result);
		    	break;
		    	
		    case '3':
		    	result= number1/number2;
		    	System.out.println(number1 +"/"+number2+"="+ result);
		    	break;
		    	
		    	default:
		    		System.out.println("Invalid operator");
		    		break;
		    }
			input.close();
			}

		}
	