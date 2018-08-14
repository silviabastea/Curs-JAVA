package com.siemens.ct.bam.main;

import com.siemens.ct.bam.methods.user.ReadUsersFromFile;
import com.siemens.ct.bam.methods.user.UserMethods;
import com.siemens.ct.bam.methods.rent.WriteRentContractInFile;
import com.siemens.ct.bam.models.Rent;
import com.siemens.ct.bam.models.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReadUsersFromFile readerFromFile = new ReadUsersFromFile();
        UserMethods userMethods = new UserMethods();
        Integer number = 0;

        for(User user : readerFromFile.getUsersFromFile())
        if (userMethods.hasDrivingLicenceBefore18(user))
            number++;

        System.out.println(number + " people has driving licence before eighteen." );


        Scanner readerFromKeyboard = new Scanner(System.in);
        Rent rent = new Rent();

        System.out.println("Personal code: ");
        rent.setPersonalCode(readerFromKeyboard.nextLine());

        System.out.println("Start date : ");
        rent.setStartDate(readerFromKeyboard.nextLine());

        System.out.println("End date: ");
        rent.setEndDate(readerFromKeyboard.nextLine());

        System.out.println("Car number: ");
        rent.setCarNumber(readerFromKeyboard.nextLine());

        System.out.println("Number of kilometers: ");
        rent.setNumberOfKilometers(readerFromKeyboard.nextLong());

        WriteRentContractInFile writer = new WriteRentContractInFile();
        writer.writeContractInFile(rent);

    }


}
