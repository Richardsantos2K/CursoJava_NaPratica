package Exercicios;

import java.util.Scanner;

public class LogicaProgramacao {
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();


        System.out.println("------------Informe seu sexo------------");
        System.out.println("1. Feminino");
        System.out.println("2. Masculino");
        System.out.println("----------------------------------------");
        System.out.print("Sexo: ");
        int sexo = entrada.nextInt();

        if(idade > 60){
            if(sexo == 2){
                System.out.println("Masculino");
                System.out.println("Idoso com " + idade + " Anos de Idade do sexo Masculino");

            } else if (sexo == 1) {
                System.out.println("Feminino");
                System.out.println("Idosa com " + idade + " Anos de Idade do sexo Feminino");

            }

        } else if (idade >= 18 && idade < 60) {
            if(sexo == 2){
                System.out.println("Masculino");
                System.out.println("Adulto com " + idade + " Anos de Idade do sexo Masculino");

            } else if (sexo == 1) {
                System.out.println("Feminino");
                System.out.println("Adulta com " + idade + " Anos de Idade do sexo Feminino");
            }


        } else if (idade < 18 && idade >= 13){
            if(sexo == 2){
                System.out.println("Menino");
                System.out.println("Adolecente com " + idade + " Anos de Idade do sexo Masculino");
            } else if (sexo == 1) {
                System.out.println("Menina");
                System.out.println("Adolecente com " + idade + " Anos de Idade do sexo Feminino");
            }


        } else if (idade < 13 || idade == 0) {
            if(sexo == 2){
                System.out.println("Menino");
                System.out.println("Criança com " + idade + " Anos de Idade do sexo Masculino");

            } else if(sexo == 1){
                System.out.println("Menina");
                System.out.println("Criança com " + idade + " Anos de Idade do sexo Feminino");
            }

        }

    }
}
