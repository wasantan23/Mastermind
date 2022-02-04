//Tanisha Wasan 
//import java.util.Scanner;

public class Tester {
	
	public static void main (String [] args) {

	Mastermind m1 = new Mastermind(); //creating a new instance of mastermind

	//lines 11-17 are displaying the rules
	System.out.println("   Welcome to the Mastermind game!");
	System.out.println("   In this game, you are going to guess the colors of the hidden pegs that \n   the computer has placed.");
	System.out.println("   The computer is going to generate four secret pins, which you won't know \n   the color of.");
	System.out.println("   If you get the position and colour right, you will get a black pin.");
	System.out.println("   If you get the color but not the position right, you will get a white pin.");
	System.out.println("   You will be instructed later on as to what the different colors are. There \n   are NO repeats in this game");
	System.out.println("   Good luck!");

	m1.buildBoard(); //calling on the buildBoard method

	m1.printBoard(); //calling on the printBoard method


	//make an array list 
	//you don't need to do 4
	/*char [] guess = new char [4];
	Scanner scan = new Scanner (System.in); 

	for(int x = 0; x < 4; x ++) {
		System.out.println(" Take your guess. B for blue, Y for yellow, P for purple, R for red, O for orange and G for green. ");
		guess[x] =scan.next().charAt(0);
	}
	*/

	//m1.addGuess(guess);

	m1.computerGuess(); //calling on the computerGuess method
	m1.userGuess(); //calling on the userGuess method

	}
}



