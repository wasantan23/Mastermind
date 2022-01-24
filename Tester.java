import java.util.Scanner; //imports scanner

public class Tester {
public static void main (String [] args) {

Mastermind m1 = new Mastermind(); // makes the instance of mastermind

System.out.println(" Welcome to the Mastermind game! \n In this game, you are going to guess the color of the hidden pegs that \n the computer has placed. \n There are NO repeats in this game");

m1.buildBoard(); //calls the build board

m1.printBoard(); //calls the print board


//make an array list 
//you don't need to do 4
char [] guess = new char [4]; //there are 4 positions
Scanner scan = new Scanner (System.in);  //takes guess

for(int x = 0; x < 4; x ++) { //for loop for guesses
	System.out.println(" Take your guess. B for blue, Y for yellow, P for purple and R for red. ");
	guess[x] =scan.next().charAt(0);
}
m1.addGuess(guess);
m1.printBoard();

}
}



