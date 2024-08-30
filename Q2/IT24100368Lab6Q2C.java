import java.util.Scanner;

public class IT24100368Lab6Q2C 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	int[] number = new int[10];
        	int i;
		double sum=0;
		double average;

        	System.out.println("Please enter the 10 numbers:");

        	for (i = 0; i < 10; i++) 
		{
            	System.out.print("Enter number " + (i + 1) + " : ");
            	number[i] = input.nextInt();
		sum += number[i];
        	}

        	System.out.print("The numbers you entered are: ");

        	for (i = 0; i < 10; i++) 
		{
            	System.out.print(number[i] + " ");
        	}

		average = sum / number.length;

		System.out.println("\n\nSum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);

		

    	}
}
	