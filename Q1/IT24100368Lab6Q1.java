import java.util.Scanner;
public class IT24100368Lab6Q1
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);

		double number,square,squareRoot;
		System.out.println("Enter a number:");
		number=input.nextDouble();
		
		square=number*number;
		squareRoot=Math.sqrt(number);
		
		
		System.out.println("The square of " +number+ " is: " +square);
		System.out.println("The square root of " +number+ " is: " +squareRoot);
	}
}
		