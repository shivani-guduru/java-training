package java_calc;
import java.util.*;

public class calc {
	public static void main (String[] args) {
		
		int a=0;
		int b=0;
		int result;
		char operator; 
	    Scanner input = new Scanner(System.in);

	 
	    System.out.println("Choose an operator");
	    operator = input.next().charAt(0);

	    
	    System.out.println("first number");
	    a = input.nextInt();

	    System.out.println("second number");
	    b = input.nextInt();

	    switch (operator) {

	      case '+':
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	      
	      case '-':
	        result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;

	    
	      case '*':
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;

	     
	      case '/':
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    
	  }
	
		
		}
	
	


