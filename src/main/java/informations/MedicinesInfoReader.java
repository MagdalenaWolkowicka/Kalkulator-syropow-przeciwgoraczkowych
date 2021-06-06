package informations;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class MedicinesInfoReader {

    public void readFile(String fileName) {
        try {
            File file = getFileFromResource(fileName);
            if (file != null) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                System.out.println("");
            }
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }
}