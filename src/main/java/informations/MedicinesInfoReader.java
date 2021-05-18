package informations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MedicinesInfoReader {

    public void readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println("");
    }
}
