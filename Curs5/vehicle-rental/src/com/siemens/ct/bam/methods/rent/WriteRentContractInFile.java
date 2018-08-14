package com.siemens.ct.bam.methods.rent;

import com.siemens.ct.bam.models.Rent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteRentContractInFile {

    File FILE_NAME = new File("inchirieri.txt");
    BufferedWriter bw;

    public void writeContractInFile(Rent contractToRegistry){
        try{
            bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.append(contractToRegistry.toString());
            bw.append("\n");
            bw.close();
        }catch(IOException e)
        {e.printStackTrace();}

    }


}
