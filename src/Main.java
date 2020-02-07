import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean bContinue = true;
        while(bContinue) {
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
            System.out.println("\n"+ names.get(0).getAcronym());
            //abbreviation and sorting
            //Spilt word from one string

            /*System.out.println();
            for (int i = 0 ; i < number ; i++) {
                System.out.println(names.get(i));
            }
            String exit = IOHandler.getString("Do you want to exit? (y/n): ");
            if (exit.startsWith("Y") || exit.startsWith("y")){
                System.out.println("Exit ... ");
                System.exit(0);
            }*/
        }
    }
}
