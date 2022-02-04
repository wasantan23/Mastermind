# Mastermind

From Wikipedia: Mastermind or Master Mind is a code-breaking game for two players. The modern game with pegs was invented in 1970 by Mordecai Meirowitz, an Israeli postmaster and telecommunications expert.[1][2] It resembles an earlier pencil and paper game called Bulls and Cows that may date back a century or more.

# Red, Yellow, Orange, Green, Blue, Purple, White
# Scoring Black, White

Mastermind.  (Main.java class if using Repl.it but ok)
*Make a game class
**gives rules at beginning (could be a method call printRules() )
**Scanner class - input user prompts, etc
***would make calls to methods to guess position
***return for this? int[#cPcL][#cPwL]
**Instructions - capture instructions (for text file and UI)\
**?PvP = play1 choses secret code (swap places at keyboard)
***play2 - takes turn guessing
**?PvC	= play1 - computer randomizes colors and location of pins				
***play2 - takes turn guessing
		
*Make a board Class
**Pins - Encoding colors - do we use ints or chars?
**[R, G, Y, O]   [R, B, Y, G]  [2][1]
**[R, G, Y, O]   [R, O, Y, G]  [2][2]   
**int - translate btwn colors
**chars - individual letter

|  | PROS| CONS |
|Ints|-simple to code | -translate back and forth |
|   |		     |-might be confusing to player|
|chars| -less confusion for player | -a bit more code to learn |	 

*Arrays - 1-2D array for player guesses
	**1-1D array for the secret code
	
The process of Mastermind was super fun! I really enjoyed how we got to play the game first; it gave me a clearer understanding as to what I was supposed to do. Constructing the board was intresting because there were many different ways you could go about it. I did have a little issue where mt array list was not stacking on top of one another; however, I made a for each loop to fix this. My computerGuess method was not as hard to understand because I got to practice how to generate  random numbers in Bingo. I initally had the user guess method in my tester; however, I transferred this to my main Mastermind class. The tester class was just used to call on the different methods in my main Mastermind class. I did struggle a bit in figuring out how to place my black and white pins, but with help from my classmates, I managed to figure it out. I also learnt how to do java dox comments through this process. Overall, I really enjoyed this project. It has been one of my favorites so far. 
