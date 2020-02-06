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
            ArrayList<String> name = new ArrayList<String>();
            for (int i = 0 ; i < number ; i++){
                String newName = IOHandler.getString("Enter name #" + (i + 1) + ": ");
                name.add(newName);
            }
            //abbreviation and sorting
            //Spilt word from one string
            for (int i = 0; i < name.size(); i++) {
                String[] words = name.get(i).split(" ");

            }
            System.out.println();
            for (int i = 0 ; i < number ; i++) {
                System.out.println(name.get(i));
            }
            String exit = IOHandler.getString("Do you want to exit? (y/n): ");
            if (exit.startsWith("Y") || exit.startsWith("y")){
                System.out.println("Exit ... ");
                System.exit(0);
            }
        }
    }
}
