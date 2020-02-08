package FloatingPrime;

import Handler.IOHandler;

import static java.lang.Math.pow;

/**
 * Program to find if input number is floating prime or not
 *  Created by Nonthakorn Sukprom, 7 February 2020
 */
public class FloatingPrime {
    public static void main(String[] args) {
        while (true) {
            double number = IOHandler.getDouble("Input the number: ");
            /*Condition Check*/
            if (number == 0){
                break;
            }
            if (number < 1.0 || number > 10.0) {
                System.out.println("Number must be in between 1 - 10!");
                continue;
            }
            String str = String.valueOf(number);
            int charCount = str.length();
            if (charCount > 12) {
                System.out.println("Number's length must not exceed 12 positions");
                continue;
            }
            boolean isPrime = false;
            for (int i = 0; i < 4; i++) {
                int checkNumber = (int) (number * (pow(10, i)));
                if (checkPrime(checkNumber)) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }

    /**
     * Method for check if the number is prime or not
     *
     * @param number number to check prime
     * @return true if prime , false if not prime
     */
    private static boolean checkPrime(int number) {
        // Any number should not be divisible to the target except the target itself
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}