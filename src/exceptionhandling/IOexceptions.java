package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IOexceptions {
	public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}