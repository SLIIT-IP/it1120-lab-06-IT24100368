import java.util.Scanner;

public class IT24100368Lab6Q2B 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	int[] number = new int[10];
        	int i;

        	System.out.println("Please enter the 10 numbers:");

        	for (i = 0; i < 10; i++) 
		{
            	System.out.print("Enter number " + (i + 1) + " : ");
            	number[i] = input.nextInt();
        	}

        	System.out.print("The numbers you entered are: ");

        	for (i = 0; i < 10; i++) 
		{
            	System.out.print(number[i] + " ");
        	}

    	}
}
	