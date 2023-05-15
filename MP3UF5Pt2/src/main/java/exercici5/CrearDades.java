package exercici5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CrearDades {
    public static void main(String[] args) throws IOException {
        Scanner ent=new Scanner(System.in);
        int numero;
        boolean opcio=true;
        RandomAccessFile fitxerRandom=new RandomAccessFile("aleatori.dat","rw");
        while (true) {
            System.out.println("Introdueix valor:");
            numero= ent.nextInt();
            fitxerRandom.writeInt(numero);
            System.out.println("Vols més valors?");
            opcio=ent.nextBoolean();
            if (opcio==false)break;
        }
    }
}
