package com.siemens.ct.bam.methods;

import com.siemens.ct.bam.exceptions.RegisterExceptions;
import com.siemens.ct.bam.objects.User;

import java.util.HashMap;

public class UserMethods {

    public HashMap<String, User> registerUserMap = new HashMap<>();


    public void registerUser(User newUser) throws RegisterExceptions {
        if (registerUserMap.containsKey(newUser.getPersonalCode())) {
            String errorMessage = "The user with personal code " + newUser.getPersonalCode() + " already exists.";
            throw new RegisterExceptions(errorMessage);
        }
        registerUserMap.put(newUser.getPersonalCode(), newUser);
    }
}
