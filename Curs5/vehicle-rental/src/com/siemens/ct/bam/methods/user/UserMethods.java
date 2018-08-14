package com.siemens.ct.bam.methods.user;

import com.siemens.ct.bam.methods.user.ReadUsersFromFile;
import com.siemens.ct.bam.models.User;

import java.util.List;

public class UserMethods {

    ReadUsersFromFile reader = new ReadUsersFromFile();

   public List<User> getAllUsers(){return reader.getUsersFromFile();}

   public boolean hasDrivingLicenceBefore18(User userToVerify)
   {
      String dateOfBirth = userToVerify.getDateOfBirth();
      Integer yearOfBirth = Integer.parseInt(dateOfBirth)/10000;
      if(yearOfBirth > 18) yearOfBirth = 19*100 + yearOfBirth;
      else
          yearOfBirth = 20*100 + yearOfBirth;
            if(userToVerify.getEmittedYearOfDrivingLicense() - yearOfBirth >= 18)
                return false;
       return true;
   }
}
