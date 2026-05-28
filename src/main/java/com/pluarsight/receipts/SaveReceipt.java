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
        // Create the directory if it doesn't exist
        if (!folder.exists()) {
            folder.mkdirs();
        }
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
            bw.write(String.format("Total: $%.2f", customerPurchase.getTotal()));
            bw.newLine();
            bw.write("-------------------");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.err.println("Failed to save receipt: " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
