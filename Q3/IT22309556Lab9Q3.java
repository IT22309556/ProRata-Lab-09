import java.util.Scanner;

public class IT22309556Lab9Q3 {
    
	// Method for add
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	//method for multiply
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	
	//method for square
	public static int square(int a)
	{
		return multiply(a,a); // reusing the multiply method
	}
	
	public static void main(String args[]) {
		
		//(3 * 4 + 5 * 7)^2
		//((3*4)+(5*7))^2;
		int expression1 = square(add(multiply(3,4),multiply(5,7)));
		System.out.println("Result of (3 * 4 + 5 * 7)\u00B2       : " + expression1); 
		
		//(4 + 7)^2 + (8 + 3)^2
		int expression2 = add(square(add(4,7)) , square(add(8,3)));
		System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2  : " + expression2);
		
		
		
	}
}