package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	System.out.println("How much money do you start with?")	;
	int startAmount = in.nextInt();
	System.out.println("What's the probablility of winning?");
	double winChance = in.nextDouble();
	System.out.println("What is your win limit?");
	int winLimit = in.nextInt();
	System.out.println("How many days would you like to play?");
	int totalSimulations = in.nextInt();
for (int i = 0; i<totalSimulations;i++)
{ int daily = startAmount;
while ((daily>0) && (daily<winLimit))
{
	double rnd = Math.random();
	
	if (rnd<winChance)
	{
		
	daily= (daily-1); 
System.out.println("Win: Current money " + daily);
		
	}
	else 
	{
		daily = (daily+1);
		System.out.println("Loss: Current money " + daily);
	
	}
}

}
System.out.println("Days played: " + totalSimulations);

	
	}
}
		
		