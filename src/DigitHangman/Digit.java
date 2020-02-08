package DigitHangman;

/**
 * Class represents each digit of user input
 * hold number of each digit and
 * boolean indicated that the number is already been guessed or not.
 * Created by Nonthakorn Sukprom, 8 February 2020
 */
public class Digit {
    /**
     * Number of this digit
     */
    private String number;
    /**
     * boolean to hold that this digit is already guessed
     */
    private boolean isGuessed = false;

    /**
     * Constructor method, assign input to "number"
     *
     * @param number input number
     */
    public Digit(String number) {
        this.number = number;
    }

    public void Guessed() {
        isGuessed = true;
    }

    /**
     * Getter method, return number of this digit if "isGuessed" is true
     * if not return "_"
     *
     * @return Number of this digit or under scroll
     */
    public String showNumber() {
        if (isGuessed) {
            return number;
        } else {
            return "_";
        }
    }

    /**
     * Getter method, returb number of this digit no matter what.
     *
     * @return Number of this digit or under scroll
     */
    public String getNumber() {
        return number;
    }
}
