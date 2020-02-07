import java.util.ArrayList;

import static java.lang.Character.*;

/**
 *  Class that hold the string input as an object
 *  Able to split and abbreviate the string
 *
 *  Created by Nonthakorn Sukprom, 7 February 2020
 */
public class Name {
    /** String to be abbreviate*/
    private String string;

    /** String to hold the acronym of the input name*/
    private String acronym = "";

    /** List of words in single String input*/
    private ArrayList<String> wordsList = new ArrayList<String>();

    /**
     * Constructor method, receive string input
     * then split and abbreviate it
     * @param name      a string inputted by user
     */
    public Name (String name){
        string = name;
        split();
        Abbreviate();
    }

    /**
     * Method used for split input string into words (delimited by "space bar")
     * then add each word in to arrayList
     */
    private void split (){
        String[] words = string.split(" ");
        for (int i = 0 ; i < words.length ; i++){
            wordsList.add(words[i]);
        }
    }

    /**
     * Method used for abbreviate words
     * if first character of the words is capitalize then abbreviate it
     * if not don't.
     */
    private void Abbreviate() {
        // TO DO: Create condition (Capitalize or not, Alphabetic or not)
        for (int i = 0; i < wordsList.size(); i++) {
            String word = wordsList.get(i);
            char firstChar = word.charAt(0);
            if (isLetter(firstChar)) {
                if (isUpperCase(firstChar)) {
                    acronym += firstChar;
                }
            }
        }
    }

    /**
     * Getter method, returning acronym to caller
     * @return      Acronym of input string
     */
    public String getAcronym (){
        return acronym;
    }
}
