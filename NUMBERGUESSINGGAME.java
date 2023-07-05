/*
 * AUTHOR:MICHAEL JOSIL M
 * PURSPOSE:INTERNSHIP TASK AT INTERNPE
 * TITLE:NUMBER GUESSING GAME
 */

import java.util.Random;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class NUMBERGUESSINGGAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guessCount = 0;
        int guessesCount = 0;
        int score = 0;
        int score1 = 200;
        int score2 = 300;

        System.out.println("WELECOME TO ROUND ONE");

        System.out.println("Guess the secret number between 1 and 100");

        while (true) {
            int guess = scanner.nextInt();
            guessCount++;

            if (guess == secretNumber) {
                System.out.println(" CONGRADULATION YOU FOUND THE SECTRET NUMBER IN " + guessCount + " GUESSES");
                System.out.println("YOUR SCORE IS: " + score1);
                break;

            } else if (guess < secretNumber) {
                System.out.println("GIVEN NUMBER IS VERY LESS THAN SECRET NUMBER"
                        + "GUESS ANOTHER NUMBER LESS THAN SECRET NUMBER");
                score1 -= 15;
            } else {
                System.out.println(
                        "GIVEN NUMBER IS HIGHER THAN SECRET NUMBER" + "GUESS ANOTHER NUMBER HIGHER THAN SECRET NUMBER");
                score1 -= 15;
            }

            if (guessCount >= 10) {
                System.out.println("YOU REACHED THE MAXIMUM NUMBER OF GUSSES IN ROUND ONE" + "GAME OVER" + "TRY AGAIN");
                System.out.println("THE SECRET NUMBER IS: " + secretNumber);
                System.out.println("YOUR SCORE IS: 0");
                break;
            }
        }
        if (score1 > 100) {
            System.out.println("WELECOME TO ROUND TWO");
            System.out.println("Guess the secret number between 1 and 100");

            while (true) {
                int guesse = scanner.nextInt();
                guessesCount++;

                if (guesse == secretNumber) {
                    System.out.println(" CONGRADULATION YOU FOUND THE SECTRET NUMBER IN " + guessesCount + " GUESSES");
                    System.out.println("YOUR SCORE IS: " + score2);
                    break;

                } else if (guesse < secretNumber) {
                    System.out.println("GIVEN NUMBER IS VERY LESS THAN SECRET NUMBER"
                            + "GUESS ANOTHER NUMBER LESS THAN SECRET NUMBER");
                    score2 -= 25;
                } else {
                    System.out.println("GIVEN NUMBER IS HIGHER THAN SECRET NUMBER"
                            + "GUESS ANOTHER NUMBER HIGHER THAN SECRET NUMBER");
                    score2 -= 25;
                }

                if (guessesCount >= 6) {
                    System.out.println(
                            "YOU REACHED THE MAXIMUM NUMBER OF GUSSES IN ROUND TWO" + "GAME OVER" + "TRY AGAIN");
                    System.out.println("THE SECRET NUMBER IS: " + secretNumber);
                    System.out.println("YOUR SCORE IS: 0");
                    break;
                }
            }
        }

        else {
            System.out.println("You are not eligible for round TWO");
            System.out.println("your score for round one is:" + score1);
            System.exit(0);

        }
        System.out.println("your score for round one is:" + score1);

        System.out.println("your score for round two is:" + score2);

        score = score1 + score2;

        System.out.println("YOUR TOATAL SCORE IS:" + score);

        if (score > 380) {
            System.out.println(" CONGRADULATION " + " YOU WON " + " GOLD TROPHY ");
            System.out.println("      _____     ");
            System.out.println("    _|___|_    ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |_______|   ");

            System.out.println("       ||       ");
            System.out.println("       ||       ");

            System.out.println("   __________  ");
            System.out.println("  |__________| ");
        } else if (score > 280 && score <= 380) {
            System.out.println(" CONGRADULATION " + " YOU WON " + " SILVER TROPHY ");
        } else if (score > 200 && score <= 280) {
            System.out.println(" CONGRADULATION " + " YOU WON " + " BRONZE TROPHY ");
        } else {
            System.out.println("BETTER LUCK NEXT TIME");
        }

    }
}
/*
 * TRY YOUR BEST
 * MAXIMUM PLAYERS CAN'T EVEN ACHIEVE BRONZE TROPHY
 */