package exercici5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AccesAleatori {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        try {
            RandomAccessFile fitxerRandom=new RandomAccessFile("aleatori.dat","r");
            System.out.println("Quin número vols consultar?");
            int num= ent.nextInt();
            long pos=(num-1)*32;
            fitxerRandom.seek(pos);
            int numeroBusca=fitxerRandom.readInt();
            System.out.println(numeroBusca);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
