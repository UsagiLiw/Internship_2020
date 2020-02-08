package Handler;

import java.util.Scanner;

/**
 * This class provides method of receive input from terminal from user.
 *
 *  Created by Nonthakorn Sukprom, 5 February 2020
 *  Used for The internship 2020 test assignment.
 */
public class IOHandler {
    /**
     * Scanner object for handling input.
     */
    private static Scanner scn = new Scanner(System.in);

    /**
     * Asks for a string and returns to the caller.
     * @param prompt    String to print, asking for input.
     * @return          the string user entered.
     */
    public static String getString (String prompt){
        System.out.println(prompt);
        String value = scn.nextLine();
        return value;
    }

    /**
     * Asks for a integer and returns to the caller.
     * @param prompt    String to print, asking for input.
     * @return          the integer user entered.
     */
    public static int getInteger (String prompt){
        System.out.println(prompt);
        int value = scn.nextInt();
        /*Fix the problem that the terminal's cursor does not move to the next line after read input*/
        scn.nextLine();
        return value;
    }

    /**
     * Asks for a double and returns to the caller.
     * @param prompt    String to print, asking for input.
     * @return the double user entered.
     */
    public static double getDouble(String prompt) {
        System.out.println(prompt);
        double value = scn.nextDouble();
        /*Fix the problem that the terminal's cursor does not move to the next line after read input*/
        scn.nextLine();
        return value;
    }

    public static boolean checkNumeric(String string) {
        boolean isNumeric = true;
        try {
            int num = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            isNumeric = false;
        }
        return isNumeric;
    }
}
