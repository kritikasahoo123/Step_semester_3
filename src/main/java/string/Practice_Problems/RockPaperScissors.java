package main.java.string.Practice_Problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        RockPaperScissors game = new RockPaperScissors();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        int rounds = 5;

        System.out.println("Round | Player Move | Computer Move | Result");

        for (int i = 1; i <= rounds; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = scanner.nextLine();

            int randomIndex = random.nextInt(3);
            String computerMove = moves[randomIndex];

            String result = game.playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println(
                i + " | " + playerMove + " | "
                + computerMove + " | " + result
            );
        }

        double winPercentage = ((double) wins / rounds) * 100;

        System.out.println("\nFinal Summary");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        scanner.close();
    }
}