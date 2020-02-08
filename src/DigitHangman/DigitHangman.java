package DigitHangman;

import Handler.IOHandler;

import java.util.ArrayList;

/**
 * A simplify version of hangman but digit.
 * User input set of 12 numbers as a problem number
 * then input number in one digit to guess
 * <p>
 * Created by Nonthakorn Sukprom, 8 February 2020
 */
public class DigitHangman {
    public static void main(String[] args) {
        //Input
        String numbersInput = IOHandler.getString("Enter problem numbers (12 numbers): ");
        String[] stringNumbers = (numbersInput.split(" "));
        // Check condition
        for (int i = 0; i < stringNumbers.length; i++) {
            int checkInt = Integer.parseInt(stringNumbers[i]);
            if (checkInt < 0 || checkInt > 9) {
                System.out.println("number in digit must be in between 0 - 9");
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
        if (stringNumbers.length != 12) {
            System.out.println(stringNumbers.length);
            System.out.println("Must input all 12 numbers");
            System.out.println("Exiting...");
            System.exit(0);
        }
        /* Add create digit objects and add to ArrayList*/
        ArrayList<Digit> digits = new ArrayList<Digit>();
        for (int i = 0; i < stringNumbers.length; i++) {
            digits.add(new Digit(stringNumbers[i]));
        }

        for (int i = 0; i < stringNumbers.length; i++) {
            System.out.print(digits.get(i).getNumber() + " ");
        }

        // Start Guessing
        System.out.println("Start guessing ");
        String WrongString = "";
        int score = 0;
        for (int i = 0; i < 5; i++) {
            String guessNumber = IOHandler.getString("Round: " + (i + 1));
            if (!IOHandler.checkNumeric(guessNumber)) {
                System.out.println("Input must be number");
                i--;
                continue;
            }
            boolean guessRight = false;
            for (int j = 0; j < digits.size(); j++) {
                // Guess right
                if (guessNumber.equals(digits.get(j).getNumber())) {
                    digits.get(j).Guessed();
                    //System.out.print("Right");
                    score++;
                    guessRight = true;
                }
                System.out.print(digits.get(j).showNumber() + " ");
            }
            if (!guessRight) {
                WrongString += (guessNumber + " ");
                System.out.println(WrongString);
            } else {
                System.out.println(WrongString);
            }
            System.out.println(score);
        }
    }
}
