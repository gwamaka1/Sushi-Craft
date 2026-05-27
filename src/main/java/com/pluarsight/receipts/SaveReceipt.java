package com.pluarsight.receipts;

import com.pluarsight.models.CustomerPurchase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveReceipt {
    public void save(CustomerPurchase customerPurchase) {
        String folderPath = "C:\\Users\\mwamt\\pluarsight\\java-dev\\capstone\\Sushi-Craft\\reciepts";
        File folder = new File(folderPath);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String out= now.format(ft) + ".txt";
        File recieptFile = new File(folder,out);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(recieptFile));
            bw.write("SUSHI CRAFT RECEIPT");
            bw.newLine();
            bw.write("-------------------");
            bw.newLine();
            bw.write(customerPurchase.getDetails());
            bw.newLine();
            bw.write("-------------------");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
