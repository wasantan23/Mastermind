import java.util.Scanner;

public class Tester {
public static void main (String [] args) {

Mastermind m1 = new Mastermind();

m1.printBoard();

m1.buildBoard();

//make an array list 
//you don't need to do 4
char [] guess = new char [2];
Scanner scan = new Scanner (System.in); 

for(int x = 0; x < 4; x ++) {
	System.out.println("Take your guess!");
guess[x] =scan.next().charAt(0);
}
}
}


