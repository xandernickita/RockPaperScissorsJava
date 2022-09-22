package lab2;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

        System.out.println("Game Begins: Please make your move! If you wish to end the game, please type 'quit'");
        String playerMove = in.nextLine();

        if (playerMove.equalsIgnoreCase("quit")) {
            break;
        }

            if(!playerMove.equalsIgnoreCase("rock") && !playerMove.equalsIgnoreCase("paper")
                    && !playerMove.equalsIgnoreCase("scissors") && !playerMove.equalsIgnoreCase("lizard")
                    && !playerMove.equals("spock")) {
                System.out.println("Invalid Input! Try again, please.");
            }
            else {
                int randomNumber = (int) Math.random() * 5;
                String computerMove = "";

                if (randomNumber == 0) {
                    computerMove = "rock";
                }
                else if (randomNumber == 1) {
                    computerMove = "paper";
                }
                else if (randomNumber == 2) {
                    computerMove = "scissors";
                }
                else if (randomNumber == 3) {
                    computerMove = "lizard";
                }
                else {
                    computerMove = "spock";
                }
                System.out.println("Opponent's move: " + computerMove);

                if (playerMove.equals(computerMove)) {
                    System.out.println("It's a draw!");
                }
                else if ((playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors"))
                        || (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper"))
                        || (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock"))
                        || (playerMove.equalsIgnoreCase("spock") && computerMove.equalsIgnoreCase("scissors"))
                        || (playerMove.equalsIgnoreCase("spock") && computerMove.equalsIgnoreCase("rock"))
                        || (playerMove.equalsIgnoreCase("lizard") && computerMove.equalsIgnoreCase("spock"))
                        || (playerMove.equalsIgnoreCase("lizard") && computerMove.equalsIgnoreCase("paper"))) {
                    System.out.println("You Win!! :)");
                }
                else {
                    System.out.println("You lost! :(");
                }
            }

        }

        System.out.println("Session Ended.");

    }
}