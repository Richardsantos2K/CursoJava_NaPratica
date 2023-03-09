package Exercicios;

import java.util.Scanner;


public class IMC {
    public static void main(String[]args){

        double a;

        double kg;

        double IMC;



        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------MEDIDOR DE OBESIDADE------------------");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Dados IMC para saber sua situação corporal: ");
        System.out.println("Menor que 18,5 = abaixo do peso.\n" +
                "Entre 18,5 e 24,9 = peso normal.\n" +
                "Entre 25 e 29,9 = sobrepeso.\n" +
                "Entre 30 e 34,99 = obesidade grau I.\n" +
                "Entre 35 e 39,99 = obesidade grau II (severa).\n" +
                "Acima de 40 = obesidade grau III (mórbida).");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.print("Informe sua altura: ");

        a = entrada.nextDouble();

        System.out.print("Informe seu peso: ");

        kg = entrada.nextDouble();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("---------------------------------------------------------");

        IMC = kg / (a * a) ;

        if( IMC < 18.5 ){
            System.out.println("-----------------Dados da pessoa-----------------");
            System.out.println("Altura: " + a);
            System.out.println("Peso: " + kg);
            System.out.printf("IMC: %.2f", IMC);
            System.out.println();
            System.out.println("Situação: Abaixo do peso");
            System.out.println("-------------------------------------------------");
        } else if (IMC >= 18.5 && IMC <= 24.9 ) {
            System.out.println("-----------------Dados da pessoa-----------------");
            System.out.println("Altura: " + a);
            System.out.println("Peso: " + kg);
            System.out.printf("IMC: %.2f", IMC);
            System.out.println();
            System.out.println("Situação: Peso ideal");
            System.out.println("-------------------------------------------------");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("-----------------Dados da pessoa-----------------");
            System.out.println("Altura: " + a);
            System.out.println("Peso: " + kg);
            System.out.printf("IMC: %.2f", IMC);
            System.out.println();
            System.out.println("Situação: Sobrepeso");
            System.out.println("-------------------------------------------------");
        } else if (IMC >= 30 && IMC <= 34.99) {
            System.out.println("-----------------Dados da pessoa-----------------");
            System.out.println("Altura: " + a);
            System.out.println("Peso: " + kg);
            System.out.printf("IMC: %.2f", IMC);
            System.out.println();
            System.out.println("Situação: Obesidade grau I");
            System.out.println("-------------------------------------------------");
        } else if (IMC >= 35 && IMC <= 39.99) {
            System.out.println("-----------------Dados da pessoa-----------------");
            System.out.println("Altura: " + a);
            System.out.println("Peso: " + kg);
            System.out.printf("IMC: %.2f", IMC);
            System.out.println();
            System.out.println("Situação: Obesidade grau II (severa)");
            System.out.println("-------------------------------------------------");
        }else{
                System.out.println("-----------------Dados da pessoa-----------------");
                System.out.println("Altura: " + a);
                System.out.println("Peso: " + kg);
                System.out.printf("IMC: %.2f", IMC);
                System.out.println();
                System.out.println("Situação: Obesidade grau III (Mórbida)");
                System.out.println("-------------------------------------------------");
        }


    }


}
