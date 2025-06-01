﻿import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ImproperResourceReleaseExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        // Improper: Missing reader.close(), leading to a potential resource leak
    }
}