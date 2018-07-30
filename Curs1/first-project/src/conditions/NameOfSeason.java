package conditions;

import java.util.Scanner;

public class NameOfSeason {

    public static void getSeason() {
        int month;

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the current month: ");
        month = reader.nextInt();

        if( month <1 || month > 12) System.out.println("Incorrect");
        if (month < 3 || month > 10) System.out.println("Is winter.");
        else if (month > 2 || month < 6) System.out.println("Is spring");
        else if (month > 5 || month < 9) System.out.println("Is summer.");
        else if (month > 8 || month < 11) System.out.println("Is autumn");

    }
}
