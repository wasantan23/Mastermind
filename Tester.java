//Tanisha Wasan 
//import java.util.Scanner;

public class Tester {
public static void main (String [] args) {

Mastermind m1 = new Mastermind();

System.out.println(" Welcome to the Mastermind game! \n In this game, you are going to guess the color of the hidden pegs that \n the computer has placed. \n There are NO repeats in this game");

m1.buildBoard();

m1.printBoard();


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

m1.computerGuess();
m1.userGuess();

}
}



