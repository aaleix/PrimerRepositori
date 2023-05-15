package exercici3;
import java.io.*;
import java.util.Scanner;

public class EscriuStreamDades {

    public static void main(String[] args){
        Scanner ent=new Scanner(System.in);
        String nom;
        String cognom;
        int edad;
        double altura;
        try{
            FileOutputStream fitxerText=new FileOutputStream("dades.dat");
            DataOutputStream fitxer=new DataOutputStream(fitxerText);
            System.out.println("Posa nom");
            nom= ent.nextLine();
            fitxer.writeUTF(nom);
            System.out.println("Posa cognom");
            cognom= ent.nextLine();
            fitxer.writeUTF(cognom);
            System.out.println("Posa edad");
            edad= ent.nextInt();
            fitxer.writeInt(edad);
            System.out.println("Posa altura");
            altura= ent.nextDouble();
            fitxer.writeDouble(altura);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
