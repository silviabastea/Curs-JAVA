package conditions;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {



    public static void getNumber(){

        int numberTyped;
        int randomNumber = new Random().nextInt(11);
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number between 0 and 10.");

        do {
             numberTyped = reader.nextInt();
            if(randomNumber == numberTyped) System.out.println("Your good guesser.");
            else
                System.out.println("You're guess :" + numberTyped + ". That's incorrect." + "Type a number between 0 and 10.");
        }while(randomNumber != numberTyped);




    }
}
