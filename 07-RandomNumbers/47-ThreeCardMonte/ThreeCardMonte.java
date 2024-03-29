/*
 * This is essentially the "choose which of the three cups has a ball under it" sort of game, which is essentially just a number
 * guessing game with some fancy graphics.
 */

import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
  public static void main (String args[]) {

    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    int numGuess, numSecret;

    // secret number calculative
    numSecret = 1 + rand.nextInt(3); // 1-3

    // user prompt
    System.out.println("You slide up to Fast Eddie's cup table and plop down your cash." +
    "\nHe glances at you out of the corner of his eye and starts shuffling." +
    "\nHe lays down three cups." +
    "\nOne Ball. Three cups. One Guess. One Chance.");

    System.out.println("Which cup has the ball under it?\n");
    System.out.println("\t###\t###\t###");
    System.out.println("\t###\t###\t###");
    System.out.println("\t###\t###\t###");
    System.out.println("\t 1 \t 2 \t 3 ");
    System.out.println("");
    System.out.print("> ");
    numGuess = kb.nextInt();
    kb.close();

    // exit prompt
    if (numGuess == numSecret) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
    } else {
      System.out.println("Ha! Fast Eddie wins again! The ace was card number " + numSecret + ".");
    }

  }
}