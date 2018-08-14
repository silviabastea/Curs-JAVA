package com.siemens.ct.bam.methods.user;

import com.siemens.ct.bam.models.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadUsersFromFile {
    String FILE_NAME = "persoane.txt";
    String dateOfBirth ="";
    List<User> usersFromFile = new ArrayList<>();
    BufferedReader br;

    public List<User> getUsersFromFile() {
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            String lineFromFile;

            while ((lineFromFile = br.readLine()) != null) {
                String[] userProperties = lineFromFile.split(",");
                for(int index = 1; index < 7 ; index ++)
                dateOfBirth = dateOfBirth + userProperties[0].charAt(index);
                User user = new User(userProperties[0].trim(), userProperties[1].trim() , userProperties[2].trim(), userProperties[0].substring(1,7),  userProperties[3].trim(), Integer.parseInt(userProperties[4].trim()));
                usersFromFile.add(user);
                dateOfBirth = "";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usersFromFile;
    }
}
