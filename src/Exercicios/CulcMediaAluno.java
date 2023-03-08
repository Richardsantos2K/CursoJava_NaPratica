package Exercicios;

import java.util.Scanner;

public class CulcMediaAluno {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double m1, m2, m3,m4;

        double media;

        String nome;

        int RA;


        System.out.print("Digite seu nome: ");
        nome = entrada.next();


        System.out.print("Digite seu RA: ");
        RA = entrada.nextInt();



        System.out.println("---------------------ESCOLA MACHADO-----------------------");

        System.out.print("Digite sua 1° nota: ");

        m1 = entrada.nextDouble();

        System.out.print("Digite sua 2° nota: ");

        m2 = entrada.nextDouble();

        System.out.print("Digite sua 3° nota: ");

        m3 = entrada.nextDouble();

        System.out.print("Digite sua 4° nota: ");

        m4 = entrada.nextDouble();

        System.out.println("------------------------------------------------------------");

        media = (m1 + m2 + m3 + m4) / 4;

       if( media < 6){
           System.out.println("----------------MÉDIA----------------");
           System.out.println("Fixa do aluno:");
           System.out.println(" | " + nome + " | " + RA + " | ");
           System.out.println("-------------------------------------");
           System.out.println(nome + ", Sua media é de: " + media);
           System.out.println("-------------------------------------");
           System.out.println("Situação do Aluno: Reprovado");
        } else if(media == 6){
           System.out.println("----------------MÉDIA----------------");
           System.out.println("Fixa do aluno:");
           System.out.println(" | " + nome + " | " + RA + " | ");
           System.out.println("-------------------------------------");
           System.out.println(nome + ", Sua media é de: " + media);
           System.out.println("-------------------------------------");
           System.out.println("Situação do Aluno: Recuperação");
        }else if(media > 6 ){
           System.out.println("----------------MÉDIA----------------");
           System.out.println("Fixa do aluno:");
           System.out.println(" | " + nome + " | " + RA + " | ");
           System.out.println("-------------------------------------");
           System.out.println(nome + ", Sua media é de: " + media);
           System.out.println("-------------------------------------");
           System.out.println("Situação do Aluno: Aprovado");
        }
       }


    }
