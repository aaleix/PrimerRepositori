package exercici2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Linies {
    public static void main(String[] args) throws Exception {
        FileInputStream fitxer=new FileInputStream("fitxer1.txt");
        FileInputStream fitxer2=new FileInputStream("fitxer2.txt");
        FileOutputStream sortida=new FileOutputStream("fusionats.txt");

        int i;
        while ((i = fitxer.read()) != -1)

            sortida.write(i);

        int c;
        while ((c=fitxer2.read()) != -1)

            sortida.write(c);

        if (fitxer!=null && fitxer2!=null){
            fitxer.close();
            fitxer2.close();
        }
        if (sortida!=null){
            sortida.close();
        }
        FileReader llegir=new FileReader("fusionats.txt");
        int a;
        while ((a = llegir.read()) != -1)

            System.out.print((char)a);

    }
    }


