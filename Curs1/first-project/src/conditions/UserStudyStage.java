package conditions;

import java.util.Scanner;

public class UserStudyStage {

    public static void getStage() {
        int age;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your age: ");
        age = reader.nextInt();


        if (age < 5) System.out.println("You are in kindergarten.");
        else if (age < 10) System.out.println("You are in elementary school");
        else if (age < 13) System.out.println("You are in middle school");
        else if (age < 18) System.out.println("You are in high school");
        else
            System.out.println("You should be in collage");
    }
}

