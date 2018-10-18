import Yahtzee.*;
import java.util.Scanner;

public class PlayYahtzee{
	public static void main (String[] args){
		Yahtzee player1 = new Yahtzee();
		Yahtzee player2 = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char cont = 'y';
		char inputAct = 'g';
		while(cont != 'q'){
		System.out.println("                            ");
		System.out.println("****************************");
		System.out.println("What action would you like to take?");
		System.out.println("a) - Roll for player 1.");
		System.out.println("b) - Roll for player 2.");
		System.out.println("c) - Cheat.");
		System.out.println("d) - Quiz");
		System.out.println("*****************************");
		System.out.println("                            ");
		System.out.print("Choose an option: \n");
		inputAct = iDevice.next().charAt(0);
		try{
			switch (inputAct) {
			case 'a': 
			case 'A': 
				System.out.println("Player 1 rolled a:");
				System.out.println("     " + player1.toss());
				break;
					
			case 'b':	
			case 'B':	
				System.out.println("Player 2 rolled a:");
				System.out.println("     " + player2.toss());
				break;
					
			case 'c': 
			case 'C': 
				System.out.println("Player 1 rolled a " + player1.tossCheat());
				break;
					
			case 'd':	
			case 'D':	
				cont = 'q';
				break;
			default:
				System.out.println("Not a valid option.. try again");
				}
			iDevice.nextLine();
			}
			catch(CheatException ex){
					System.out.println("SHAME ON PLAYER 1!!!");
					// cont = 'q';
			}

		}
	System.out.println("Goodbye!");
	}
}

