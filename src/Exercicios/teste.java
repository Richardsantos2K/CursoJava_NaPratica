package Exercicios;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){

        int anonasc;

        int anoatual;

        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");

        anonasc = entrada.nextInt();

        System.out.print("Digite o ano atual: ");

        anoatual = entrada.nextInt();


        idade = anonasc - anoatual;


        System.out.println("Sua idade atual é: " + idade);

    }
}
