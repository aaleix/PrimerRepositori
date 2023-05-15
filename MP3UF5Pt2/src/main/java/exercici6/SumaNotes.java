package exercici6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaNotes{
    public static int totNotes() throws FileNotFoundException {
        int persones=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            ent.next();
            persones++;
        }
        ent.close();
        return persones;
    }
    public static int percentatgeAprovats() throws FileNotFoundException {
        int persones=0;
        int aprovats=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            int notes=ent.nextInt();
            persones++;
            if (notes>=5)aprovats++;
        }
        ent.close();

        return aprovats*100/persones;
    }
    public static int percentatgeSuspesos() throws FileNotFoundException {
        int persones=0;
        int suspesos=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            int notes=ent.nextInt();
            persones++;
            if (notes<5)suspesos++;
        }
        ent.close();

        return suspesos*100/persones;


    }
    public static int nombre10() throws FileNotFoundException {
        int nombre10=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            int notes=ent.nextInt();
            if (notes == 10)nombre10++;
        }
        ent.close();

        return nombre10;

    }
    public static int nombre0() throws FileNotFoundException {
        int nombre0=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            int notes=ent.nextInt();
            if (notes == 0)nombre0++;
        }
        ent.close();

        return nombre0;
    }
    public static double mitjaGrup() throws FileNotFoundException {
        int persones=0;
        double sumaNotes=0;
        Scanner ent=new Scanner(new File("notes1.txt"));
        ent.useDelimiter(" - ");
        while (ent.hasNextInt()){
            int notes=ent.nextInt();
            sumaNotes=sumaNotes+notes;
            persones++;

        }
        ent.close();

        return sumaNotes/persones;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Total d'alumnes: "+totNotes());
        System.out.println("Percentatge d'aprovats: "+percentatgeAprovats());
        System.out.println("Percentatge de suspesos: "+percentatgeSuspesos());
        System.out.println("Total de deus: "+nombre10());
        System.out.println("Total de zeros: "+nombre0());
        System.out.println("Nota mitja: "+mitjaGrup());
    }
}
