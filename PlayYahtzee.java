import Yahtzee.*;
import java.util.Scanner;

public class PlayYahtzee{
	public static void main (String[] args){
		Yahtzee game = new Yahtzee();
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
		switch (inputAct) {
		case 'a': 
		case 'A': 
			System.out.println("Player 1 rolled a:");
			System.out.println("     " + game.toss());
			break;
				
		case 'b':	
		case 'B':	
			System.out.println("Player 2 rolled a:");
			System.out.println("     " + game.toss());
			break;
				
		case 'c': 
		case 'C': 
			System.out.println("Player 1 WINS!");
			break;
				
		case 'd':	
		case 'D':	
			cont = 'q';
			break;
		}
		iDevice.nextLine();
		

		}
	}
}

