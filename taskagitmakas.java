/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class taskagitmakas {
     private int score = 0;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void oyna() {

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[random.nextInt(rps.length)];

        System.out.println("make a move(r,p,s): ");
        String playerMove = scanner.nextLine();

        int score = 0;

        switch (playerMove) {
            case "r":
                if (computerMove.equals("r")) {
                    System.out.println("draw!");
                    System.out.println("computer's move was " + computerMove);

                } else if (computerMove.equals("p")) {
                    System.out.println("lost!");
                    System.out.println("computer's move was " + computerMove);
                    scoreDown();

                } else {
                    System.out.println("win!");
                    System.out.println("computer's move was " + computerMove);
                    scoreUp();

                }
                break;
            case "p":
                if (computerMove.equals("p")) {
                    System.out.println("draw!");
                    System.out.println("computer's move was " + computerMove);

                } else if (computerMove.equals("s")) {
                    System.out.println("lost!");
                    System.out.println("computer's move was " + computerMove);
                    scoreDown();

                } else {
                    System.out.println("win!");
                    System.out.println("computer's move was " + computerMove);
                    scoreUp();
                }
                break;
            case "s":
                if (computerMove.equals("s")) {
                    System.out.println("draw!");
                    System.out.println("computer's move was " + computerMove);

                } else if (computerMove.equals("r")) {
                    System.out.println("lost!");
                    System.out.println("computer's move was " + computerMove);
                    scoreDown();
                } else {
                    System.out.println("win!");
                    System.out.println("computer's move was " + computerMove);
                    scoreUp();
                }
                break;
            default:
                System.out.println("unvalid move...");
                break;
        }

    }

    public int scoreUp() {
        return score++;

    }

    public int scoreDown() {
        return score--;
    }

    public void showScore() {
        System.out.println("total score: " + score);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to the rps game...");

        System.out.println("how many rounds do you want to play?: ");
        int roundNumber = scanner.nextInt();

        taskagitmakas rps = new taskagitmakas();

        for (int i = 0; i < roundNumber; i++) {
            rps.oyna();
            rps.showScore();
        }
        System.out.println("the game has ended...");

    }

    
}
