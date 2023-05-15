package exercici3;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LligStreamDades {
    public static void main(String[] args) throws IOException {
        DataInputStream llegir=new DataInputStream(new FileInputStream("dades.dat"));
        String nom= llegir.readUTF();
        String cognom= llegir.readUTF();
        int edad=llegir.readInt();
        double altura=llegir.readDouble();

        System.out.println(nom+" "+cognom+" "+edad+" "+altura);
    }
}
