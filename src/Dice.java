import java.util.Random;
import java.util.Scanner;

public class Dice 
{

	public static void main(String[] args) 
	{
		//Declaration
		int roll ;
		int guess;
		Random rand = new Random ();
		Scanner scan = new Scanner(System.in);
	
		//Guess the roll
		System.out.print(" Please make a guess on the dice roll ");
		guess = scan.nextInt();
		System.out.println( " Your guess was " + guess);
		
		//Dice roll
		roll = rand.nextInt(6) + 1;
		System.out.println(" The dice roll was " + roll);
		
		//Win or lose
		if ( guess == roll ) {
			System.out.println( "You rock");
		}
		else {
			System.out.println(" You can try again");
			return;
		}
	
	}

}
