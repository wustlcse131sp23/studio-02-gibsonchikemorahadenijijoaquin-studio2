package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	
		System.out.println("How many days would you like to simulate? ");
		int days = in.nextInt();
		
		
		
		
		int winLimit = 10;
		
		 for (int i = 1; i <= days; i ++)
		 {
			 int startAmount = 5;
			 int loopCount = 0; 
			 
		while (startAmount != 0 && startAmount < winLimit)
		{
			boolean winChance = Math.random()>= .5;
			
			if (winChance == true)
			{
				startAmount ++;
			}
			else
				startAmount --;
		loopCount ++;
		}
		
		if (startAmount == 0)
		{
			System.out.println(loopCount + ": Ruin! Day: " + i);
		}
		else if (startAmount >= winLimit)
		{
			System.out.println(loopCount + ": Success! Day: " + i);
		}
		

		 }
	}
}

