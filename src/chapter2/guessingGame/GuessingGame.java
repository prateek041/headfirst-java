package chapter2.guessingGame;

public class GuessingGame {
    // they will hold the state of the current game.
    Player p1;
    Player p2;
    Player p3;

    // This method totally manages the game.
    void startGame(){
        // Creating instances of the players.
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // This will hold the guesses made by the players in the game
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean isP1Right = false;
        boolean isP2Right = false;
        boolean isP3Right = false;

        // Generating the random number to be guessed by the players.
        int targetRandomNumber = (int)(Math.random()*10);
        System.out.println("I am guessing a number between 0 to 9 ...");

        while (true){
            System.out.println("The number guessed by the system is " + targetRandomNumber);

            // Make the players guess a number
            p1.guess();
            p2.guess();
            p3.guess();

            // get the number guessed by the players.
            guessP1 = p1.number;
            guessP2 = p2.number;
            guessP3 = p3.number;

            // Check which player guessed the right number.
            if(guessP1 == targetRandomNumber){
                isP1Right = true;
            }
            if(guessP2 == targetRandomNumber){
                isP2Right = true;
            }
            if(guessP3 == targetRandomNumber){
                isP3Right = true;
            }

            // if any one of the players is right, stop the game.
            if (isP1Right || isP2Right || isP3Right){
                System.out.println("We have a winner");
                System.out.println("Player one got it right ?" + isP1Right);
                System.out.println("Player one got it right ?" + isP1Right);
                System.out.println("Player one got it right ?" + isP1Right);
                System.out.println("Game is Over");
                break;
            } else {
                System.out.println("Player will have to try again");
            }
        }
    }
}
