package SortingAcronyms;

import Handler.IOHandler;

import java.util.ArrayList;

/**
 *  A program that let user input names or words
 *  and abbreviate them then sort by length of the acronym first
 *  followed by alphabetic sort.
 *
 *  Created by Nonthakorn Sukprom, 7 February 2020
 */
public class AcronymSort {

    public static void main(String[] args) {
        while(true) {
            int number = IOHandler.getInteger("Enter number of names: ");
            if (number <= 0){
                System.out.println("Number must be more than 0!");
                continue;
            }
            //Enter names
            ArrayList<Name> names = new ArrayList<Name>();
            for (int i = 0 ; i < number ; i++){
                String newName = IOHandler.getString("Enter name #" + (i + 1) + ": ");
                names.add(new Name(newName));
            }
            /*sorting*/
            ArrayList<String> acronyms = new ArrayList<>();
            for (int i = 0 ; i < number ; i++) {
                acronyms.add(names.get(i).getAcronym());
            }
            acronyms.sort(new LengthComparator());
            for (int i = 0 ; i < number ; i++) {
                System.out.println(acronyms.get(i));
            }
            String exit = IOHandler.getString("Do you want to exit? (y/n): ");
            if (exit.startsWith("Y") || exit.startsWith("y")){
                System.out.println("Exit ... ");
                System.exit(0);
            }
        }
    }
}
