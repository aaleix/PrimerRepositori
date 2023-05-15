package exercici1;

import java.io.FileInputStream;
import java.io.IOException;


public class StreamBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fitxer=new FileInputStream("exemple.txt");
        int i;
        while ((i = fitxer.read()) != -1)

            System.out.print((char)i);

    }
}
