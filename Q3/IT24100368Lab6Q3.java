import java.util.Scanner;

public class IT24100368Lab6Q3
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number,count=0;
		double rms=0,sumofsquares=0;
		
		
		System.out.println("Enter positive integers(terminate input with -99): ");

		
		
		
		while(true)
		{
			System.out.print("Enter a number: ");
			number = input.nextInt();

			if ( number == -99) 
			{
				break;

			}
			else if(number > 0)
			{
				sumofsquares += number * number;
				count++ ;
			}
			else
			{
				System.out.println("Invalid input.Please enter a positive integer or -99 to terminate.");
			}
		}

		if (count > 0)
		{
			rms=Math.sqrt(sumofsquares / count);
			System.out.println("The Root Mean Square (RMS) is: " + rms);
		}
		else
		{
			System.out.println("No valid numbers entered.");
		}
	}
}