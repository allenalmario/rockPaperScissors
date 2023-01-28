package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean resumeGame = true;
        int userPoints = 0;
        int computerPoints = 0;
        String choices[] = {"rock", "paper", "scissors"};

        while (resumeGame) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("");
            System.out.println("Type 'r' for Rock, 'p' for Paper, or 's' for Scissors. Type 'q' for Quit when done: ");

            String choice = myObj.nextLine().toLowerCase();

            Random generator = new Random();
            int randomIndex = generator.nextInt(choices.length);

            String computerChoice = choices[randomIndex];

            if (choice.equals("q")) {
                break;
            }
            else if (choice.equals("r")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("Tie");
                }
                else if (computerChoice.equals("scissors")) {
                    userPoints += 1;
                    System.out.println("You win, one point for you!");
                }
                else if (computerChoice.equals("paper")) {
                    computerPoints += 1;
                    System.out.println("You lose, one point for computer!");
                }
            }
            else if (choice.equals("p")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("Tie");
                }
                else if (computerChoice.equals("scissors")) {
                    computerPoints += 1;
                    System.out.println("You lose, one point for computer!");
                }
                else if (computerChoice.equals("rock")) {
                    userPoints += 1;
                    System.out.println("You win, one point for you!");
                }
            }
            else if (choice.equals("s")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("Tie");
                }
                else if (computerChoice.equals("rock")) {
                    computerPoints += 1;
                    System.out.println("You lose, one point for computer!");
                }
                else if (computerChoice.equals("paper")) {
                    userPoints += 1;
                    System.out.println("You win, one point for you!");
                }
            }
            else {
                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("Sorry, didn't get that... Make sure you spelled your choice right!");
            }
        }

        if (userPoints > computerPoints) {
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("You win! You: " + userPoints + " | Computer Points: " + computerPoints);
        }
        else if (userPoints == computerPoints) {
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("TIE! You: " + userPoints + " | Computer Points: " + computerPoints);
        }
        else {
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("You lose! Computer wins! You: " + userPoints + " | Computer Points: " + computerPoints);
        }
    }
}