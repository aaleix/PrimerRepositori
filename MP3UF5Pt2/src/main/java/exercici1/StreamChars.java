package exercici1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamChars {
    public static void main(String[] args) throws IOException {
        FileReader fitxer=new FileReader("exemple.txt");
        int i;
        while ((i = fitxer.read()) != -1)

            System.out.print((char)i);

    }
}
