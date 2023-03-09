package Exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------------- TABUADA --------------------");
        System.out.println();
        System.out.print("Qual tabuada você deseja fazer ?: ");
        int tab = entrada.nextInt();
        System.out.println();
        System.out.println("-------------------------------------------------");


        System.out.println("---------- Taduada do " + tab + " ----------");
        for(int i = 1; i < 11; i++){
            System.out.println("| " + tab + " x " + i + " = " + (tab * i));
        }
        System.out.println("----------------------------------");
    }
}
