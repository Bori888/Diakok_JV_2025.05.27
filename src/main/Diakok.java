
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Diakok {

  
    public static void main(String[] args) {
        try {
            String sor = Files.readString(Path.of("diakok.csv"));
            System.out.println("beolvasott fájl tartralma:\n" + sor);
        } catch (IOException ex) {
        }
    }
    
}
