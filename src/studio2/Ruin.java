package studio2;

public class Ruin {

	public static void main(String[] args) 
	{
		
		int startAmount = 500;
		int winLimit = 1000;
		boolean winChance = Math.random()>= 0.5;
		while (startAmount != 0 && startAmount < winLimit)
		{
			if (winChance == true)
			{
				startAmount ++;
			}
			else
				startAmount --;
		}
		if (startAmount == 0)
		{
			System.out.print("Ruin!");
		}
		else if (startAmount >= winLimit)
		System.out.print("Success!");

	}

}
