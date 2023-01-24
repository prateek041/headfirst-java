package chapter2.guessingGame;

public class Player {
    int number = 0; // this is the number guessed by the player.

    // this method is going to be used to guess a number
    void guess(){
        number = (int)(Math.random()*10); // guessing a number between 0 and 9.
        System.out.println("Player 1 is guessing "+number);
    }
}
