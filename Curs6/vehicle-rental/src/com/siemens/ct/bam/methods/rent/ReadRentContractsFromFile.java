package com.siemens.ct.bam.methods.rent;

import com.siemens.ct.bam.models.Rent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadRentContractsFromFile {


    String FILE_NAME = "inchirieri.txt";
    List<Rent> contractsFromFile = new ArrayList<>();
    BufferedReader br;

    public List<Rent> getContractsFromFile() {
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            String lineFromFile;

            while ((lineFromFile = br.readLine()) != null) {
                String[] contractProperties = lineFromFile.split(",");
                Rent rent = new Rent(contractProperties[0].trim(), contractProperties[1].trim(), Integer.parseInt(contractProperties[2].trim()), contractProperties[3].trim(), contractProperties[4].trim());
                contractsFromFile.add(rent);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contractsFromFile;
    }

}
